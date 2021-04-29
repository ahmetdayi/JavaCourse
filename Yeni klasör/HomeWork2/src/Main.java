
public class Main {

	public static void main(String[] args) {

		UserManager userManager = new UserManager();
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		

		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setFirstName("Halil");
		instructor.setLastName("Kisaboylu");
		instructor.setInstructorNumber(1234);
		instructor.setHomeWorkGiven(5);
		instructor.getHomeworkNumber();
		
		
		userManager.signUp();
		instructorManager.signUp();
		instructorManager.addHomeWork(instructor);
		
		System.out.println("/----------------------------------------------------");
		System.out.println();
		
		
		Student student = new Student();
		userManager.signUp();
		studentManager.signUp();
		
		student.setId(1);
		student.setFirstName("Muzaffer");
		student.setLastName("Canan");
		student.setStudentNumber(32);
		student.setHomeWorkofNumberTaken(8);
		student.setHomeWorkofNumberDone(2);
		student.setHomeWorkofNumberGiveUp(2);
		student.getHomeWorkofNumber();
		
		studentManager.joinTheSystem(student);
		
		System.out.println("/----------------------------------------------------");
		System.out.println();

		Student student2 = new Student();
		
		userManager.signUp();
		studentManager.signUp();
		
		
		student2.setId(2);
		student2.setFirstName("Ahmet");
		student2.setLastName("Dayi");
		student2.setStudentNumber(60);
		student2.setHomeWorkofNumberTaken(8);
		student2.setHomeWorkofNumberDone(1);
		student2.setHomeWorkofNumberGiveUp(1);
		student2.getHomeWorkofNumber();
		
		studentManager.joinTheSystem(student2);
		
		

		

	

		

	}

}
