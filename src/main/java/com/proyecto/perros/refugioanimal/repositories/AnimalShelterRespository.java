package com.proyecto.perros.refugioanimal.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.perros.refugioanimal.entities.AnimalShelter;

@Repository("animalShelterRepository")
public interface AnimalShelterRespository extends MongoRepository<AnimalShelter, String> {

	public AnimalShelter findByIdentityCode(String cod);
}
