package com.clito.ClitoFarm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.clito.ClitoFarm.entity.Buyer;
import com.clito.ClitoFarm.service.BuyerService;

@RestController
public class BuyerController {
	
	
	@Autowired
	BuyerService service;
	
	@GetMapping("/buyer")
	public List<Buyer> getAllUsers(){
		List<Buyer> data=service.getAllObjects();
		return data;
	}
	
}
