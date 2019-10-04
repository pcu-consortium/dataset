package org.pcu.dataset.ingestion.json.model.visit;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;

@JsonTypeName("item") @JsonTypeInfo(include=As.WRAPPER_OBJECT, use=Id.NAME)
public class Item {

	private Integer id = null;
	private String sku = null;
	private String product_id = null;
	private Double qty = null;
	private Double price= null;
	private Double row_total = null;
	private String label = null;
	private String salesrules = null;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public Double getQty() {
		return qty;
	}
	public void setQty(Double qty) {
		this.qty = qty;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getRow_total() {
		return row_total;
	}
	public void setRow_total(Double vrow_total) {
		this.row_total = vrow_total;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getSalesrules() {
		return salesrules;
	}
	public void setSalesrules(String salesrules) {
		this.salesrules = salesrules;
	}
	
	
	
	
}
