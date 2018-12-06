package stepDefinition;

import java.util.Map;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import implementation.SearchFlightHelper;
import implementation.StandarKey;
import pageObjects.SearchFlightPageObject;
import webElementMapper.SearchPageWebElementMapper;

public class SearchFlightStepDefinition {

	private WebDriver webDriver;
	private SearchFlightPageObject searchFlightPageObject;
	private SearchFlightHelper searchFlightHelper;
	private Map<StandarKey,Object> scenarios;
	
	public SearchFlightStepDefinition(Hooks hook) {
		// TODO Auto-generated constructor stub
		webDriver=hook.getDriver();
		scenarios=hook.getScenarioResources();
		searchFlightPageObject=new SearchFlightPageObject(webDriver);
		new SearchPageWebElementMapper(searchFlightPageObject);
		searchFlightHelper=new SearchFlightHelper(searchFlightPageObject);
	}
	
	/*@Given("^that Bill has decided to check available flights on (.*?) to (.*?)$")
	public void checkAvailableFlight(String date,String todate) {
		System.out.println(searchFlightHelper.getFutureDateFromCurrentDate(6));
		System.out.println(searchFlightHelper.getFutureDateFromCurrentDate(30));
		searchFlightPageObject.getDepartDatePickerLabel().click();
		searchFlightHelper.selectDate(date);
		searchFlightPageObject.getArrivalDatePickerLabel().click();
		searchFlightHelper.selectDate(todate);
	}*/
	
	@Given("^that Bill has decided to check available flights$")
	public void checkAvailableFlights() {
		searchFlightPageObject.getSearchFlightTab().click();
	}
	
	@When("he looks at a (return trip|one way trip) from (.*?) to (.*?) leaving (one week) from now")
	public void searchFlight(String tripType,String from,String to,String leavingDate) {
		searchFlightHelper.searchFight(tripType, from, to, leavingDate);
		scenarios.put(StandarKey.ARR_AIRPORT,to);
		scenarios.put(StandarKey.DEP_AIRPORT,from);
	}
	

}
