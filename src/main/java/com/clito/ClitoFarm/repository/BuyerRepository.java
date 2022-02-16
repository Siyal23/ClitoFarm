package com.clito.ClitoFarm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.clito.ClitoFarm.entity.Buyer;

@Repository
public interface BuyerRepository extends JpaRepository<Buyer, Integer> {
	
}
