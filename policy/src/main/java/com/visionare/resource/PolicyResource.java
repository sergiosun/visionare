package com.visionare.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.visionare.entities.Policy;
import com.visionare.services.PolicyService;

@RestController
@RequestMapping(value = "/policys")
public class PolicyResource {

	@Autowired
	private PolicyService service;
	
	@GetMapping(value = "/{numberPolicy}/vehiclePlate/{vehiclePlate}")
	public ResponseEntity<Policy> getPolicy(@PathVariable Long numberPolicy, @PathVariable String vehiclePlate){
		Policy policy = service.getPolicy(0123, 1, "OKL-5549", 990.00);
		return ResponseEntity.ok(policy);
	}
}
