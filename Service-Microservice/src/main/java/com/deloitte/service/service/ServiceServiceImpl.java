package com.deloitte.service.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.service.dao.ServiceRepository;
import com.deloitte.service.entity.Services;
import com.deloitte.service.model.Traveller;


	@Service
	public class ServiceServiceImpl implements ServiceService {
	    
	    @Autowired
	    private ServiceRepository travellerDAO; 



	   @Override
	    public Services getTraveller(Integer tid) {
	        
	        return travellerDAO.findById(tid).get();
	    }



	   @Override
	    public List<Services> getTravellers() {
	        return travellerDAO.findAll();
	    }



	}


