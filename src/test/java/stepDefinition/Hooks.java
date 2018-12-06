package stepDefinition;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.google.common.collect.Maps;

import cucumber.api.java.After;
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
		
		driver=DriverGeneratorFactory.getManager(DriverType.valueOf(System.getProperty("browser").toUpperCase())).createDriver();
		driver.get(System.getProperty("url"));
	}
	
	@Before("@api")
	public void setUPApi() {
		 RestAssured.baseURI = System.getProperty("apiEndPoint");
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public Map<StandarKey,Object> getScenarioResources(){
		return scenarioResources;
	}
	@After("@tag2")
	public void flush() {
		driver.close();
		driver.quit();
	}
}
