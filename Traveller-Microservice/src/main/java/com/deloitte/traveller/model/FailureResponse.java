package com.deloitte.traveller.model;


import com.deloitte.traveller.entity.Traveller;

public class FailureResponse {

	private Traveller travellers;
	private String message ;
	
	
	
	public FailureResponse(Traveller travellers, String message) {
		super();
		this.travellers = travellers;
		this.message = message;
	}
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Traveller getTravellers() {
		return travellers;
	}
	public void seTravellerCustomers(Traveller travellers) {
		this.travellers = travellers;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	} 
	
}
	

