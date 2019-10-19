package sk.stuba.fiit.zoop.morganShip;

import java.util.Scanner;

public class CptMorgan {
	
	Name name;
	Birthdate birthdate;
	
	public CptMorgan(Name name, Birthdate birthdate) {
		
		this.name = name;
		this.birthdate = birthdate;
	}
	
	public void greet() {
		
		String greeting = "Yo-ho-ho! It's me! " + this.name.getFullName() + "! ";
		greeting += "I was born in " + this.birthdate.getFullBirthdate("dd-mm-yyyy") + "!";
		
		System.out.println(greeting);
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("\\s");
		
		System.out.print("Hey-o! Enter my name: ");
		
		String firstName = scanner.next();
		String middleName = scanner.next();
		String lastName = scanner.next();
		
		CptMorgan cptMorgan = new CptMorgan(
				new Name(firstName, middleName, lastName),
				new Birthdate(13, 12, 1938)
			);
		
		cptMorgan.greet();
		scanner.close();
	}
}
