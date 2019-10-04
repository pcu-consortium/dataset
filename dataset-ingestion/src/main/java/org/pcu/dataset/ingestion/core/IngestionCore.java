package org.pcu.dataset.ingestion.core;

import org.pcu.dataset.ingestion.json.model.configuration.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IngestionCore {

	@Autowired
	IngestionUtils ingestionUtils;

	
	public void ingestion(Config config) {
		
		if( config.getElasticSearch() != null && config.getDataset() !=null ) {
			
			if ( config.getDataset().getCustomers() != null ) {
				if (config.getDataset().getCustomers().getIndex()==null) {
					ingestionUtils.index(config.getDataset().getCustomers().getFile(), "customers", "dataset", config.getDataset().getCustomers().getBulkLines(), config.getElasticSearch());
				} else {
					ingestionUtils.index(config.getDataset().getCustomers().getFile(), "customers", config.getDataset().getCustomers().getIndex(), config.getDataset().getCustomers().getBulkLines(), config.getElasticSearch());
				}
			}
			
			if ( config.getDataset().getCategories() != null) {
				if ( config.getDataset().getCategories().getIndex() == null ) {
					ingestionUtils.index(config.getDataset().getCategories().getFile(),"categories", "dataset", config.getDataset().getCategories().getBulkLines(), config.getElasticSearch());
				} else {
					ingestionUtils.index(config.getDataset().getCategories().getFile(),"categories", config.getDataset().getCategories().getIndex(), config.getDataset().getCategories().getBulkLines(), config.getElasticSearch());
				}
			}
			
	
			if ( config.getDataset().getProducts() != null) {
				if ( config.getDataset().getProducts().getIndex() == null) {
					ingestionUtils.index(config.getDataset().getProducts().getFile(), "products", "dataset", config.getDataset().getProducts().getBulkLines(), config.getElasticSearch());
				} else {
					ingestionUtils.index(config.getDataset().getProducts().getFile(), "products", config.getDataset().getProducts().getIndex(), config.getDataset().getProducts().getBulkLines(), config.getElasticSearch());
				}
			}

			if ( config.getDataset().getVisits() != null) {
				if ( config.getDataset().getVisits().getIndex() ==null ) {
					ingestionUtils.index(config.getDataset().getVisits().getFile() , "visits", "dataset", config.getDataset().getVisits().getBulkLines(), config.getElasticSearch());
				} else {
					ingestionUtils.index(config.getDataset().getVisits().getFile() , "visits", config.getDataset().getVisits().getIndex(), config.getDataset().getVisits().getBulkLines(), config.getElasticSearch());
				}
			}
			
		}
		
	}
	
}
