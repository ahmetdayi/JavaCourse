
public class StudentManager extends UserManager {
	
	public void signUp() {
		System.out.println("Signed up as a student.");
	}
	
	public void joinTheSystem(Student student) {
		System.out.println("Welcome " + student.getFirstName() + " " + 
	student.getLastName() +"-"+ student.getStudentNumber() +
				" . You have " + student.getHomeWorkofNumber()+ " homework rignt now.");
	}

}
