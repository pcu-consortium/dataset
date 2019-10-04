package org.pcu.dataset.ingestion.json.model.configuration;

public class Dataset {

	
	private DatasetInfo customers = null;
	private DatasetInfo categories = null;
	private DatasetInfo products = null;
	private DatasetInfo visits = null;
	
	public DatasetInfo getCustomers() {
		return customers;
	}
	public void setCustomers(DatasetInfo customers) {
		this.customers = customers;
	}
	public DatasetInfo getCategories() {
		return categories;
	}
	public void setCategories(DatasetInfo categories) {
		this.categories = categories;
	}
	public DatasetInfo getProducts() {
		return products;
	}
	public void setProducts(DatasetInfo products) {
		this.products = products;
	}
	public DatasetInfo getVisits() {
		return visits;
	}
	public void setVisits(DatasetInfo visits) {
		this.visits = visits;
	}
	
	
	
	
	
	
}
