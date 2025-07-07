package com.example.assessment;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.assessment.entity.CarOwner;
import com.example.assessment.service.CarService;
import com.example.assessment.service.CustomerService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/api/cars")
public class CarController {
	
	@Autowired
	private CarService carService;
	private CustomerService customerService;
	
	@GetMapping
	public List<CarOwner>getAvailableCars(){
		return carService.getAvailableCars();
	}
	
	@PostMapping("/{id}/lease")
	public ResponseEntity<String>leaseCar(@PathVariable Long id){
		carService.leaseCar(id);
		return ResponseEntity.ok("Car OnLease");	
	}
	
	@PostMapping
	public ResponseEntity<String>carDetails(@PathVariable boolean onLease, boolean onService){
		carService.carDetails(onLease, onService);
		return ResponseEntity.ok("Car History");
	}
	
	@PostMapping("/{id}/leasestatus")
	public ResponseEntity<String>carStatus(@PathVariable double leaseStatus){
		customerService.carStatus(leaseStatus);
		return ResponseEntity.ok("Car Status");
	}
	
	public ResponseEntity<String>admin(@PathVariable Long id){
		carService.admin(id);
		customerService.admin(id);
		return null;
		
	}
	

}
