
public class Student extends User {
	private int studentNumber;
	private int homeWorkofNumberTaken;
	private int homeWorkofNumberDone;
	private int homeWorkofNumber;
	private int homeWorkofNumberGiveUp; 
	
	

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {

		this.studentNumber = studentNumber;
	}

	public int getHomeWorkofNumberTaken() {
		return homeWorkofNumberTaken;
	}

	public void setHomeWorkofNumberTaken(int homeWorkofNumberTaken) {

		if (homeWorkofNumberTaken <= 0) {
			System.out.println("Please enter positive number.");
		}
		else 
			System.out.println("Homeworks was taken automatically from your teachers.");

		this.homeWorkofNumberTaken = homeWorkofNumberTaken;
	}

	public int getHomeWorkofNumberGiveUp() {
		return homeWorkofNumberGiveUp;
	}

	public void setHomeWorkofNumberGiveUp(int homeWorkofNumberGiveUp) {
		this.homeWorkofNumberGiveUp = homeWorkofNumberGiveUp;
	}
	public void setHomeWorkofNumberDone(int homeWorkofNumberDone) {
		this.homeWorkofNumberDone = homeWorkofNumberDone;
	}

	public int getHomeWorkofNumber() {
		return homeWorkofNumberTaken - homeWorkofNumberDone - homeWorkofNumberGiveUp;
	}

	public void setHomeWorkofNumber(int homeWorkofNumber) {
		this.homeWorkofNumber = homeWorkofNumber;
	}

}
