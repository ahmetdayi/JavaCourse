
public class FirstNameLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("First name is logged via e state : " + message);
		
	}

}
