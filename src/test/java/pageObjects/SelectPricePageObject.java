package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectPricePageObject extends BasePage {
	
	public SelectPricePageObject(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}
	
	public static final String LOWEST_AMOUNT_LABEL="//div[@class='summary']/descendant::*[@class='summary-curr-only']";
	public static final String LOWEST_AMOUNT_TEXT_LABEL="//div[@class='summary']/descendant::*[@class='details js-summary-holder-content']/h2";
	public static final String FLIGHT_DEST_ARR_LABEL="//*[@class='masthead-dest-title']";
	
	public WebElement getFlightDestinationAirportCode() {
		return getElementListByXpath(FLIGHT_DEST_ARR_LABEL).get(0);
	}
	
	public WebElement getFlightArrivalAirportCode() {
		return getElementListByXpath(FLIGHT_DEST_ARR_LABEL).get(2);
	}
	
	public WebElement getLowestAmount() {
		return getElementByXpath(LOWEST_AMOUNT_LABEL);
	}
	
	public WebElement getLowestAmountText() {
		return getElementByXpath(LOWEST_AMOUNT_TEXT_LABEL);
	}
}
