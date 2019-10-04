package org.pcu.dataset.ingestion.json.model.visit;

import java.util.List;

public class Visit_ {

	private String ip_address = null;
	private String timeStamp = null;
	private Session session = null;
	private Integer store_id = null;
	private Integer site_id = null;
	private Page page = null;
	private Category category = null;
	private Product product = null;
	private PageList pageList = null;
	private List<Filter> filters = null;
	private Customer customer = null;
	private Order order = null;
	private Search search = null;
	
	
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public Session getSession() {
		return session;
	}
	public void setSession(Session session) {
		this.session = session;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public Integer getSite_id() {
		return site_id;
	}
	public void setSite_id(Integer site_id) {
		this.site_id = site_id;
	}
	public Page getPage() {
		return page;
	}
	public void setPage(Page page) {
		this.page = page;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public PageList getPageList() {
		return pageList;
	}
	public void setPageList(PageList pageList) {
		this.pageList = pageList;
	}
	public List<Filter> getFilters() {
		return filters;
	}
	public void setFilters(List<Filter> filters) {
		this.filters = filters;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Search getSearch() {
		return search;
	}
	public void setSearch(Search search) {
		this.search = search;
	}
	
	
	
	
}
