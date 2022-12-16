package com.deloitte.Hservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.Hservice.entity.Hservice;

public interface HserviceRepository {

	@Repository
	public interface CustomerRepository extends JpaRepository<Hservice,Integer> {
}
}