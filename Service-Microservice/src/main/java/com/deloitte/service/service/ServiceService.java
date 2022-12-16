package com.deloitte.service.service;

import java.util.List;

import com.deloitte.service.entity.Services;

public interface ServiceService {
	public Services getTraveller(Integer tid);
	public List<Services> getTravellers();


}
