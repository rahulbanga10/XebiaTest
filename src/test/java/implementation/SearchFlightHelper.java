package implementation;


import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.Iterator;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import extension.GenericError;
import pageObjects.SearchFlightPageObject;

public class SearchFlightHelper {

	 private SearchFlightPageObject searchFlightPageObject;

	    public SearchFlightHelper(SearchFlightPageObject searchFLightPageObject) {
	        this.searchFlightPageObject =searchFLightPageObject;
	    }
	    
	    public void selectDate(String date) {
	    	String day=Integer.parseInt(date.substring(0,2))+"";
	    	String Year=date.substring(date.length()-4,date.length());
	    	String Month=date.substring(2,date.length()-4);
	    	System.out.println(day+Month+Year);
	    	goToFirstEnabledMonth();
	    	for(int i=0;i<12;i++) {
	    	if(Month.equals(getMonth()) && Year.equals(getYear())) {
	    	  selectDay(day);
	    		break;	
	    	}else {goToNextMonth();}
	    	if(i==11) {throw new GenericError("Date Not Found");}
	    	}
	    	
	    }
	    
	    public void selectDay(String Day) {
	    	Iterator iterator = searchFlightPageObject.getActiveDates().iterator();
	    	boolean dateFound=false;
	        while(iterator.hasNext()) {
	           WebElement ele=(WebElement) iterator.next();
	           if(Day.equals(ele.getAttribute("data-date").trim())){
	        	   ele.click();
	        	   dateFound=true;
	        	   break;
	           }
	        }
	    	if(dateFound==false) {throw new GenericError("Date Not FEnabled");}
	    }
	    public void goToFirstEnabledMonth() {
	    	try{
	    		while(true) {
	    		searchFlightPageObject.getPreviousMonthNavigatorButton().click();
	    		}
	    		}catch(Exception e) {
	    			System.out.println("Reach to Current Month");
	    		}
	    }
	    
	    public void goToNextMonth() {
	    	try{
	    		searchFlightPageObject.getNextMonthNavigatorButton().click();
	    		}catch(Exception e) {
	    			System.out.println("Reach to Current Month");
	    		}
	    }
	    
	    public String getMonth() {
	    	return searchFlightPageObject.getPreviousMonthLabel().getText().trim();
	    }
	    
	    public String getYear() {
	    	return searchFlightPageObject.getPreviousYearLabel().getText().trim();
	    }
	    
	    public String getFutureDateFromCurrentDate(int day) {
	    	Formatter fmt = new Formatter();
	        Calendar cal = Calendar.getInstance();
	        cal.add(Calendar.DAY_OF_MONTH,day);
	        
	        fmt = new Formatter();
	        fmt.format("%td%tB%tY", cal, cal, cal);
	        return fmt.toString();
	    }
	    
	    public void setDepartureAirport(String airportCode) {
	     	searchFlightPageObject.getDepartureAirportLabel().click();
	    	searchFlightPageObject.getDepartureAirportLabel().sendKeys(airportCode);
	    	searchFlightPageObject.getDepartureAirportLabel().sendKeys(Keys.TAB);
	    	
	    }
	    public void setArrivalAirport(String airportCode) {
	    	searchFlightPageObject.getArrivalAirportLabel().click();
	    	searchFlightPageObject.getArrivalAirportLabel().sendKeys(airportCode);
	    	searchFlightPageObject.getDepartureAirportLabel().sendKeys(Keys.TAB);
	    }
	    
	    public void selectOneWay() {
	    	searchFlightPageObject.getDepartDatePickerLabel().click();
	    	searchFlightPageObject.getOneWay().click();
	    	searchFlightPageObject.getSearchFlightTab().click();
	    }
	    public void selectFlightType(String type) {
	    	//searchFlightPageObject.get
	    }
	    
	    public String getFutureDateFromString(String leavingDate) {
	    	String date;
	    	switch(leavingDate) {
	    	case "one week":
	    		date=getFutureDateFromCurrentDate(7);
	    		break;
	    	 default:
	    		 throw new GenericError("Date Case not found");
	    	}
	    	return date;
	    }
	    
	    public void selectDepartureDate(String date) {
	    	searchFlightPageObject.getDepartDatePickerLabel().click();
	    	selectDate(date);	
	    }
	    
	    public void selectArrivalDate(String date) {
	    	searchFlightPageObject.getArrivalDatePickerLabel().click();
	    	selectDate(date);	
	    }
	    
	    public void searchFight(String type,String from,String to,String leavingDate) {
	    	setDepartureAirport(from);
	    	setArrivalAirport(to);
	    	if(type.equals("one way")) {selectOneWay();}
	    	selectDepartureDate(getFutureDateFromString(leavingDate));
	    	selectArrivalDate(getFutureDateFromString(leavingDate));
	    	searchFlightPageObject.getSearchFlightSubmitButton().click();
	    	
	    	
	    }
}
