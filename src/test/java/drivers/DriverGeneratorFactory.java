package drivers;

public class DriverGeneratorFactory {
	static DriverGenerator driverType;
	public static DriverGenerator getManager(DriverType type) {
		switch(type) {
		case CHROME:
			driverType=new ChromeDriverGenerator();
		case FIREFOX:
			;
			
		}
		return driverType;
	}
}
