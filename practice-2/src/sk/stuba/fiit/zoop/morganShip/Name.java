package sk.stuba.fiit.zoop.morganShip;

public class Name {
	
	String first;
	String middle;
	String last;
	
	public Name(String first, String middle, String last) {
		
		this.first = first;
		this.middle = middle;
		this.last = last;
	}
	
	public String getFirstName() {
		return this.first;
	}
	
	public String getMiddleName() {
		return this.middle;
	}
	
	public String getLastName() {
		return this.last;
	}
	
	public String getFullName() {
		return this.first + " " + this.middle + " " + this.last;
	}
}
