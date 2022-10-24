package ui;

import java.util.Scanner;

import dol.Students;

public class StudentQuestion {

	Scanner qs = new Scanner (System.in);
	Students s = new Students ();
	
	public Students newClassFormulary() {
		
		System.out.println("");
		s.setFirstName(qs.next());
		
		System.out.println("");
		s.setMiddleName(qs.next());
		
		System.out.println("");
		s.setSurName(qs.next());
		
		System.out.println("");
		s.setSecondSurname(qs.next());
		
		System.out.println("");
		s.setGender(qs.next());
		
		return s;
		
	}
}
