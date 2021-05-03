
public class BirthYearLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Birthday is logged via e state : " + message);
		
	}

}
