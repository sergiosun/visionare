package com.visionare.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.visionare.entities.Client;
import com.visionare.repositories.ClientRepository;

@RestController
@RequestMapping(value = "/clients", method = RequestMethod.GET)
public class ClientResource {
	
	@Autowired
	private ClientRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Client>>findAll(){
		List<Client> list = repository.findAll();
		return ResponseEntity.ok(list);	
	}

	
	@GetMapping(value="/{id}")
	public ResponseEntity<Client>findById(@PathVariable Long id) {
		Client obj = repository.findById(id).get();
		return ResponseEntity.ok(obj);
	}
}
