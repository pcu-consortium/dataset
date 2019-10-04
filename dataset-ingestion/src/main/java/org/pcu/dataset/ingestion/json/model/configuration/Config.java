package org.pcu.dataset.ingestion.json.model.configuration;

public class Config {

	private ElasticSearch elasticSearch = null;
	private Dataset dataset = null;
	
	
	public ElasticSearch getElasticSearch() {
		return elasticSearch;
	}
	public void setElasticSearch(ElasticSearch elasticSearch) {
		this.elasticSearch = elasticSearch;
	}
	public Dataset getDataset() {
		return dataset;
	}
	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}

}
