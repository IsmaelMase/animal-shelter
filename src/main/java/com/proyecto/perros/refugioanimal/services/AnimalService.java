package com.proyecto.perros.refugioanimal.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.proyecto.perros.refugioanimal.models.AnimalModel;

public interface AnimalService {
	public ResponseEntity<AnimalModel> createAnimal(AnimalModel animal);

	public ResponseEntity<AnimalModel> removeAnimal(String idAnimal);

	public ResponseEntity<List<AnimalModel>> findAll();
}
