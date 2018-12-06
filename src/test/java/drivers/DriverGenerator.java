package drivers;

import org.openqa.selenium.WebDriver;

public abstract class DriverGenerator{

	protected WebDriver driver;
	public abstract WebDriver createDriver();
	public WebDriver getDriver() {return driver;}
}
