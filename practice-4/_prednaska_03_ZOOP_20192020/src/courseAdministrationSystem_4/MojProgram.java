package courseAdministrationSystem_4;

public class MojProgram {

	public static void main(String[] args) {
		Student jano = new Student("Jano");
		Student fero = new Student();
		Student peter1 = new Student("Peter", 100);
		//Student dano = new Student(100, 100);
		
		Student peter2 = new Student(peter1);
		//Student peter2 = peter1;
		
		jano.setbirthDay(1);
		//.birthDay = 1;
		//fero.birthDay = 1;
		//lastName="xxx";
		
		jano.vypis();
		System.out.println(jano);
		
		Teacher t =  new Teacher();
		t.posliStudentaNaErasmus(jano);
		
		System.out.println(Student.pocitadlo);
		System.out.println(jano.pocitadlo);
		
		
		
	}
}
