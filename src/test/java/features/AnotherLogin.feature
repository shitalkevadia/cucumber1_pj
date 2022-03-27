@AnotherLogin @Sanity
Feature: Techfios Another login functionality Validation

Background:
Given User is on techfios login page

@AnotherScenario1 
Scenario: 1 User should not be able to Login with invalid credentials
  Given User is on techfios login page
  When User enters password as "abc123"
  When User enters username as "demo@techfios.com"
  And User clicks on Signin button
  Then User should land on dashboard page
  
@AnotherScenario2 @Smoke
Scenario: 2 User should not be able to Login with invalid credentials
  Given User is on techfios login page
  When User enters username as "demo2@techfios.com"
  When User enters password as "abc123"
  And User clicks on Signin button
  Then User should land on dashboard page
  
@AnotherScenario3
Scenario: 3 User should not be able to Login with invalid credentials
  Given User is on techfios login page
  When User enters username as "demo@techfios.com"
  When User enters password as "abc124"
  And User clicks on Signin button
  Then User should land on dashboard page