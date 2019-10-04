package org.pcu.dataset.ingestion.json.model.visit;

public class Customer {

	private String id = null;
	private Integer gender = null;
	private String dob = null;
	private Address address = null;

	public Integer getGender() {
		return gender;
	}
	public void setGender(Integer gender) {
		this.gender = gender;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	
}
