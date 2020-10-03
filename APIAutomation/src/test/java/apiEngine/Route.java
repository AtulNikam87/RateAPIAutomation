package apiEngine;
import dataProvider.ConfigReader;

public class Route {

    private static final String PAST_DATE = ConfigReader.getInstance().getDateOfRates();
    private static final String FUTURE_DATE = ConfigReader.getInstance().getFutureDateOfRates();
    private static final String LATEST = ConfigReader.getInstance().getLatestRates();
    
    public static String pastDate(){
    	return PAST_DATE;
    }

    public static String latestRates(){ 
    	return LATEST;
    }

    public static String futureDate(){ 
    	return FUTURE_DATE;
    }
}