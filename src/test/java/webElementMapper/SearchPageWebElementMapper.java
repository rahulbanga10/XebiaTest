package webElementMapper;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

import pageObjects.SearchFlightPageObject;

public class SearchPageWebElementMapper extends WebElementMapper {

	SearchFlightPageObject searchFlightPage;
	public static final String FROM="from";
	public static final String TO="to";
	public SearchPageWebElementMapper(SearchFlightPageObject searchFlightPage) {
		// TODO Auto-generated constructor stub
		this.searchFlightPage=searchFlightPage;
		elementMap=init();
	}
	@Override
	protected HashMap<String, WebElement> init() {
		// TODO Auto-generated method stub
		HashMap<String,WebElement> map=new HashMap<String,WebElement>();
		map.put(FROM,searchFlightPage.getDepartureAirportLabel());
		map.put(TO,searchFlightPage.getArrivalAirportLabel());
		return map;
	}

}
