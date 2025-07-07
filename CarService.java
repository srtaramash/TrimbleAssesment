package com.example.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment.entity.CarOwner;
import com.example.assessment.repository.CarRepository;

@Service
public class CarService {
	
	@Autowired
	private CarRepository carRepo;
	
	public List<CarOwner> getAvailableCars(){
		return carRepo.findByAvailable();
	}
	
	public void leaseCar(Long id) {
		CarOwner car= carRepo.findById(id).orElseThrow();
		car.setAvailableCars(false);
		carRepo.save(car);
	}
	
	public void carDetails(boolean onLease, boolean onService) {
		CarOwner cardetails= (CarOwner) carRepo.findAll();
		cardetails.setOnLease(onLease);
		cardetails.setOnService(onService);
		cardetails.getLeaseamount();
		carRepo.save(cardetails);
	}
	
	public void admin(Long id) {
		leaseCar(id);
		carDetails(false, false);
	}

}
