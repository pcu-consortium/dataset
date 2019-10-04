# DATASET - INGESTION

The Dataset Ingestion is a [Spring Boot](https://spring.io/projects/spring-boot) application. It is used to load and modify data from the e-commerce *test* dataset. Once the data has been processed, there are then indexed in [ElasticSearch](https://www.elastic.co/fr/products/elasticsearch).

-----------------------------
### Prerequisites
+ JDK 10/11
+ Maven (maven 3.6.2 used)
+ ElastiSearch (version 7.3.2 used)
-----------------------------
### Configuration
The Dataset Ingestion Service is configured through a configuration file (config_ingestion.json) in JSON format.  

This file is as follow:

```
{
  "elasticSearch" : {
    "hostName" : "localhost",
    "port" : 9200,
    "scheme" : "http"
  },
  "dataset" : {
    "customers" : {
      "file" : "/home/chdor/Projects/PCU/Scenario/dataset/customers.json",
      "bulkLines" : 3000
    },
    "categories" : {
      "file" : "/home/chdor/Projects/PCU/Scenario/dataset/categories.json",
      "index" : "categories",
      "bulkLines" : 3000
    },
    "products" : {
      "file" : "/home/ubuntu/dataset/products.json",
      "index" : "products",
      "bulkLines" : 5000
    },
    "visits" : {
      "file" : "/home/chdor/Projects/PCU/Scenario/dataset/visits-split/visits.aa",
      "bulkLines" : 10000
    }
  }
}
```

- #### elasticSearch
  The **elasticSearch** element ( <span style="color: #fb4141">required</span>) define the information connection to an Elasticsearch Server (or cluster).

  - hostName: The FQDN of the Elasticsearch Server
  - port: The Elasticsearch port to connect 
  - scheme: The protocol used for the connection (you can configure ES to use HTTPS)

- #### Dataset
  This element define the json files to be indexing and have a sub element for each dataset files:
  
  + customers: Define the **customers** JSON file information
  + categories: Define the **categories** JSON file information
  + products: Define the **products** JSON file information
  + visits: Define the **visits** JSON file information
  
  
  They have all the same structure:
  
  - file (<span style="color: #fb4141">required</span>): the file location to be loaded
  - bulkLines (<span style="color: #fb4141">required</span>): The indexation in ElasticSearch is done through BulkInsert mecanism. 
  - index (<span style="color: #4290f5">optionnal</span>): The name of the ElasticSearch index in which to the JSON data will be indexing. By default the data files will be indexing in the indeices: customers, categories, products and visits respectively

-----------------------------
### Compile

```
  mvn clean package
```

After the compilation phase has been successfully, you must have the **ingestion-0.1.jar** file in the **target** direcory under the project directory.

The jar generated is an executable jar including all the needed dependencies. 

-----------------------------
### Run
```
  java -jar ingestion-0.1-SNAPSHOT.jar /home/xxx/PCU/config_ingestion.json
```


-----------------------------
### Execution
The following trace log will be generating during the execution of the service.

```
Start Dataset Ingestion
Arguments: config_ingestion.json
Load Configuration from : config_ingestion.json
##### customers ##### - Bulk Insert (10000 lines per Bulk)
- Number of <customers> to index: 69383
- Number of Bulk Operations: 6
- Remaining <customers> to index: 9383
- Bulk Insert n°1
  -> OK
- Bulk Insert n°2
  -> OK
- Bulk Insert n°3
  -> OK
- Bulk Insert n°4
  -> OK
- Bulk Insert n°5
  -> OK
- Bulk Insert n°6
  -> OK
## customers ## - Remaining to index: 9383
  -> OK
##### categories ##### - Bulk Insert (5000 lines per Bulk)
- Number of <categories> to index: 12417
- Number of Bulk Operations: 2
- Remaining <categories> to index: 2417
- ...

```

### Notes
You can speed the indexation by increase the number of bulklines to _insert_. It's depend of your computer configuration.