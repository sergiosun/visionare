package com.visionare.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.visionare.entities.Client;


public interface ClientRepository extends JpaRepository<Client, Long>{

}
