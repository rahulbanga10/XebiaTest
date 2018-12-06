package pageObjects;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchFlightPageObject extends BasePage{

	private static final String DEPARTURE_AIRPORT_LABEL="Departure airport";
	private static final String ARRIVAL_AIRPORT_LABEL="Arrival airport";
	private static final String DEPART_DATE_PICKER_LABEL="//*[@id='search-flight-date-picker--depart']/preceding-sibling::label";
	private static final String ARRIVAL_DATE_PICKER_LABEL="search-flight-date-picker--return";
	private static final String PREVIOUS_MONTH_NAVIGATOR_BUTTON="//*[@class='ek-datepicker__button ek-datepicker__button--prev']";
	private static final String NEXT_MONTH_NAVIGATOR_BUTTON="//*[@class='ek-datepicker__button ek-datepicker__button--next']";
	private static final String PREVIOUS_MONTH_LABEL="//div[@class='ek-datepicker__column-label label-month']";
	private static final String PREVIOUS_YEAR_LABEL="//div[@class='ek-datepicker__column-label label-year']";
	private static final String PREVIOUS_MONTH_ACTIVE_DATES_LIST="//*[@class='eol-calendar--visible eol-calendar--top']/descendant::*[contains(@class,'ek-datepicker__button ek-datepicker__button--prev')]/ancestor::div[@class='ek-datepicker__column']/descendant::td[@class='ek-datepicker__day' or @class='ek-datepicker__day ek-datepicker__day--start']";
	private static final String SEARCH_FLIGHT_SUBMIT_BUTTON="//button[contains(@class,'cta cta--large cta--primary js-widget-submit')]";
																			 
	private static final String SEARCH_FLIGHT_TAB="tab0";
	private static final String ONE_WAY="//label[@class='checkbox one-way']";
	
	public SearchFlightPageObject(WebDriver webDriver) {
		super(webDriver);
	}
	
    public WebElement getDepartureAirportLabel() {
    	return getElementByName(DEPARTURE_AIRPORT_LABEL);
    }
    
    public WebElement getArrivalAirportLabel() {
    	return getElementByName(ARRIVAL_AIRPORT_LABEL);
    }
    
    public WebElement getDepartDatePickerLabel() {
    	return getElementByXpath(DEPART_DATE_PICKER_LABEL);
    }
    
    public WebElement getArrivalDatePickerLabel() {
    	return getElementById(ARRIVAL_DATE_PICKER_LABEL);
    }
    
    public WebElement getPreviousMonthNavigatorButton() {
    	return getElementByXpath(PREVIOUS_MONTH_NAVIGATOR_BUTTON);
    }
    
    public WebElement getPreviousMonthLabel() {
    	return getElementByXpath(PREVIOUS_MONTH_LABEL);
    }
    
    public WebElement getPreviousYearLabel() {
    	return getElementByXpath(PREVIOUS_YEAR_LABEL);
    }
    
    public WebElement getNextMonthNavigatorButton() {
    	return getElementByXpath(NEXT_MONTH_NAVIGATOR_BUTTON);
    }
    
    public List<WebElement> getActiveDates() {
    	return getElementListByXpath(PREVIOUS_MONTH_ACTIVE_DATES_LIST);
    }
    
    public WebElement getSearchFlightSubmitButton() {
    	return getElementByXpath(SEARCH_FLIGHT_SUBMIT_BUTTON);
    }
    
    public WebElement getSearchFlightTab() {
    	return getElementById(SEARCH_FLIGHT_TAB);
    }
    
    public WebElement getOneWay() {
    	return getElementByXpath(ONE_WAY);
    }
}
