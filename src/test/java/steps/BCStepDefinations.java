package steps;

import java.io.IOException;

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

//public class BCStepDefinations extends TestBase {
//	String data;
//	LoginPage loginpage;// intialising globle variable
//	BankAndCash bankAndCash;
////	DatabasePage databasePage;
//
//	@Before
//	public void beforerun() {
//		initDriver(); // Initializing driver
//		loginpage = PageFactory.initElements(driver, LoginPage.class);// defining page object with driver
////		databasePage = new DatabasePage();
//		bankAndCash = PageFactory.initElements(driver, BankAndCash.class);
//	}
//
//	// Given User is on techfios login page
//	@Given("^User is on techfios login page$")
//	public void user_is_on_techfios_login_page() throws InterruptedException {
//		driver.get("https://techfios.com/billing/?ng=login/");
//		Thread.sleep(3000);
//		System.out.println("Given User is on techfios login page");
//	}
//
//	@When("^User enters username as \"([^\"]*)\"$")
//	public void user_enters_username_as_(String username) throws InterruptedException {
//		loginpage.insertUserName(username);// we passing value from feature
//		Thread.sleep(2000);
//
//	}
//
//	@When("^User enters password as \"([^\"]*)\"$")
//	public void user_enters_password_as(String password) throws Throwable {
//		loginpage.insertPassword(password);// we passing value from from feature
//		Thread.sleep(2000);
//
//	}
////	@When("^User clicks on Signin button$")
////	public void user_clicks_on_Signin_button() throws Throwable {
////		loginpage.clickSigninbutton();
////		Thread.sleep(3000);
////	    
////	}
////
////	@Then("^User should land on dashboard page$")
////	public void user_should_land_on_dashboard_page() throws Throwable {
////	    String expectedTitle = "Dashboard- iBilling";// xpath
////        String actualPage = loginpage.getpageTitle();
////		Assert.assertEquals(expectedTitle, actualPage);// validating
////		takeScreenshot(driver);
//
////	}
//
////	@When("^User clicks on \"([^\"]*)\"$")
////	public void user_clicks_on() throws Throwable {
////		loginpage.clickSigninbutton();
////		Thread.sleep(3000);
////	}
////
////	@Then("^User should land on dashboardpage$")
////	public void user_should_land_on_dashboardpage() throws Throwable {
////		String expectedTitle = "Dashboard- iBilling";// xpath
////		String actualPage = loginpage.getpageTitle();
////		Assert.assertEquals(expectedTitle, actualPage);// validating
////		takeScreenshot(driver);
////	}
//	@And("^User clicks on \"([^\"]*)\"$")
//	public void user_clicks_on(String button) throws InterruptedException, IOException {
//		switch (button) {
//		case "Signin":
//			loginpage.clickSigninbutton();
//			Thread.sleep(6000);
//		case "dashboardpage":
//			String expectedTitle = "Dashboard- iBilling";// xpath
//			String actualPage = loginpage.getpageTitle();
//			Assert.assertEquals(expectedTitle, actualPage);// validating
//			takeScreenshot(driver);
////			loginpage.getpageTitle();
////			Thread.sleep(6000);
//		case "Bank & cash":
//			bankAndCash.clicksOnbankAndcash();
//			Thread.sleep(3000);
//			break;
//		case "New Account":
//			bankAndCash.clicksOnNewAccount();
//			Thread.sleep(3000);
//			break;
//		default:
//			System.out.println("unable to click");
//		}
//	}
//
////	@Then("^User clicks on \"([^\"]*)\"$")
////	_clicks_on_Bankandcash() throws Throwable {
////		bankAndCash.clickbankandcash();
////		Thread.sleep(30public void user00);
////		
////	}
////
////	@Then("^User clicks on \"([^\"]*)\"$")
////	public void user_clicks_on_NewAccount() throws Throwable {
////		bankAndCash.clickNewAccount();
////		Thread.sleep(3000);
////	}
//
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
//
//	@And("^User clicks on Submit$")
//	public void USER_clicks_on_Submit() throws InterruptedException {
//		bankAndCash.clickSubmitbutton();
//		Thread.sleep(3000);
//	}
//
//	@Then("^User should be able to validate account created successfully$")
//	public void user_should_be_able_to_validate() throws InterruptedException, IOException {		
//	     Thread.sleep(3000);
//		takeScreenshot(driver);
//	}
//

//	@After
//	public void teardown() {
//		driver.close();
//		driver.quit();
//	
//}
//
//}
