
public class SignUpOrDelManager {
	
	private Logger[] loggers;

	public SignUpOrDelManager(Logger[] loggers) {
		
		this.loggers = loggers;
	}
	public void add(SignUpOrDelet signUp) {
		System.out.println(signUp.getFirstName() +" " +  signUp.getLastName() + "için kayýt oluþturuldu . "  );
		
		Utils.runLoggers(loggers, signUp.getFirstName());
	}
	public void delete(SignUpOrDelet delet) {
		System.out.println( delet.getFirstName() + " " + delet.getLastName() + "kaydý Silindi" );
		Utils.runLoggers(loggers, delet.getFirstName());
	}

}
