package com.proyecto.perros.refugioanimal.models;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class AnimalShelterModel {
	public String id;

	public String identityCode;

	public String name;

	public List<String> emails;

	public String province;

	public String locality;

	public String address;

	public List<String> phones;

	public String password;

	public String type;

	public boolean subscribe;

	public List<String> images;

}
