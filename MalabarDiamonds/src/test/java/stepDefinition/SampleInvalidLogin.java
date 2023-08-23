package stepDefinition;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import PageObjects.LoginPageObjects;
import CommonUtils.CommonUtils;
import Common_step_def.Common_Step_Definition;
import PageObjects.RegisterPageObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class SampleInvalidLogin {
		
	@Given("User in Malabar Golds & Diamonds page {string}")
	public void user_in_malabar_golds_diamonds_page(String url) {	
		CommonUtils.getInstance().launchUrl(url);
		   System.out.println("Successfully Launched Malabar Golds & Diamonds"); 
	}
	@When("user click the profile")
	public void user_click_the_profile() {
		
		 RegisterPageObjects.getInstance().clkProfileBtn();
	    System.out.println("Profile Button Clicked SuccessFully");
	}
	@When("user press the Login button")
	public void user_press_the_login_button() throws Exception {
		Thread.sleep(5000);
		 LoginPageObjects.getInstance().clkLoginBtn();
		   System.out.println("Login Button Clicked SuccessFully and Navigated to Login Page");
	}
	@When("User type the userName as {string} and Password as {string}")
	public void user_type_the_user_name_as_and_password_as(String username, String password) {
		LoginPageObjects.getInstance().enterLoginEmail(username);
		LoginPageObjects.getInstance().enterLoginPwd(password);
	    System.out.println("UserName Entered as : "+username);
		System.out.println("Password Entered as : "+password);
	}
	@When("User press the Login")
	public void user_press_the_login() {
		LoginPageObjects.getInstance().clkLoginToCtnBtn();
		   System.out.println("Login Button Clicked successfully");
	}
	@Then("User able to see error message {string}")
	public void user_able_to_see_error_message(String errMsg) throws Exception  {
		String Error=LoginPageObjects.getInstance().showLoginErrMsg();
		System.out.println("Error Message : " +Error);
		if(Error.equalsIgnoreCase(errMsg)) {
			System.out.println("User able to see error message");
			Thread.sleep(2000);
			CommonUtils.getInstance().takeScrshot();
			CommonUtils.getInstance().AfterScenario();
			
		}
	}
	
	
	


}
