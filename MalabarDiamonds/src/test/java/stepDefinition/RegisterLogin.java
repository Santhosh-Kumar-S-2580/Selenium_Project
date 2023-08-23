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
public class RegisterLogin {
  
    
	@Given("User is on Malabar Golds & Diamonds page {string}")
	public void user_is_on_malabar_golds_diamonds_page(String url) {	
		CommonUtils.getInstance().launchUrl(url);
		   System.out.println("Successfully Launched Malabar Golds & Diamonds");
	}
	
	@When("user press the profile")
	public void user_press_the_profile() {
		
		Common_Step_Definition.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		 RegisterPageObjects.getInstance().clkProfileBtn();
	    System.out.println("Profile Button Clicked SuccessFully");
	}

	@When("user click on the Login button")
	public void user_click_on_the_login_button() throws Exception {
		Thread.sleep(5000);
		   LoginPageObjects.getInstance().clkLoginBtn();
		   System.out.println("Login Button Clicked SuccessFully and Navigated to Login Page");
	}
	@When("User enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String username, String password) {
		LoginPageObjects.getInstance().enterLoginEmail(username);
		LoginPageObjects.getInstance().enterLoginPwd(password);
	    System.out.println("UserName Entered as : "+username);
		System.out.println("Password Entered as : "+password);
	}
	@When("User click Login")
	public void user_click_login() {
		LoginPageObjects.getInstance().clkLoginToCtnBtn();
		
		System.out.println("Login Button Clicked successfully");
	}
	@Then("User should be able to login sucessfully and Navigate to User account Page and Verify the user name is displayed with Hi message")
	public void user_should_be_able_to_login_sucessfully_and_navigate_to_user_account_page_and_verify_the_user_name_is_displayed_with_hi_message() {
	   String GreatMsg=LoginPageObjects.getInstance().showLoginGrtMsg();
		System.out.println("Greeting Message : " + GreatMsg);
	    if(GreatMsg.contains("Hi")) {
	    	System.out.println("User Login SuccessFully");
	    	System.out.println("Successfully navigated to User Account Page");
	    	System.out.println("UserName is displayed with Hi message");
	    	CommonUtils.getInstance().AfterScenario();
	    	
	    }
	   
	    
	}

	

}
