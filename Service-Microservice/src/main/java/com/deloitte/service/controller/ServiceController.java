package com.deloitte.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.service.dao.ServiceRepository;
import com.deloitte.service.entity.Services;

@RestController
	@RequestMapping("/services")
	public class ServiceController {
	    
	    @Autowired
	    private ServiceRepository serviceRepo;
	    
	    @Autowired
	    private RestTemplate restTemplate;
	    
	    @GetMapping("/getservice")
	    public ResponseEntity<List<Services>> getServices(){
	      List<Services> servicesList =serviceRepo.findAll();
	      return new ResponseEntity<List<Services>>(servicesList, HttpStatus.OK);
	    }



	   
	    @GetMapping("/get/{tid}")
	    public ResponseEntity<List<Services>> getOrderById(@PathVariable("tid") Integer tid) {
	        List<Services> serviceList = ServiceRepository.findBytid(tid);
	        return new ResponseEntity<List<Services>>(serviceList,HttpStatus.OK);
	    }
	}

