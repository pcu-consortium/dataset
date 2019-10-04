package org.pcu.dataset.ingestion.json.model.configuration;

public class DatasetInfo {

	private String file = null;
	private String index = null;
	private Long bulkLines = null;
	
	public String getFile() {
		return file;
	}
	public void setFile(String file) {
		this.file = file;
	}
	public String getIndex() {
		return index;
	}
	public void setIndex(String index) {
		this.index = index;
	}
	public Long getBulkLines() {
		return bulkLines;
	}
	public void setBulkLines(Long bulkLines) {
		this.bulkLines = bulkLines;
	}
	
	
	
	
}
