@LoginFeature @Sanity
Feature: Techfios login functionality Validation

@TFScenario1
Scenario Outline: 1 User should be able to Login with valid credentials
  Given User is on techfios login page
  When User enters username as "<username>"
  When User enters password as "<password>"
  And User clicks on Signin button
  Then User should land on dashboard page
  
  Examples: 
 |username|password|
 |demo@techfios.com|abc123|
 |demo@techfios.com|abc124|
 |demo2@techfios.com|abc123|
 |demo2@techfios.com|abc124|
   
#@TFScenario2 @Smoke  
#Scenario: 2 User should be able to Login with valid credentials
  #Given User is on techfios login page
  #When User enters username as "demo@techfios.com"
  #When User enters password as "abc124"
  #And User clicks on Signin button
  #Then User should land on dashboard page
  #
#@TFScenario1
#Scenario: 1 User should be able to Login with valid credentials
  #Given User is on techfios login page
  #When User enters username as "demo2@techfios.com"
  #When User enters password as "abc123"
  #And User clicks on Signin button
  #Then User should land on dashboard page
  #
#@TFScenario1
#Scenario: 1 User should be able to Login with valid credentials
  #Given User is on techfios login page
  #When User enters username as "demo2@techfios.com"
  #When User enters password as "abc124"
  #And User clicks on Signin button
  #Then User should land on dashboard page
  