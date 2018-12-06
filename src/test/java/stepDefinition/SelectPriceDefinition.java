package stepDefinition;

import static org.junit.Assert.assertTrue;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Then;
import implementation.SelectPriceHelper;
import pageObjects.SelectPricePageObject;

public class SelectPriceDefinition {

	private WebDriver webDriver;
	private SelectPricePageObject selectPricePageObject;
	private SelectPriceHelper selectPriceHelper;
	
	public SelectPriceDefinition(Hooks hook) {
		// TODO Auto-generated constructor stub
		webDriver=hook.getDriver();
		selectPricePageObject=new SelectPricePageObject(webDriver);
		selectPriceHelper=new SelectPriceHelper(selectPricePageObject);
	}
	
	@Then("^he should be shown the cheapest return ticket from (.*?) to (.*?)$")
	public void cheapestFlightShown(String to,String from) {
		assertTrue(selectPriceHelper.isCheapestFlightDisplayed(to, from));
	}
}
