package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BankAndCashPage;
import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

public class TechFiosStepDefinitios extends TestBase {
	String data;
	LoginPage loginpage;// intialising globle variable
	BankAndCashPage bankAndCash;
	DatabasePage databasePage;

	@Before
	public void beforerun() {
		initDriver(); // Initializing driver
		loginpage = PageFactory.initElements(driver, LoginPage.class);// defining page object with driver
		databasePage = new DatabasePage();
		bankAndCash = PageFactory.initElements(driver, BankAndCashPage.class);
	}

	// Given User is on techfios login page
	@Given("^User is on techfios login page$")
	public void user_is_on_techfios_login_page() throws InterruptedException {
		driver.get("https://techfios.com/billing/?ng=login/");
		Thread.sleep(3000);
		System.out.println("Given User is on techfios login page");
	}

	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as_(String username) throws InterruptedException {
		loginpage.insertUserName(username);// we passing value from feature
		Thread.sleep(2000);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
		loginpage.insertPassword(password);// we passing value from from feature
		Thread.sleep(2000);
	}
	@When("^user clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
		loginpage.clickSigninbutton();
		Thread.sleep(2000);
	}
	@Then("^User should land on dashboard page$")
	public void user_should_land_on_dashboard_page() throws Throwable {
	    String expectedTitle = "Dashboard- iBilling";// xpath
        String actualPage = loginpage.getpageTitle();
		Assert.assertEquals(expectedTitle, actualPage);// validating
		takeScreenshot(driver);
		System.out.println("User landend on Dashboard page");
	}
	
//	@And ("^User clicks on \"([^\"]*)\"$")
//	public void user_clicks_on(String button) throws InterruptedException {
//		switch(button) {
//		case "Signin":
//			loginpage.clickSignin();
//			Thread.sleep(6000);
//		case "dashboardpage":
//			loginpage.getpageTitle();
//			Thread.sleep(6000);
//		case "Bank & cash":
//			bankAndCash.clicksOnbankAndcash();
//			Thread.sleep(3000);
//			break;
//		case "New Account":
//		    bankAndCash.clicksOnNewAccount();
//		    Thread.sleep(3000);
//		    break;
//		default:
//			System.out.println("unable to click");
//		}	
//	}  

//	@Then("^User enters on \"([^\"]*)\"$")
//	public void user_Enters(String data) throws InterruptedException {
//		switch (data) {
//		case "accountTitle":
//			bankAndCash.enterAccountTitle("accountTitle");
//			Thread.sleep(3000);
//			break;
//		case "description":
//			bankAndCash.insertDiscription("description");
//			break;
//		case "initialBalance":
//			bankAndCash.insertInitialBalance("initialBalance");
//			break;
//		case "accountNumber":
//			bankAndCash.insertAccountNumber(data + generateRandomNumber(999));
//			break;
//		case "contactPerson":
//			bankAndCash.insertContactPerson("contactPerson");
//			break;
//		case "phoneNumber":
//			bankAndCash.insertPhoneNumber("phoneNumber");
//			break;
//		case "internetBankingURL":
//			bankAndCash.insertinternetBankURL("internetBankingURL");
//			break;
//		default:
//			System.out.println("unable to enter data");
//		}
//	}

//	@And("^User clicks on Submit$")
//	public void USER_clicks_on_Submit() throws InterruptedException {
//		bankAndCash.clickSubmitbutton();
//		Thread.sleep(3000);
//	}
//	@Then ("^User should land on \"([^\"]*)\"$")
//    public void user_should_land_on(String accounts) {
//		if(driver.getPageSource().contains("Accounts")) {
//		Assert.assertTrue(true);
//		}
//		else {
//			Assert.assertFalse(false);
//		}
//	}	

//	@Then("^User should be able to validate account created successfully$")
//	public void user_should_be_able_to_validate() throws InterruptedException, IOException {
//		Thread.sleep(3000);
//		takeScreenshot(driver);
//	}

	@When("^User enters \"([^\"]*)\" from mysql database$")
	public void user_enters_from_mysql_database(String data) throws Throwable {
		switch (data) {
		case "username":
			System.out.println("Username from DB: " + databasePage.getData("username"));
			loginpage.insertUserName(databasePage.getData("username"));// first thing we login from loginpage and insurt
																		// data from databasepage
			Thread.sleep(3000); // from database column name that we getting which contains method get data with
								// database url
			break;
		case "password":
			System.out.println("Password from DB: " + databasePage.getData("password"));
			loginpage.insertPassword(databasePage.getData("password"));
			break;
		default:
			System.out.println("unable to enter data");
		}
	}

	@After
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
