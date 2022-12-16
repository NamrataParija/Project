package com.deloitte.traveller.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.traveller.entity.Traveller;

public class TravellerRepository {


	

	

	@Repository
	public interface CustomerRepository extends JpaRepository<Traveller,Integer> {
		

	}


}
