package org.pcu.dataset.ingestion.json.model.category;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("category") @JsonTypeInfo(include=As.WRAPPER_OBJECT, use=Id.NAME)
public class Category {

	private String id = null; //"27606"
	private String name = null;
	private String parentID = null;
	private String level = null;
	private String position = null;
	private String children_count = null;
	private String path = null;
	private String short_description = null;
	private Integer store_id = null;
	private String url_path_fr = null;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getShort_description() {
		return short_description;
	}
	public void setShort_description(String short_description) {
		this.short_description = short_description;
	}
	public Integer getStore_id() {
		return store_id;
	}
	public void setStore_id(Integer store_id) {
		this.store_id = store_id;
	}
	public String getUrl_path_fr() {
		return url_path_fr;
	}
	public void setUrl_path_fr(String url_path_fr) {
		this.url_path_fr = url_path_fr;
	}
	public String getParentID() {
		return parentID;
	}
	public void setParentID(String parentID) {
		this.parentID = parentID;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getChildren_count() {
		return children_count;
	}
	public void setChildren_count(String children_count) {
		this.children_count = children_count;
	}

	
	
	
}
