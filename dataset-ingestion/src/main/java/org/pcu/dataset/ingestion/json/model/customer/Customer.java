package org.pcu.dataset.ingestion.json.model.customer;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;
import com.fasterxml.jackson.annotation.JsonTypeInfo.Id;
import com.fasterxml.jackson.annotation.JsonTypeName;

@JsonTypeName("customer") @JsonTypeInfo(include=As.WRAPPER_OBJECT, use=Id.NAME)
public class Customer {

	private String customer_id = null;
	private List<Session_vid> session_vids = null;
	private String civility = null;
	private String dob = null;
	private Integer age = null;
	
	public List<Session_vid> getSession_vids() {
		return session_vids;
	}
	public void setSession_vids(List<Session_vid> session_vids) {
		this.session_vids = session_vids;
	}
	public String getCivility() {
		return civility;
	}
	public void setCivility(String civility) {
		this.civility = civility;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public String getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	
	
	
	
	
}
