package com.deloitte.traveller.model;

public class Service {
	private Integer serviceno;
	private String servicename;
	private Integer servicetime;
	public Integer getServiceno() {
		return serviceno;
	}
	public void setServiceno(Integer serviceno) {
		this.serviceno = serviceno;
	}
	public String getServicename() {
		return servicename;
	}
	public void setServicename(String servicename) {
		this.servicename = servicename;
	}
	public Integer getServicetime() {
		return servicetime;
	}
	public void setServicetime(Integer servicetime) {
		this.servicetime = servicetime;
	}
	public Service(Integer serviceno, String servicename, Integer servicetime) {
		super();
		this.serviceno = serviceno;
		this.servicename = servicename;
		this.servicetime = servicetime;
	}
	public Service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
