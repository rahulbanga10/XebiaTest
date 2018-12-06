package implementation;

import junit.framework.Assert;
import pageObjects.SearchFlightPageObject;
import pageObjects.SelectPricePageObject;

public class SelectPriceHelper {
	private SelectPricePageObject selectPricePageObject;

    public SelectPriceHelper(SelectPricePageObject selectPricePageObject) {
        this.selectPricePageObject =selectPricePageObject;
    }
    
    public boolean isCheapestFlightDisplayed(String to,String from) {
    	System.out.println(selectPricePageObject.getFlightArrivalAirportCode().getText());
    	System.out.println(selectPricePageObject.getFlightDestinationAirportCode().getText());
    	System.out.println(selectPricePageObject.getLowestAmountText().getText());
    	if((selectPricePageObject.getFlightArrivalAirportCode().getText().trim().equals(from)&&
    	selectPricePageObject.getFlightDestinationAirportCode().getText().trim().equals(to))&&
    			selectPricePageObject.getLowestAmountText().getText().trim().equals("Lowest price for all passengers")) {
    		return true;
    	}
    	return false;
    }
}
