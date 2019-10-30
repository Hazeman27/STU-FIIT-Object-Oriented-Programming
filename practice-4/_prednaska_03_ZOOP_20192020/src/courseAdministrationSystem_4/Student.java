package courseAdministrationSystem_4;

public class Student {
	private int ID; // nestaticka premenná
	private double energia;
	private String firstName;
	private String middleName;
	private  String lastName;
	private int birthDay, birthMonth, birthYear;
	private Poloha p;
	private final static int MINIMUM = 1; // nestatická konštanta
	private static int pocetKreditov = 0; // sataická premenná
	protected final static int MAXIMUM = 100; // statická konštanta

	static int pocitadlo;

	Student(Student s) {
		this.firstName = s.firstName;
		pocitadlo++;
	}

	Student(String firstName, double energia) {
		this.firstName = firstName;
		this.energia = energia;
		pocitadlo++;
	}

	Student(String firstName) {
		this.firstName = firstName;
		pocitadlo++;
	}

	Student() {
		this.firstName="Neuvedené";
		pocitadlo++;
	}

	static int pocetKreditov() {
		return MAXIMUM - MINIMUM;
	}

	public int getID() { // nestatická metóda
		return ID;
	}

	public double getEnergia() {
		return energia;
	}

	public void setEnergia(double energia) {
		this.energia = energia;
	}

	public void setbirthDay(int i) {
		this.birthDay = i;
	}
	
	boolean isBirthDay() {

		return false;
	}

	int numberOfFriends() {
		return 0;
	}

	void giveWarning() {
	}

	void move(Poloha p) {
		System.out.println("...presúvam sa na novú pozíciu/polohu");
	}

	void najedzSa() {

		this.energia++;
	}
	
	void vypis() {
		System.out.println("Volam sa: " + this.firstName);
	}

	public String toString() {
		return "Volam sa: " + this.firstName;
	}
	
	
}
