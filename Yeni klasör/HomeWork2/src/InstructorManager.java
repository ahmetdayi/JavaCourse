
public class InstructorManager extends UserManager {
	
	
	public void signUp() {
		System.out.println("Signed up as an instructor.");
	}
	public void addHomeWork(Instructor instructor ) {
		System.out.println(instructor.getFirstName() + " " + instructor.getLastName() + " ( instructor number is " + 
	instructor.getInstructorNumber() + " ) added a new homework. " );
		
		System.out.println("Homework number : " + instructor.getHomeworkNumber()+1);
	}

}
