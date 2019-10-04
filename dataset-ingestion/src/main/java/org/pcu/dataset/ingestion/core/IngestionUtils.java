package org.pcu.dataset.ingestion.core;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.pcu.dataset.ingestion.json.model.category.Category;
import org.pcu.dataset.ingestion.json.model.configuration.ElasticSearch;
import org.pcu.dataset.ingestion.json.model.customer.Customer;
import org.pcu.dataset.ingestion.json.model.product.Product;
import org.pcu.dataset.ingestion.json.model.product.Product_;
import org.pcu.dataset.ingestion.json.model.visit.Filter;
import org.pcu.dataset.ingestion.json.model.visit.Order;
import org.pcu.dataset.ingestion.json.model.visit.Page;
import org.pcu.dataset.ingestion.json.model.visit.PageList;
import org.pcu.dataset.ingestion.json.model.visit.Search;
import org.pcu.dataset.ingestion.json.model.visit.Session;
import org.pcu.dataset.ingestion.json.model.visit.Visit;
import org.pcu.dataset.ingestion.json.model.visit.Visit_;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service("IngestionUtils")
public class IngestionUtils {

	private static final Logger logger = LogManager.getLogger(IngestionUtils.class);
	
	
	public long getNbLines(String file) {

		BufferedReader reader =null;
		long nbLines = 0L;
		String line = null;
		
		// Load the Source file
		try {
				reader = new BufferedReader(new FileReader(file));
				
		} catch (FileNotFoundException e) {

			e.printStackTrace();
			return 0;
		}
		
		
		try {
			
			line = reader.readLine();
			
			while (line != null) {
				
				line = reader.readLine();
				nbLines++;
			}
			
			reader.close();
			return nbLines;
			
		} catch (IOException e1) {
			e1.printStackTrace();
			
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
				return 0;
			}
			
			return 0;
		}
	}

	public void index( String file, String type, String index, Long bulkLines, ElasticSearch elasticSearch ) {
		
		BufferedReader reader =null;
		Long nbReadLines = 0L;
		String line = null;
		Object object = null;
		String id = null;
		Long docID = 1L;
		
		long nbLines = getNbLines(file);
		long nbIterations = nbLines / bulkLines;
		long remainingIterations = nbLines % bulkLines;
		
		logger.info("##### "+type+" ##### - Bulk Insert ("+bulkLines+" lines per Bulk)");
		logger.info("- Number of <"+type+"> to index: "+nbLines);
		logger.info("- Number of Bulk Operations: "+nbIterations);
		logger.info("- Remaining <"+type+"> to index: "+remainingIterations);

		
		// Initialize Jackson Serializer / Deserializer 
		ObjectMapper mapper=new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		// Initialize the RestHighLevelClient
		RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost(elasticSearch.getHostName(), elasticSearch.getPort(), elasticSearch.getScheme())));
		
		// Initialize the Bulk API
		BulkRequest bulkRequest = null;
		BulkResponse bulkResponse = null;
		
		// Load the Source file
		try {
				reader = new BufferedReader(new FileReader(file));
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		if( nbIterations > 0)
		{
			for (int i=1;i<=nbIterations;i++)
			{
				nbReadLines = 0L;
				logger.info("- Bulk Insert n°"+i);
				
				bulkRequest = new BulkRequest();
				
				while (nbReadLines<bulkLines)
				{
					try
					{	
						line = reader.readLine();
						nbReadLines++;
						
						if ( type.equals( "products" ) ) {
							Product_ product_ = mapper.readValue(line, Product_.class);
							id = String.valueOf(product_.getId());
							Product_ _product_ = formatProduct(product_);
							Product product = getandSet(_product_);
							line = mapper.writeValueAsString(product);
//							object = mapper.readValue(line, Product.class);
//							id = String.valueOf(((Product)object).getId());
//							line = formatProduct(((Product)object), mapper);
							logger.debug("Product ID: "+id);
						
						} else if ( type.equals( "customers" ) ) {
							Customer customer = mapper.readValue(line, Customer.class);
							customer.setAge(null);
							
							if ( customer.getCivility().equals("M.") || customer.getCivility().equals("SO") || customer.getCivility().equals("%{[session][customer][prefix][0][prefix]}")) {
										customer.setCivility("M");
							}
							
							line = mapper.writeValueAsString(customer); 
							id = String.valueOf(customer.getCustomer_id());
//							object = customer;
//							id = String.valueOf(((Customer)object).getCustomer_id());
							logger.debug("Customer ID: "+id);
						
						} else if ( type.equals( "categories" ) ) {
							object = mapper.readValue(line, Category.class);
							id = String.valueOf(((Category)object).getId());
							logger.debug("Product ID: "+id);
						
						} else if ( type.equals( "visits" ) ) {
							Visit_ visit_ = mapper.readValue(line, Visit_.class);
							Visit visit = new Visit();
							visit.setCategory(visit_.getCategory());
							visit.setCustomer(visit_.getCustomer());
							visit.setFilters(visit_.getFilters());
							visit.setIp_address(visit_.getIp_address());
							visit.setOrder(visit_.getOrder());
							visit.setPage(visit_.getPage());
							visit.setPageList(visit_.getPageList());
							visit.setProduct(visit_.getProduct());
							visit.setSearch(visit_.getSearch());
							visit.setSession(visit_.getSession());
							visit.setTimeStamp(visit_.getTimeStamp());

							line =  mapper.writeValueAsString(visit);
							//System.out.println(line);
							id = String.valueOf(docID++);
							//object = mapper.readValue(line, Visit.class);
							//id = String.valueOf(docID++);
							logger.debug("Product ID: "+id);
						}
						
						bulkRequest.add(new IndexRequest(index).id(id).source(line, XContentType.JSON));
							
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
			    // BulkInsert
				try {
						//logger.info("Bulk Insert Execution");
						bulkResponse = client.bulk(bulkRequest, RequestOptions.DEFAULT);
						
						if (bulkResponse.hasFailures()) {

							for (BulkItemResponse bulkItemResponse : bulkResponse) {
							    if (bulkItemResponse.isFailed()) { 
							        BulkItemResponse.Failure failure = bulkItemResponse.getFailure(); 
							        logger.error("  -> KO: "+failure.getMessage());
							        logger.error("Bulk Insert Exception: "+failure.getCause());
							    }
							}

						}
						else {
							logger.info("  -> OK");
						}
						
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

				
				
			}
			
		} // fin if

		
		// remaining
		if ( remainingIterations > 0 )
		{
			logger.info("## "+type+" ## - Remaining to index: "+remainingIterations);
			bulkRequest = new BulkRequest();
			
			for (int i=1;i<=remainingIterations;i++)
			{
				try {
						line = reader.readLine();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				try {
					if ( type.equals( "products" ) ) {
						Product_ product_ = mapper.readValue(line, Product_.class);
						id = String.valueOf(product_.getId());
						Product_ _product_ = formatProduct(product_);
						Product product = getandSet(_product_);
						line = mapper.writeValueAsString(product);
//						object = mapper.readValue(line, Product.class);
//						id = String.valueOf(((Product)object).getId());
//						line = formatProduct(((Product)object), mapper);
						logger.debug("Product ID: "+id);
					} else if ( type.equals( "customers" ) ) {
						Customer customer = mapper.readValue(line, Customer.class);
						customer.setAge(null);

						if ( customer.getCivility().equals("M.") || customer.getCivility().equals("SO") || customer.getCivility().equals("%{[session][customer][prefix][0][prefix]}")) {
							customer.setCivility("M");
						}
						
						line = mapper.writeValueAsString(customer); 
						id = String.valueOf(customer.getCustomer_id());
//						object = mapper.readValue(line, Customer.class);
//						id = String.valueOf(((Customer)object).getCustomer_id());
						logger.debug("Product ID: "+id);
					} else if ( type.equals( "categories" ) ) {
						object = mapper.readValue(line, Category.class);
						id = String.valueOf(((Category)object).getId());
						logger.debug("Product ID: "+id);
					} else if ( type.equals( "visits" ) ) {
						Visit_ visit_ = mapper.readValue(line, Visit_.class);
						
						Visit visit = new Visit();
						visit.setCategory(visit_.getCategory());
						visit.setCustomer(visit_.getCustomer());
						visit.setFilters(visit_.getFilters());
						visit.setIp_address(visit_.getIp_address());
						visit.setOrder(visit_.getOrder());
						visit.setPage(visit_.getPage());
						visit.setPageList(visit_.getPageList());
						visit.setProduct(visit_.getProduct());
						visit.setSearch(visit_.getSearch());
						visit.setSession(visit_.getSession());
						visit.setTimeStamp(visit_.getTimeStamp());

						line =  mapper.writeValueAsString(visit);
						id = String.valueOf(docID++);
						
//						object = mapper.readValue(line, Visit.class);
//						id = String.valueOf(docID++);
						logger.debug("Product ID: "+id);
					}
					
					bulkRequest.add(new IndexRequest(index).id(id).source(line, XContentType.JSON));
					//logger.info("Product ID: "+product.getId());
						
				} catch (JsonParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (JsonMappingException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
			
			// BulkInsert
			try {
					//logger.info("Execute Bulk Insert");
					bulkResponse = client.bulk(bulkRequest, RequestOptions.DEFAULT);
					
					if (bulkResponse.hasFailures()) {

						for (BulkItemResponse bulkItemResponse : bulkResponse) {
						    if (bulkItemResponse.isFailed()) { 
						        BulkItemResponse.Failure failure = bulkItemResponse.getFailure(); 
						        logger.error("  -> KO: "+failure.getMessage());
						        logger.error("Bulk Insert Exception: "+failure.getCause());
						    }
						}

					}
					else {
						logger.info("  -> OK");
					}
					
					
					
					
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

		
		
		
		// close
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
		// Close the RestHighLevelClient
		try {
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	private static Product getandSet( Product_ product_ ) {
		
		Class<?> classz = product_.getClass();
		//Map<Method,Method> mapOfSetterByGetter = new HashMap<Method, Method>();
		Product product = null;
		Map<String,Method> mapOfSetterByName = new HashMap<String, Method>();
		Map<String,Method> mapOfGetterByName = new HashMap<String, Method>();
		String methodName = null;
		
		
		for (Method method:classz.getMethods()) {
			
			if ( method.getName().startsWith("set")) {
				
				methodName = method.getName().substring(3);
				mapOfSetterByName.put(methodName, method);
				

			} else if ( method.getName().startsWith("get")) {

				methodName = method.getName().substring(3);
				mapOfGetterByName.put(methodName, method);
				
			}

		}
		
		product = new Product();
		Object value = null;
		Method method = null;
		Method newMethod = null;
		ClassInfo classInfo = null;
		
		
		for ( Map.Entry<String,Method> entry:mapOfGetterByName.entrySet()) {
			
			classInfo = Reflect.mapOfClassInfoByClassName.get("product");
			String args = classInfo.getMapOfFieldTypeByFieldName().get(entry.getKey().substring(0, 1).toLowerCase()+entry.getKey().substring(1));
			
			method = entry.getValue();
			
			if ( ! method.getName().equals("getClass")) {

				logger.debug("Method Get: "+method.getName());

				try {
					logger.debug("Method set: "+"set"+entry.getKey());
					logger.debug("Arg class: "+"set"+Class.forName(args)+"\n");

					newMethod = product.getClass().getDeclaredMethod("set"+entry.getKey(), Class.forName(args));
				
				} catch (NoSuchMethodException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SecurityException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				try {
					
					value = method.invoke(product_,null);
					
//					System.out.println("Method Get: "+method.getName());
//					System.out.println("Method Set: "+mapOfSetterByName.get(entry.getKey()));
//					System.out.println("Value: "+value+"\n");

					newMethod.invoke(product, value);
					
					//mapOfSetterByName.get(entry.getKey()).invoke(product, value);
					
					
				} catch (IllegalAccessException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IllegalArgumentException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
			
			
			
		}
		

		
		return product;
		
//		String selField = selectField.substring(selectField.indexOf(".")+1);
//		Method setterMethod = Reflect.getSetter(object.getClass().getName(), selField);
//		Method getterMethod = Reflect.getter(object.getClass().getName(), selField);
//		Object value = null;
//			
//		if( object.getClass().getName().equals("org.pcu.dataset.json.model.customer.Customer")) {
//
//				try {
//					value = getterMethod.invoke(object,null);
//					setterMethod.invoke(newCustomer, value);

		
	}

	
	
	private Product_ formatProduct(Product_ product_ ) {
		
		if ( product_.getRelease_date() !=null  && product_.getRelease_date().contains("00:00:00")) {
			product_.setRelease_date(product_.getRelease_date().substring(0, product_.getRelease_date().indexOf(" ")));
		}

		if ( product_.getVideo_release_date() !=null  && product_.getVideo_release_date().contains("00:00:00")) {
			product_.setVideo_release_date(product_.getVideo_release_date().substring(0, product_.getVideo_release_date().indexOf(" ")));
		}

		return product_;
	}
	
	private String formatProduct(Product product, ObjectMapper mapper ) {
		
		if ( product.getRelease_date() !=null  && product.getRelease_date().contains("00:00:00")) {
			product.setRelease_date(product.getRelease_date().substring(0, product.getRelease_date().indexOf(" ")));
		}

		if ( product.getVideo_release_date() !=null  && product.getVideo_release_date().contains("00:00:00")) {
			product.setVideo_release_date(product.getVideo_release_date().substring(0, product.getVideo_release_date().indexOf(" ")));
		}

		try {
			return mapper.writeValueAsString(product);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

	
	public void load(String sourceFile) {
		
		BufferedReader reader =null;
		String line = null;
		Customer customer = null;
		
		// Load the Source file
		try {
				reader = new BufferedReader(new FileReader(sourceFile));
				
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Initialize 
		ObjectMapper mapper=new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		
		// Read the file line by line and deserialize the Customer JSON
		try {
				while ((line = reader.readLine()) != null) {
					
					customer = mapper.readValue(line, Customer.class);
					System.out.println("Customer ID: "+customer.getCustomer_id());
				}
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	public void retrieveCategories()
	{
		RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));
		
		//String queryString="category.id:\"56777\""; 
		
		//QueryStringQueryBuilder queryStringQueryBuilder = new QueryStringQueryBuilder(queryString);
		//QueryBuilders.simpleQueryStringQuery(queryString);
		
		SearchSourceBuilder sourceBuilder = new SearchSourceBuilder();
		//sourceBuilder.query(queryStringQueryBuilder);
		sourceBuilder.query(QueryBuilders.matchAllQuery());
		sourceBuilder.from(0); 
		sourceBuilder.size(1000); 
		
		SearchRequest searchRequest = new SearchRequest();
		searchRequest.indices("categories");
		searchRequest.source(sourceBuilder);
		
		SearchResponse searchResponse = null;
		
		try {
				searchResponse = client.search(searchRequest, RequestOptions.DEFAULT);
				
				SearchHits hits = searchResponse.getHits();		
				
				SearchHit[] searchHits = hits.getHits();
				
				for (SearchHit hit : searchHits) {
					
					String something = hit.getSourceAsString();
					System.out.println("Hit:\n"+something);
				}
				
				client.close();
				
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void write(String newfile,List<String> data) throws Exception
	{
		// ====================================================================
		// Write the anonymous AccessLog 
		// ====================================================================
		Path fichier=Paths.get(newfile);
	
		if(!Files.exists(fichier, LinkOption.NOFOLLOW_LINKS))
		{
			Files.write(fichier, data, Charset.forName("UTF-8"));
		}
		else
		{
			Files.write(fichier, data, Charset.forName("UTF-8"),StandardOpenOption.APPEND);
		}
	}

	
	
	
	//https://stackoverflow.com/questions/453018/number-of-lines-in-a-file-in-java
	public static int countLinesNew(String filename) throws IOException {
	    InputStream is = new BufferedInputStream(new FileInputStream(filename));
	    try {
	        byte[] c = new byte[1024];

	        int readChars = is.read(c);
	        if (readChars == -1) {
	            // bail out if nothing to read
	            return 0;
	        }

	        // make it easy for the optimizer to tune this loop
	        int count = 0;
	        while (readChars == 1024) {
	            for (int i=0; i<1024;) {
	                if (c[i++] == '\n') {
	                    ++count;
	                }
	            }
	            readChars = is.read(c);
	        }

	        // count remaining characters
	        while (readChars != -1) {
	            System.out.println(readChars);
	            for (int i=0; i<readChars; ++i) {
	                if (c[i] == '\n') {
	                    ++count;
	                }
	            }
	            readChars = is.read(c);
	        }

	        return count == 0 ? 1 : count;
	    } finally {
	        is.close();
	    }
	}

}
