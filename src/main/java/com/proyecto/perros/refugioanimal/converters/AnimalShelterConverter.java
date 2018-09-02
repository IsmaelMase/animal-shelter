package com.proyecto.perros.refugioanimal.converters;

import org.springframework.stereotype.Component;

import com.proyecto.perros.refugioanimal.entities.AnimalShelter;
import com.proyecto.perros.refugioanimal.models.AnimalShelterModel;

@Component("animalShelterConverter")
public class AnimalShelterConverter {

	public AnimalShelterModel converterEntityToModel(AnimalShelter shelter) {
		AnimalShelterModel shelterModel = new AnimalShelterModel();

		if (!shelter.id.equals("")) {
			shelterModel.id = shelter.id;
		}
		if (!shelter.identityCode.equals("")) {
			shelterModel.identityCode = shelter.identityCode;
		}
		shelterModel.name = shelter.name;
		shelterModel.address = shelter.address;
		shelterModel.address = shelter.address;
		shelterModel.emails = shelter.emails;
		shelterModel.phones = shelter.phones;
		shelterModel.password = shelter.password;
		shelterModel.type = shelter.type;
		shelterModel.subscribe = shelter.subscribe;
		shelterModel.images = shelter.images;
		shelterModel.information = shelter.information;

		return shelterModel;
	}

	public AnimalShelter convertModelToEntity(AnimalShelterModel shelterModel) {
		AnimalShelter shelter = new AnimalShelter();

		if (!shelterModel.id.equals("")) {
			shelter.id = shelterModel.id;
		}
		if (!shelterModel.identityCode.equals("")) {
			shelter.identityCode = shelterModel.identityCode;
		}
		shelter.name = shelterModel.name;
		shelter.address = shelterModel.address;
		shelter.address = shelterModel.address;
		shelter.emails = shelterModel.emails;
		shelter.phones = shelterModel.phones;
		shelter.password = shelterModel.password;
		shelter.type = shelterModel.type;
		shelter.subscribe = shelterModel.subscribe;
		shelter.images = shelterModel.images;
		shelter.information = shelterModel.information;

		return shelter;
	}
}
