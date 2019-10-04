# DATASET - INGESTION

The Dataset Ingestion is a [Spring Boot](https://spring.io/projects/spring-boot) application. It is used to load and modify data from the e-commerce *test* dataset. Once the data has been processed, there are then indexed in [ElasticSearch](https://www.elastic.co/fr/products/elasticsearch).

### Prerequisites
+ JDK 10/11
+ Maven (maven 3.6.2 used)
+ ElastiSearch (version 7.3.2 used)

### Compile

```
  mvn clean package
```

After the compilation phase has been successfully, you must have the **ingestion-0.0.1.jar** file in the **target** direcory under the project directory.

The jar generated is an executable jar including all the needed dependencies. 


### Run
