

public class Utils {
	public static void runLoggers(Logger[] loggers , String message) {//metodu kullanýrken utýlsý newlemek ten kurtardý statýc.
		for(Logger logger : loggers) {
			logger.log(message);
	}

}
}