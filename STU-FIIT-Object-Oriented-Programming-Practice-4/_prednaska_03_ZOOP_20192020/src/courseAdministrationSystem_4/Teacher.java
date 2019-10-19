package courseAdministrationSystem_4;

public class Teacher {
	
	Student s;
	
	public void posliStudentaNaErasmus(Student s) {
		System.out.println("...posielam studenta na novu polohu napr. Univesity of ULM");
		s.move(new Poloha());
	}

}
