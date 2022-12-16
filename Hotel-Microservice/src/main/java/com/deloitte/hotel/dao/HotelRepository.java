package com.deloitte.hotel.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.hotel.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer>{

	public Hotel findByHotelId(Integer hotelId);

}
