package com.deloitte.Hservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotelservices")
public class HserviceController {
	
	    @Autowired
	    private HServiceRepository hotelRepo;
	    
	    @GetMapping("/gethotel")
	    public ResponseEntity<List<Hotel>> getTravellers(){
	      List<Travellers> hotelsList =     travellerRepo.findAll();
	      return new ResponseEntity<List<Travellers>>(travellersList, HttpStatus.OK);
	    }



	   
	    @GetMapping("/get/{tid}")
	    public ResponseEntity<List<Travellers>> getTravellerById(@PathVariable("tid") Integer tid) {
	        List<Travellers> travellerList = travellerRepo.findBytid(tid);
	        return new ResponseEntity<List<Travellers>>(travellerList,HttpStatus.OK);
	    }
	}

