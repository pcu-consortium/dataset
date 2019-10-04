package org.pcu.dataset.ingestion.json.model.visit;

import java.util.List;

public class Order {

	
	private Long id = null;
	private Double sub_total = null;
	private Double discount_total = null;
	private Double shipping_total = null;
    private Double grand_total = null;
    private String shipping_method = null;
    private String payment_method = null;
    private List<Item> items = null;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getSub_total() {
		return sub_total;
	}
	public void setSub_total(Double sub_total) {
		this.sub_total = sub_total;
	}
	public Double getDiscount_total() {
		return discount_total;
	}
	public void setDiscount_total(Double discount_total) {
		this.discount_total = discount_total;
	}
	public Double getShipping_total() {
		return shipping_total;
	}
	public void setShipping_total(Double shipping_total) {
		this.shipping_total = shipping_total;
	}
	public Double getGrand_total() {
		return grand_total;
	}
	public void setGrand_total(Double grand_total) {
		this.grand_total = grand_total;
	}
	public String getShipping_method() {
		return shipping_method;
	}
	public void setShipping_method(String shipping_method) {
		this.shipping_method = shipping_method;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	
}
