package com.proyecto.perros.refugioanimal.repositories;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.perros.refugioanimal.entities.Animal;

@Repository("animalRepository")
public interface AnimalRepository extends MongoRepository<Animal, String> {

	public List<Animal> findBySubscribe(boolean subscribe);

}
