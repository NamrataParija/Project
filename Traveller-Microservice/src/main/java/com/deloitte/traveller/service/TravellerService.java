package com.deloitte.traveller.service;

import java.util.List;

import com.deloitte.traveller.entity.Traveller;



public interface TravellerService {
	
		public Traveller getTraveller(Integer id);
		public List<Traveller> getTravellers();

}
