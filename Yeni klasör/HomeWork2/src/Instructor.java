
public class Instructor extends User {
	private int instructorNumber;
	private int homeWorkGiven;
	private int homeworkNumber = 5;

	

	public int getInstructorNumber() {
		return instructorNumber;
	}

	public void setInstructorNumber(int instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

	public int getHomeWorkGiven() {
		return homeWorkGiven + homeworkNumber;
	}

	public void setHomeWorkGiven(int homeWorkGiven) {
		this.homeWorkGiven = homeWorkGiven;
	}

	public int getHomeworkNumber() {
		return homeworkNumber;
	}
}
