package org.pcu.dataset.ingestion.json.model.visit;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("filter") @JsonTypeInfo(include=As.WRAPPER_OBJECT, use=Id.NAME)
public class Filter {

	private String name = null;
	private String values = null;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getValues() {
		return values;
	}
	public void setValues(String values) {
		this.values = values;
	}
	
	
	
}
