package dol;

import java.util.Date;

public class Students extends Person {

	private String numeroDeCarnet;
	private String año;
	private String grupo;
	private String aula;
	public Students() {
		super();
	
	}
	public Students(String firstName, String middleName, String surName, String secondSurname, String gender,
			Date birthDate) {
		super(firstName, middleName, surName, secondSurname, gender, birthDate);
		
	}
	
	
	
}
