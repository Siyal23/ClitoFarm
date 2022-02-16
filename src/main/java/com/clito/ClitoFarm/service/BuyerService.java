package com.clito.ClitoFarm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.clito.ClitoFarm.entity.Buyer;
import com.clito.ClitoFarm.repository.BuyerRepository;

@Service	
public class BuyerService {
	
	@Autowired
	BuyerRepository buyerRepo;
	
	public List<Buyer> getAllObjects(){
		List<Buyer> data=buyerRepo.findAll();
		return data;
	}
}
