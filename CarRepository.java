package com.example.assessment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.assessment.entity.CarOwner;

public interface CarRepository extends JpaRepository<CarOwner,Long>{
	List<CarOwner>findByAvailable();
	List<CarOwner>findByHistory();
		
	}
	

