package com.example.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.assessment.entity.CarOwner;
import com.example.assessment.entity.EndCustomer;
import com.example.assessment.repository.CustomerRepository;




@Service
public class CustomerService {
	
	int count;
	@Autowired
	private CustomerRepository customerRepo;
	
	public List<EndCustomer> getAvailableCars(){
		return customerRepo.findByAvailable();
	}
	
	public void carStatus(double leaseStatus) {
		EndCustomer cardetails= (EndCustomer) customerRepo.findAll();
		if (cardetails.equals(null)) {
		cardetails.setLeaseStatus(leaseStatus);
		count++;
		}
		cardetails.getLeaseamount();
		customerRepo.save(cardetails);
	}
	
	public void admin(Long id) {
		carStatus(count);
	}

}
