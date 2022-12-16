package com.deloitte.hotel.model;

import java.util.List;



import com.deloitte.hotel.entity.Hotel;

import jakarta.persistence.criteria.Order;

public class Response {
	private Hotel hotel;
	private List<Traveller> travellersList;
	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Response(Hotel hotel, List<Traveller> travellersList) {
		super();
		this.hotel = hotel;
		this.travellersList = travellersList;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	public List<Traveller> getTravellersList() {
		return travellersList;
	}
	public void setTravellersList(List<Traveller> travellersList) {
		this.travellersList = travellersList;
	}
	
	
	

	
	
}


