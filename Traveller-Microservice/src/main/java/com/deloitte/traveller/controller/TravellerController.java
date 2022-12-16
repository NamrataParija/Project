package com.deloitte.traveller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

import com.deloitte.traveller.entity.Traveller;
import com.deloitte.traveller.model.FailureResponse;
import com.deloitte.traveller.model.Response;
import com.deloitte.traveller.service.TravellerService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;


import jakarta.persistence.criteria.Order;

public class TravellerController {

	
	@Autowired
    private TravellerService travellerService;
	
	
	@Autowired
	private RestTemplate restTemplate;
	
	
	@GetMapping("/get/{id}")
	@HystrixCommand(fallbackMethod= " orderFailureFallback")
	public ResponseEntity<?> getCustomer(@PathVariable("id")Integer id)
	{
		Traveller traveller = travellerService.getTraveller(id);
		
		List<Service> servicesList = restTemplate.getForObject("http://localhost:8082/services/get/"+id,List.class) ;

		Response response  = new Response(traveller, servicesList);
		return new ResponseEntity<Response>(response, HttpStatus.OK);
		
		
	}
	public ResponseEntity<?> orderFailureFallback(@PathVariable("id")Integer id)
	{
		Traveller traveller = travellerService.getTraveller(id);
		FailureResponse response = new FailureResponse(traveller, " Currently order service is down ");

		return new ResponseEntity<FailureResponse>(response, HttpStatus.OK);
			
}
}


