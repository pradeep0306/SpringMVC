package com.projectX.beans;

 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseJsonBean {
	 private String type;
	 private Quote value;
	 
	public ResponseJsonBean(String type, Quote value) {
		super();
		this.type = type;
		this.value = value;
	}
	public ResponseJsonBean() {
		super();
 	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Quote getValue() {
		return value;
	}
	public void setValue(Quote value) {
		this.value = value;
	}
	 
	 
	  	 
	 
}
