package com.projectX.beans;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
 private int id;
 private String quote;
 
public Quote() { 
}
public Quote(int id, String quote) {
	super();
	this.id = id;
	this.quote = quote;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQuote() {
	return quote;
}
public void setQuote(String quote) {
	this.quote = quote;
}
 

}
