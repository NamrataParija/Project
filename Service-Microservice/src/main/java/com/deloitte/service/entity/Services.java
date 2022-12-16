package com.deloitte.service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Services {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer serviceno;
    private String servicename;
    private String servicetype;

public Services() {
    super();
    // TODO Auto-generated constructor stub
}

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

public String getServicetype() {
	return servicetype;
}

public void setServicetype(String servicetype) {
	this.servicetype = servicetype;
}

public Services(Integer serviceno, String servicename, String servicetype) {
	super();
	this.serviceno = serviceno;
	this.servicename = servicename;
	this.servicetype = servicetype;
}

   
}
