package com.proyecto.perros.refugioanimal.entities;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "animals")
public class Animal {

	@Id
	public String id;

	public String name;

	public String breed;

	public String specie;

	public String size;

	public int age;

	public String weight;

	public boolean urgent;

	public boolean dificult;

	public String data;

	public String diseases;

	public List<String> images;

	public boolean state;

}
