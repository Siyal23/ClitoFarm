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
	
	public List<Buyer> getObjectByPassword(String pass){
		List<Buyer> ref=buyerRepo.findByPassword(pass);
		return ref;
	}
	
	public Buyer getObjectByUsernameAndPassword(String uname,String pass){
		Buyer ref=buyerRepo.findByuserNameAndPassword(uname,pass);
		return ref;
	}
}
