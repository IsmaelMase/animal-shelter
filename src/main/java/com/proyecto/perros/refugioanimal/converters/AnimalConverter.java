package com.proyecto.perros.refugioanimal.converters;

import org.springframework.stereotype.Component;

import com.proyecto.perros.refugioanimal.entities.Animal;
import com.proyecto.perros.refugioanimal.models.AnimalModel;

@Component("animalConverter")
public class AnimalConverter {

	public AnimalModel converterEntityToModel(Animal a) {
		AnimalModel am = new AnimalModel();

		if (a.id != null) {
			am.id = a.id;
		}
		am.name = a.name;
		am.breed = a.breed;
		am.specie = a.specie;
		am.age = a.age;
		am.size = a.size;
		am.weight = a.weight;
		am.urgent = a.urgent;
		am.dificult = a.dificult;
		am.data = a.data;
		am.diseases = a.diseases;
		am.images = a.images;
		am.state = a.state;
		am.subscribe = a.subscribe;

		return am;
	}

	public Animal converterModelToEntity(AnimalModel am) {
		Animal a = new Animal();

		if (am.id != null) {
			a.id = am.id;
		}
		a.name = am.name;
		a.breed = am.breed;
		a.specie = am.specie;
		a.age = am.age;
		a.size = am.size;
		a.weight = am.weight;
		a.urgent = am.urgent;
		a.dificult = am.dificult;
		a.data = am.data;
		a.diseases = am.diseases;
		a.images = am.images;
		a.state = am.state;
		a.subscribe = am.subscribe;

		return a;
	}

}
