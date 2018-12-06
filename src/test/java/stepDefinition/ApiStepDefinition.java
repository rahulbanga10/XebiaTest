package stepDefinition;

import static org.junit.Assert.assertTrue;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import implementation.ApiHelper;

public class ApiStepDefinition {
	ApiHelper apiObject;
	public ApiStepDefinition() {
		// TODO Auto-generated constructor stub
		apiObject=new ApiHelper();
	}
	@When("^I hit api$")
	public void iHitApi() {
		
		apiObject.getRequest();
	}
	
	@Then("^response contains top level elements$")
	public void containsTopLevelElements() {
		assertTrue(apiObject.isContainsTopLevelElements());
	}
	
	@And("^Hourly object contains (\\d+)$")
	public void hourlyObjectContains(Integer size) {
		assertTrue(apiObject.isContainsHourlyObject(size));
	}
	
	@And("^Minutely object contains (\\d+)$")
	public void minutelyObjectContains(Integer size) {
		assertTrue(apiObject.isContainsMinutelyObject(size));
	}
	
	@And("^Daily object contains (\\d+)$")
	public void dailyObjectContains(Integer size) {
		assertTrue(apiObject.isContainsDailyObject(size));
	}
	
}
