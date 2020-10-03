package stepDefinitions;
import org.junit.Assert;
import dataProvider.ConfigReader;

import api.pojo.Root;
import apiEngine.EndPoints;
import apiEngine.IApiResponse;
import cucumber.Context;
import io.cucumber.java.en.Given;

public class Steps extends BaseSteps {
	IApiResponse<Root> apiResponse;

	public Steps(Context testContext){
		super(testContext);
	}

	@SuppressWarnings("unchecked")
	@Given("^User Execute Get method for Rates Api for \"([^\"]*)\"$")
	public void getRequest(String route) {
		apiResponse = getEndPoints().getResponse(route);
	}

	@Given("^User check Status Code ([^\"]*)$")
	public void checkStatusCode(int code) {
		Assert.assertEquals("Status code is not matching for past date Rates Api , "+code+" code displayed", code, apiResponse.getStatusCode());
	}

	@Given("^User verify the Date of Rates \"([^\"]*)\"$")
	public void verifyDate(String route) {
		if(route.equals("Latest"))
			Assert.assertTrue(apiResponse.getBody().getDate().equals(getEndPoints().getCurrentDateMinusOne()));
		else if(route.equals("Past"))
			Assert.assertTrue(apiResponse.getBody().getDate().equals(ConfigReader.getInstance().getDateOfRates()));
		else
			Assert.assertTrue(apiResponse.getBody().getDate().equals(getEndPoints().getCurrentDateMinusOne()));
	}

	@Given("^User check response for \"([^\"]*)\"$")
	public void checkResponse(String responseFlag) {
		if(responseFlag.equals("error"))
			Assert.assertEquals("Error Response is not displayed for incomplete url , Response displayed as "+apiResponse.getResponse().asString(), true, apiResponse.getResponse().asString().contains(responseFlag));
		else if(responseFlag.equals("Success")){
			Assert.assertTrue(apiResponse.getBody().getBase()!=null);
			Assert.assertTrue(apiResponse.getBody().getDate()!=null);
			Assert.assertTrue(apiResponse.getBody().getRates()!=null);
		}
	}

}