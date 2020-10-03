package cucumber;

import apiEngine.EndPoints;
import dataProvider.ConfigReader;

public class Context {
	
	private EndPoints endPoints;
	
	public Context() {
		endPoints = new EndPoints(ConfigReader.getInstance().getBaseUrl());
	}
	
	 public EndPoints getEndPoints() {
        return endPoints;
    }
}
