package implementation;

import java.lang.reflect.Method;

import extension.GenericError;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import pojo.BasePOJO;

public class ApiHelper {

	
	private Response response;
	public ApiHelper() {
		// TODO Auto-generated constructor stub
	
	}

	public void getRequest(){
		// Specify the base URL to the RESTful web service
		
		       
				// Get the RequestSpecification of the request that you want to sent
				// to the server. The server is specified by the BaseURI that we have
				// specified in the above step.
				RequestSpecification httpRequest = RestAssured.given();
	
				// Make a request to the server by specifying the method Type and the method URL.
				// This will return the Response from the server. Store the response in a variable.
				 response = httpRequest.request(io.restassured.http.Method.GET, "/forecast/68178edd59b41dd02113c748afb1b61c/42.3601,-71.0589");

	}
	
	public boolean isContainsTopLevelElements() {
		if(response.getStatusCode()==200) {
		ResponseBody body = response.getBody();
		try{body.as(BasePOJO.class);}catch(Exception e) {throw new GenericError("Don't contain top level elements");}
		return true;}else {return false;}
	}
				// Now let us print the body of the message to see what response
				// we have recieved from the server
	public boolean isContainsHourlyObject(int size) {
		ResponseBody responseBody = response.getBody();
		if(size==responseBody.as(BasePOJO.class).getHourly().getData().size()) {return true;}
		return false;
	}
	
	public boolean isContainsMinutelyObject(int size) {
		ResponseBody responseBody = response.getBody();
		if(size==responseBody.as(BasePOJO.class).getMinutely().getData().size()) {return true;}
		return false;
	}
				
	public boolean isContainsDailyObject(int size) {
		ResponseBody responseBody = response.getBody();
		if(size==responseBody.as(BasePOJO.class).getDaily().getData().size()) {return true;}
		return false;
	}

}