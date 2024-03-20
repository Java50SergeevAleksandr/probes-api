package telran.probes;

public interface UrlConstants {
	String HOST = "http://localhost";
	String PORT = ":8080/";
	String SENSOR_EMAILS = "sensor/emails";
	String SENSOR_RANGE = "sensor/range";
	String PROBE_ID = "probeId";
	
	static String getCN(Object clazz) {
		return clazz.getClass().getSimpleName();
	}
}
