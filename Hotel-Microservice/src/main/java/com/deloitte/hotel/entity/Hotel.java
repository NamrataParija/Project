package com.deloitte.hotel.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Hotel {
	
	@Id
	@GeneratedValue
	private Integer hotelId;
	private String hname;
	private String hlocation;
	private String htype;
	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getHlocation() {
		return hlocation;
	}
	public void setHlocation(String hlocation) {
		this.hlocation = hlocation;
	}
	public String getHtype() {
		return htype;
	}
	public void setHtype(String htype) {
		this.htype = htype;
	}
	public Hotel(Integer hotelId, String hname, String hlocation, String htype) {
		super();
		this.hotelId = hotelId;
		this.hname = hname;
		this.hlocation = hlocation;
		this.htype = htype;
	}

	
	
}