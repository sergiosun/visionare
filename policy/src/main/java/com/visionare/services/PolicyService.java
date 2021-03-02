package com.visionare.services;

import org.springframework.stereotype.Service;

import com.visionare.entities.Policy;

@Service
public class PolicyService {
	
	public Policy getPolicy(int numberPolicy, long clientId, String vehiclePlate, double policyValue) {
		return new Policy(02221, "Sérgio Bastos", "OKL-5549", 990.00);
	}
}
