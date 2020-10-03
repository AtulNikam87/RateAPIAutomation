#Author: Atul.Nikam@sysnechron.com

@Regression
Feature: End to End Rates API Automation
#Verify Rate Api when Past Date is provided along with base url
  @RateApi_PastDate
  Scenario Outline: Verify Rates API for Past Date
    Given User Execute Get method for Rates Api for "Past Date"
    When User check Status Code <Status Code>
    Then User verify the Date of Rates "Past"
    Then User check response for "Success"

    Examples: 
     |Status Code | 
     |200         |
     
#Verify Rate Api when Latest is provided along with base url
  @RateApi_LatestDate
  Scenario Outline: Verify Rates API for Latest Date
    Given User Execute Get method for Rates Api for "Latest Date"
    When User check Status Code <Status Code>
    Then User verify the Date of Rates "Latest"
    Then User check response for "Success"

    Examples: 
     |Status Code | 
     |200         |
     
#Verify Rate Api when Future Date is provided along with base url     
  @RateApi_FutureDate
  Scenario Outline: Verify Rates API for Future Date
    Given User Execute Get method for Rates Api for "Future Date"
    When User check Status Code <Status Code>
    Then User verify the Date of Rates "Future"
    Then User check response for "Success"

    Examples: 
     |Status Code | 
     |200         |
     
#Verify Rate Api when Incomplte Url is provided at Get method
  @RateApi_Incomplete
  Scenario Outline: Verify Rates API for Incomplete Service Url
    Given User Execute Get method for Rates Api for "Incomplete Url"
    When User check Status Code <Status Code>
    Then User check response for "error"

    Examples: 
     |Status Code | 
     |400         |
