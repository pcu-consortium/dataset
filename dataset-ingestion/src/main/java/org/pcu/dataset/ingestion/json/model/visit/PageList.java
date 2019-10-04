package org.pcu.dataset.ingestion.json.model.visit;

public class PageList {

	private Long pages_count = null;
	private Long products_count = null;
    private Long current_page = null;
    private String sort_order = null;
    private String sort_direction = null;
    private String display_mode = null;
	public Long getPages_count() {
		return pages_count;
	}
	public void setPages_count(Long pages_count) {
		this.pages_count = pages_count;
	}
	public Long getProducts_count() {
		return products_count;
	}
	public void setProducts_count(Long products_count) {
		this.products_count = products_count;
	}
	public Long getCurrent_page() {
		return current_page;
	}
	public void setCurrent_page(Long current_page) {
		this.current_page = current_page;
	}
	public String getSort_order() {
		return sort_order;
	}
	public void setSort_order(String sort_order) {
		this.sort_order = sort_order;
	}
	public String getSort_direction() {
		return sort_direction;
	}
	public void setSort_direction(String sort_direction) {
		this.sort_direction = sort_direction;
	}
	public String getDisplay_mode() {
		return display_mode;
	}
	public void setDisplay_mode(String display_mode) {
		this.display_mode = display_mode;
	}
    
    
	
	
}
