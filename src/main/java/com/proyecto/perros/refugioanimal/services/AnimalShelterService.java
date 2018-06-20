package com.proyecto.perros.refugioanimal.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.proyecto.perros.refugioanimal.models.AnimalShelterModel;

public interface AnimalShelterService {

	public ResponseEntity<AnimalShelterModel> subscribeShelter(AnimalShelterModel shelter);

	public ResponseEntity<AnimalShelterModel> changeSubscribeShelter(String idShelter);

	public ResponseEntity<List<AnimalShelterModel>> findAll();

	public ResponseEntity<AnimalShelterModel> findByIdentityCode(String identityCode);

}
