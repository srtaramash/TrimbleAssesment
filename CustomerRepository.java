package com.example.assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assessment.entity.EndCustomer;


public interface CustomerRepository extends JpaRepository<EndCustomer,Long>{
	List<EndCustomer>findByAvailable();
	List<EndCustomer>findByStatus();
		
	}
