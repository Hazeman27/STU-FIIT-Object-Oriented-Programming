package sk.stuba.fiit.zoop.student;

public class Student {
	
	int id;
	int birthDay, birthMonth, birthYear;
	
	String firstName, middleName, lastName;
	
	boolean isBirthday() {
		return false;
	}
	
	int numberOfFriends() {
		return 74;
	}
	
	void giveWarning() {
		System.out.println("Try harder!");
	}
}
