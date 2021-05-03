
public class LastNameLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Second name is logged via e state : " + message);
		
	}

}
