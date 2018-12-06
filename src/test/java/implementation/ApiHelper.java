package implementation;
import extension.GenericError;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import pojo.BasePOJO;

public class ApiHelper {

	
	private Response response;
		public ApiHelper() {
	}

	public void getRequest(){
		RequestSpecification httpRequest = RestAssured.given();
		response = httpRequest.request(io.restassured.http.Method.GET, "/forecast/68178edd59b41dd02113c748afb1b61c/42.3601,-71.0589");
	}
	
	public boolean isContainsTopLevelElements() {
		if(response.getStatusCode()==200) {
		ResponseBody body = response.getBody();
		try{body.as(BasePOJO.class);}catch(Exception e) {throw new GenericError("Don't contain top level elements");}
		return true;}else {return false;}
	}
	
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