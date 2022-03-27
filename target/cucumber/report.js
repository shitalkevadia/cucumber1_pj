$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/LoginDatafromDB.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios Another login functionality Validation driving the data from mySql database",
  "description": "",
  "id": "techfios-another-login-functionality-validation-driving-the-data-from-mysql-database",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DbLogin"
    }
  ]
});
formatter.before({
  "duration": 4054010000,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User is on techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "TechFiosStepDefinitios.user_is_on_techfios_login_page()"
});
formatter.result({
  "duration": 5288048000,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "User should be able to Login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-another-login-functionality-validation-driving-the-data-from-mysql-database;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@DbScenario1"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enters \"username\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User enters \"password\" from mysql database",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "user clicks on signin button",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User should land on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "username",
      "offset": 13
    }
  ],
  "location": "TechFiosStepDefinitios.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 4115362500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "password",
      "offset": 13
    }
  ],
  "location": "TechFiosStepDefinitios.user_enters_from_mysql_database(String)"
});
formatter.result({
  "duration": 263813600,
  "status": "passed"
});
formatter.match({
  "location": "TechFiosStepDefinitios.user_clicks_on_signin_button()"
});
formatter.result({
  "duration": 5090821200,
  "status": "passed"
});
formatter.match({
  "location": "TechFiosStepDefinitios.user_should_land_on_dashboard_page()"
});
formatter.result({
  "duration": 507410800,
  "status": "passed"
});
formatter.after({
  "duration": 920745900,
  "status": "passed"
});
});