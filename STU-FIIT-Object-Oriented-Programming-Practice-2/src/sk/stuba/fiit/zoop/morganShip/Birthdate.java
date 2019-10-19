package sk.stuba.fiit.zoop.morganShip;

public class Birthdate {
	
	int day;
	int month;
	int year;
	
	public Birthdate(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public int getMonth() {
		return this.month;
	}
	
	public int getYear() {
		return this.year;
	}
	
	public String getFullBirthdate(String format) {
		
		String day = Integer.toString(this.day);
		String month = Integer.toString(this.month);
		String year = Integer.toString(this.year);
		
		switch (format) {
		
			case "dd-mm-yyyy":
				return day + "." + month + "." + year; 
			case "mm-dd-yyyy":
				return month + "." + day + "." + year;
			case "yyyy-mm-dd":
				return year + "." + month + "." + day;
			case "yyyy-dd-mm":
				return year + "." + day + "." + month;
			default:
				return "Unknown format";
		}
	}
}
