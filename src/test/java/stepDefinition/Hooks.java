package stepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.google.common.collect.Maps;

import cucumber.api.java.Before;
import drivers.DriverGeneratorFactory;
import drivers.DriverType;
import implementation.StandarKey;

public class Hooks {
	private WebDriver driver;
	private Map<StandarKey, Object> scenarioResources;
	@Before
	public void setUp() {
		scenarioResources=Maps.newHashMap();
		driver=DriverGeneratorFactory.getManager(DriverType.CHROME).createDriver();
		driver.get("https://www.emirates.com/ae/english/");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public Map<StandarKey,Object> getScenarioResources(){
		return scenarioResources;
	}
}
