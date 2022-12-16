package com.deloitte.traveller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.deloitte.traveller.dao.TravellerRepository;
import com.deloitte.traveller.entity.Traveller;

public class TravellerServiceImpl  implements TravellerService {

	
	
	    
	    @Autowired
	    private TravellerRepository travellerDAO; 



	   @Override
	    public Traveller getTraveller(Integer id) {
	        
	        return travellerDAO.findById(id).get();
	    }



	   @Override
	    public List<Traveller> getTravellers() {
	        return travellerDAO.findAll();
	    }


}
