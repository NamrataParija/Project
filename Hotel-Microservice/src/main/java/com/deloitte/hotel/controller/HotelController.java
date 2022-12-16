package com.deloitte.hotel.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.deloitte.hotel.entity.Hotel;
import com.deloitte.hotel.model.FailureResponse;
import com.deloitte.hotel.model.Response;
import com.deloitte.hotel.model.Traveller;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


import jakarta.persistence.criteria.Order;

public class HotelController {

	@Autowired
    private hotelService hotelService;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/get/{id}")
	@HystrixCommand(fallbackMethod= " orderFailureFallback")
	public ResponseEntity<?> getCustomer(@PathVariable("id")Integer id)
	{
		Hotel hotel = hotelService.getHotel(id);
		
		List<Traveller> travellerList = restTemplate.getForObject("http://localhost:8082/orders/get/"+id,List.class);
		
		Response res=new Response(hotel,travellerList);
		return new ResponseEntity<Response>(res, HttpStatus.OK);
		
		
	}
	public ResponseEntity<?> orderFailureFallback(@PathVariable("id")Integer id)
	{
		Hotel hotel = hotelService.getHotel(id);
		FailureResponse response = new FailureResponse(hotel, " Currently Hotel service is down ");

		return new ResponseEntity<FailureResponse>(response, HttpStatus.OK);
			
}
}



