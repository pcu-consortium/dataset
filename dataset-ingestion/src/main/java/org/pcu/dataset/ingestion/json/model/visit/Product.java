package org.pcu.dataset.ingestion.json.model.visit;

public class Product {

	private Long id = null;
	private String label = null;
	//private Long sku = null;
	private String sku = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
//	public Long getSku() {
//		return sku;
//	}
//	public void setSku(Long sku) {
//		this.sku = sku;
//	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	
	
	
	
}
