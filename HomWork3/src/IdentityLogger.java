
public class IdentityLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Identity is logged via e state : " + message);
		
	}

}
