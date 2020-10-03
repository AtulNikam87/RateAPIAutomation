package stepDefinitions;

import apiEngine.EndPoints;
import cucumber.Context;

public class BaseSteps {
    private EndPoints endPoints;

    public BaseSteps(Context testContext) {
    	endPoints = testContext.getEndPoints();
    }

    public EndPoints getEndPoints() {
        return endPoints;
    }
}