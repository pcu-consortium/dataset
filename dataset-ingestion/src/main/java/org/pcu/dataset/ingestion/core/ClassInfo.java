package org.pcu.dataset.ingestion.core;

import java.util.Map;

public class ClassInfo {

	
	private String classz = null;
	Map<String,String> mapOfFieldTypeByFieldName =null;
	
	public String getClassz() {
		return classz;
	}
	public void setClassz(String classz) {
		this.classz = classz;
	}
	public Map<String, String> getMapOfFieldTypeByFieldName() {
		return mapOfFieldTypeByFieldName;
	}
	public void setMapOfFieldTypeByFieldName(Map<String, String> mapOfFieldTypeByFieldName) {
		this.mapOfFieldTypeByFieldName = mapOfFieldTypeByFieldName;
	}
	
	
}
