package com.deloitte.hotel.service;




import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.hotel.dao.HotelRepository;
import com.deloitte.hotel.entity.Hotel;




	@Service
	public class HotelServiceImpl implements HotelService {
	    @Autowired
	    private HotelRepository HotelDAO; 



	   @Override
	    public Hotel getHotel(Integer id) {
	        return HotelDAO.findById(id).get();
	    }



	   @Override
	    public List<Hotel> gethotels() {
	        return HotelDAO.findAll();
	    }



	@Override
	public List<Hotel> getHotels() {
		// TODO Auto-generated method stub
		return null;
	}



	}


