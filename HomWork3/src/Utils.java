

public class Utils {
	public static void runLoggers(Logger[] loggers , String message) {//metodu kullan�rken ut�ls� newlemek ten kurtard� stat�c.
		for(Logger logger : loggers) {
			logger.log(message);
	}

}
}