package com.clito.ClitoFarm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.clito.ClitoFarm.entity.Buyer;
import com.clito.ClitoFarm.service.BuyerService;


@RestController
public class BuyerController {
	
	
	@Autowired
	BuyerService service;
	
	
	@GetMapping("/home")
	public void home(HttpServletResponse response) {
		try {
			response.sendRedirect("/home.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@PostMapping("/home/login")
	public ModelAndView checkUser(@RequestParam("uname") String uname,@RequestParam("pass") String pass) {	
		
		ModelAndView modelAndView=new ModelAndView("welcome");
		Buyer result=service.getObjectByUsernameAndPassword(uname, pass);
		System.out.println(result);
		
		/*if(uname.equals(result.getUserName()) {
			modelAndView = new ModelAndView("welcome");
		}
		else {
			modelAndView=new ModelAndView("/home.html");
		}
		*/
		return modelAndView;
	}
	
	@PostMapping("/addUser")
	public void addUser(HttpServletResponse response) {
		try {
			response.sendRedirect("/home.html");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
