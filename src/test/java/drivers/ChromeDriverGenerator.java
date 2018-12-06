package drivers;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ChromeDriverGenerator extends DriverGenerator{
    
	private DesiredCapabilities desiredCapabilities;
	public ChromeDriverGenerator() {
		// TODO Auto-generated constructor stub
		System.setProperty("webdriver.chrome.driver", "src/test/resource/chromedriver_win32/chromedriver.exe");
		desiredCapabilities=new DesiredCapabilities();
	}
	
	@Override
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		if(driver==null) {
		driver= new ChromeDriver(desiredCapabilities);
		driver.manage().window().setSize(new Dimension(1500, 1900));
		}
		return driver;
	}

}
