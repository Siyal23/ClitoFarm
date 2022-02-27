package com.clito.ClitoFarm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clito.ClitoFarm.entity.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
	public List<Buyer> findByPassword(String value);
	public Buyer findByuserNameAndPassword(String uname,String pass);
	
	
}
