package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private Properties properties;
	private static ConfigReader configReader;

    private ConfigReader() {
		BufferedReader reader;
	    	String propertyFilePath = "configs//Configuration.properties";
	        try {
	            reader = new BufferedReader(new FileReader(propertyFilePath));
	            properties = new Properties();
	            try {
	                properties.load(reader);
	                reader.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
	        }		
	}

    public static ConfigReader getInstance( ) {
    	if(configReader == null) {
    		configReader = new ConfigReader();
    	}
        return configReader;
    }

    public String getBaseUrl() {
        String baseUrl = properties.getProperty("base_url");
        if(baseUrl != null) return baseUrl;
        else throw new RuntimeException("base_Url not specified in the Configuration.properties file.");
    }
    
    public String getIncompleteUrl() {
        String incompleteUrl = properties.getProperty("incomplete_url");
        if(incompleteUrl != null) return incompleteUrl;
        else throw new RuntimeException("incompleteUrl not specified in the Configuration.properties file.");
    }

    public String getDateOfRates() {
        String date = properties.getProperty("date");
        if(date != null) return date;
        else throw new RuntimeException("date not specified in the Configuration.properties file.");
    }
    
    public String getFutureDateOfRates() {
        String date = properties.getProperty("future_date");
        if(date != null) return date;
        else throw new RuntimeException("fdate not specified in the Configuration.properties file.");
    }
    
    public String getLatestRates() {
        String latest = properties.getProperty("latest");
        if(latest != null) return latest;
        else throw new RuntimeException("latest not specified in the Configuration.properties file.");
    }
}