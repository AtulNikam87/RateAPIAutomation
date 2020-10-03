package apiEngine;

import api.pojo.Rates;
import api.pojo.Root;
import io.restassured.response.Response;

public interface IApiResponse <T>{

	 public T getBody();
	 
	 public String getContent();
	 
	 public int getStatusCode();
	 
	 public boolean isSuccessful();
	 
	 public String getStatusDescription();
	 
	 public Response getResponse();
	 
	 public Exception getException();
	 
		/*
		 * public String getBase();
		 * 
		 * public String getDate();
		 */
}
