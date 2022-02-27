package com.clito.ClitoFarm.entity;

import org.springframework.beans.factory.annotation.Autowired;

import com.clito.ClitoFarm.repository.BuyerRepository;



public class ValidateBuyer {
	

	@Autowired
	BuyerRepository buyerRepo;
	
	public boolean isValid(String uname,String pass) {
			boolean ref=false;
			if(buyerRepo.findByuserNameAndPassword(uname,pass)) {
				ref=true;
			}
			else {
				ref=false;
			}
		
			return ref;
	
	}
}
