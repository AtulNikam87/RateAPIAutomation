package apiEngine;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import api.pojo.Root;
import io.restassured.RestAssured;
import apiEngine.Route;
import io.restassured.specification.RequestSpecification;

public class EndPoints{

	public static String symbolRate;
	private final RequestSpecification request;
//Constructor of Endpoints which builds the request
	public EndPoints(String baseUrl) {
		RestAssured.baseURI = baseUrl;
		request = RestAssured.given();
		request.header("Content-Type", "application/json");
	}

//It returns response of get request for API routes
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public IApiResponse getResponse(String route) {
		if(route.equals("Latest Date"))
			return new ApiResponse(Root.class , request.get(Route.latestRates()));
		else if(route.equals("Past Date"))
			return new ApiResponse(Root.class , request.get(Route.pastDate()));
		else if(route.equals("Future Date"))
			return new ApiResponse(Root.class , request.get(Route.futureDate()));
		else
			return new ApiResponse(Root.class , request.get());
	}
	
//It returns current date minus one day
	public String getCurrentDateMinusOne() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		dateFormat.format(date);
		Calendar calender = Calendar.getInstance();
		calender.add(Calendar.DATE, -1);
		Date currentDatePlusOne = calender.getTime();
		return dateFormat.format(currentDatePlusOne);
		
	}
}
