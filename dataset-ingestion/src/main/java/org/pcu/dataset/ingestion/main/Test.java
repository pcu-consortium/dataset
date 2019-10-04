package org.pcu.dataset.ingestion.main;

import java.io.IOException;

import org.apache.http.HttpHost;
import org.elasticsearch.action.admin.indices.delete.DeleteIndexRequest;
import org.elasticsearch.action.support.master.AcknowledgedResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.client.indices.CreateIndexRequest;
import org.elasticsearch.client.indices.CreateIndexResponse;
import org.pcu.dataset.ingestion.json.model.visit.Address;
import org.pcu.dataset.ingestion.json.model.visit.Customer;
import org.pcu.dataset.ingestion.json.model.visit.Visit;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String index ="dataset";
		
		createIndex(index);
		//deleteIndex(index);

		//genVisit();
	}

	public static void createIndex(String index) {
		
		RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));
		CreateIndexRequest createIndexRequest = new CreateIndexRequest(index);
		
		try {
			CreateIndexResponse createIndexResponse = client.indices().create(createIndexRequest, RequestOptions.DEFAULT);
			System.out.println("Create Index: "+index+" -> "+createIndexResponse.isAcknowledged());
			
			client.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	public static void deleteIndex(String index) {

		RestHighLevelClient client = new RestHighLevelClient(RestClient.builder(new HttpHost("localhost", 9200, "http")));
		DeleteIndexRequest request = new DeleteIndexRequest(index);
		
		try {
			
			AcknowledgedResponse deleteIndexResponse = client.indices().delete(request, RequestOptions.DEFAULT);
			boolean acknowledged = deleteIndexResponse.isAcknowledged();
			System.out.println("Delete Index: "+index+" -> "+acknowledged);
			
			client.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void genVisit() {
		Visit visit = new Visit();
		visit.setIp_address("143.39.205.224");
		
		Address address = new Address();
		address.setCity("LE BOUSCAT");
		address.setCountry("FR");
		address.setPostcode("33110");
		address.setRegion("Ain");
		
		Customer customer = new Customer();
		customer.setAddress(address);
		customer.setId("00000003");
		
		visit.setCustomer(customer);
		
		ObjectMapper mapper=new ObjectMapper();
		mapper.setSerializationInclusion(Include.NON_NULL);
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		String json=null;
		try {
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(visit);
			System.out.println(json);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
}
