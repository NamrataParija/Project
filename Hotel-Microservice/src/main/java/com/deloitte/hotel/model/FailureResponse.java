package com.deloitte.hotel.model;


import com.deloitte.hotel.entity.Hotel;

public class FailureResponse {
	private Hotel hotels;
	private String message ;
	
	
	
	public FailureResponse(Hotel hotel, String message) {
		super();
		this.hotels = hotels;
		this.message = message;
	}
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Hotel gethotels() {
		return hotels;
	}
	public void setHotels(Hotel hotels) {
		this.hotels = hotels;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	} 
	
}
	
	



