package stepDefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import CommonUtils.CommonUtils;
import Common_step_def.Common_Step_Definition;
import PageObjects.RegisterPageObjects;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("Launch Url {string}")
	public void launch_url(String url) {
		CommonUtils.getInstance().launchUrl(url);
		System.out.println("Successfully Launched Malabar Golds & Diamonds");
	}
	@When("user click on the profile")
	public void user_click_on_the_profile() {
		 RegisterPageObjects.getInstance().clkProfileBtn();
	    System.out.println("Profile Button Clicked SuccessFully");
	}
	@When("user click on the signUP")
	public void user_click_on_the_sign_up() throws Exception {
	   Thread.sleep(2000);
	   RegisterPageObjects.getInstance().clkSignInBtn();
	   System.out.println("SignIn Button Clicked SuccessFully and Navigated to RegisterPage");
	}
	@When("User Select the salutation as {string} in the dropdown Using {string}")
	public void user_select_the_salutation(String salutationValue, String howTo) {
		CommonUtils.getInstance().selectFromDropDown(RegisterPageObjects.getInstance().getSalutationDD(), howTo, salutationValue);
		//Select select=new Select(RegisterPageObjects.getInstance().getSalutationDD());
		//select.selectByVisibleText("Mr");
		System.out.println("Salutation Selected as "+salutationValue+"Using"+howTo);
	}
	@When("user enters the FirstName as {string} and Lastname as {string}")
	public void user_enters_the_first_name_as_and_lastname_as(String firstname, String lastname) {
		RegisterPageObjects.getInstance().enterProfileFirstname(firstname);
		RegisterPageObjects.getInstance().enterProfileLastName(lastname);
		System.out.println("FirstName Entered as : "+firstname);
		System.out.println("LastName Entered as : "+lastname);
	    
	}
	@When("user enters the Email as {string} and MobileNumber as {string}")
	public void user_enters_the_email_as_and_mobile_number_as(String email, String phno) {
	    RegisterPageObjects.getInstance().enterProfileEmail(email);
	    RegisterPageObjects.getInstance().enterProfileMobile(phno);
	    System.out.println("EmailId Entered as : "+email);
		System.out.println("Mobile NUmber Entered as : "+phno);
	}
	@When("user enters the password as {string} and confirmPassword as {string}")
	public void user_enters_the_password_as_and_confirm_password_as(String pwd, String cpwd) {
	    RegisterPageObjects.getInstance().enterProfilePwd(cpwd);
	    RegisterPageObjects.getInstance().enterProfileCfmPwd(cpwd);
	    System.out.println("Password Entered as : "+pwd);
		System.out.println("ConfirmPassword Entered as : "+cpwd);
	    
	}
	@When("user click on Register")
	public void user_click_on_register() {
	   RegisterPageObjects.getInstance().clkRegisterBtn();
	   System.out.println("Register button Clicked successfully");
	}
	@Then("User should be Register successfully and Navigated to HomePage")
	public void user_should_be_register_successfully_and_navigated_to_home_page() {
		String Success=RegisterPageObjects.getInstance().ProfileSuccessMsg();
		System.out.println("Success Message : "+Success);
	    if(Success.contains("Thank")) {
	    	System.out.println("User should be Register successfully and Navigated to HomePage");
	    	CommonUtils.getInstance().AfterScenario();
	    }
	    else {
	    	System.out.println("User  Registration Failed");
	    	CommonUtils.getInstance().AfterScenario();
	    }
	}

}
