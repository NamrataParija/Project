package com.deloitte.traveller.model;

import java.util.List;

import com.deloitte.traveller.entity.Traveller;

public class Response {
	private Traveller traveller;
	private List<Service> services;
	private List<Service> services1;
	public Response() {
		super();

	}
	
	

	public List<Service> getServices1() {
		return services1;
	}



	public void setServices1(List<Service> services1) {
		this.services1 = services1;
	}



	public Response(Traveller traveller, List<Service> services, List<Service> services1) {
		super();
		this.traveller = traveller;
		this.services = services;
		this.services1 = services1;
	}



	public Traveller getTraveller() {
		return traveller;
	}
	public void setTraveller(Traveller traveller) {
		this.traveller = traveller;
	}
	public List<Service> getServices() {
		return services;
	}
	public void setServices(List<Service> services) {
		this.services = services;
	}

	
	
}



