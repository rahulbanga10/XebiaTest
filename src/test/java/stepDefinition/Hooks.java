package stepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.google.common.collect.Maps;

import cucumber.api.java.Before;
import drivers.DriverGeneratorFactory;
import drivers.DriverType;
import implementation.StandarKey;
import io.restassured.RestAssured;

public class Hooks {
	private WebDriver driver;
	private Map<StandarKey, Object> scenarioResources;
	@Before("@tag2")
	public void setUp() {
		scenarioResources=Maps.newHashMap();
		driver=DriverGeneratorFactory.getManager(DriverType.CHROME).createDriver();
		driver.get("https://www.emirates.com/ae/english/");
	}
	
	@Before("@api")
	public void setUPApi() {
		 RestAssured.baseURI = "https://api.darksky.net";
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public Map<StandarKey,Object> getScenarioResources(){
		return scenarioResources;
	}
}
