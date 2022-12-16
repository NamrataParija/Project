package com.deloitte.service.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.service.entity.Services;

		@Repository
	public interface ServiceRepository extends JpaRepository<Services,Integer> {
		

	public List<Services> findAll();
	public static List<Services> findBytid(Integer tid) {
		// TODO Auto-generated method stub
		return null;
	}

	}


