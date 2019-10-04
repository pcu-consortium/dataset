package org.pcu.dataset.ingestion.json.model.visit;

import java.util.List;

public class Page {

	private String url = null;
	private String referrer_url = null;
	private String timeStamp = null;
	private String type_identifier = null;
	private String type_label = null;
	
	private List<KeyValue> pageU_keyValues = null; 
	private List<KeyValue> pageR_keyValues = null; 
	
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getReferrer_url() {
		return referrer_url;
	}
	public void setReferrer_url(String referrer_url) {
		this.referrer_url = referrer_url;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getType_identifier() {
		return type_identifier;
	}
	public void setType_identifier(String type_identifier) {
		this.type_identifier = type_identifier;
	}
	public String getType_label() {
		return type_label;
	}
	public void setType_label(String type_label) {
		this.type_label = type_label;
	}
	public List<KeyValue> getPageU_keyValues() {
		return pageU_keyValues;
	}
	public void setPageU_keyValues(List<KeyValue> pageU_keyValues) {
		this.pageU_keyValues = pageU_keyValues;
	}
	public List<KeyValue> getPageR_keyValues() {
		return pageR_keyValues;
	}
	public void setPageR_keyValues(List<KeyValue> pageR_keyValues) {
		this.pageR_keyValues = pageR_keyValues;
	}

	
	
	
	
}
