package stepDefinition;

import CommonUtils.CommonUtils;
import PageObjects.RegisterPageObjects;
import PageObjects.UserAccountPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateProfile {
	
	
	@Given("User go to Malabar Golds & Diamonds page {string}")
	public void user_go_to_malabar_golds_diamonds_page(String url) {
		 CommonUtils.getInstance().launchUrl(url);
		 System.out.println("Successfully Launched Malabar Golds & Diamonds");
	}

		@When("user can Login with valid credentials")
	public void user_can_login_with_valid_credentials() throws Exception {
	    CommonUtils.getInstance().login();
	}
	@When("user click on the Edit button")
	public void user_click_on_the_edit_button() {
	    UserAccountPageObjects.getInstance().clkEditBtn();
	    System.out.println("Edit Button Clicked Successfully");
	}
	@When("User choose the salutation as {string} in the dropdown Using {string}")
	public void user_choose_the_salutation_as_in_the_dropdown_using(String salutationValue, String howTo) {
		CommonUtils.getInstance().selectFromDropDown(RegisterPageObjects.getInstance().getSalutationDD(), howTo, salutationValue);
		System.out.println("Salutation Selected as "+salutationValue+"Using"+howTo);
	}
	@When("User enter the FirstName as {string}")
	public void user_enter_the_first_name_as(String fname) {
		UserAccountPageObjects.getInstance().enterProfileUpdateFirstname(fname);
		System.out.println("FirstName Entered & Updated as : "+fname);
	}
	@When("User enter the LastName as {string}")
	public void user_enter_the_last_name_as(String lname) {
		UserAccountPageObjects.getInstance().enterProfileUpdateLastName(lname);;
		System.out.println("LastName Entered & Updated as : "+lname);
	}
	@When("User enter the PhoneNumber as {string}")
	public void user_enter_the_phone_number_as(String phno) {
		UserAccountPageObjects.getInstance().enterProfileUpdateMobile(phno);
		System.out.println("Mobile NUmber Entered & Updated as : "+phno);
	}
	@When("User choose the Gender")
	public void user_choose_the_gender() {
	    UserAccountPageObjects.getInstance().selectGender();
	    System.out.println("Gender Selected As Male");
	}
	@When("User enter the Pincode as {string}")
	public void user_enter_the_pincode_as(String pincode) {
		UserAccountPageObjects.getInstance().enterProfilePincode(pincode);
		System.out.println("Pincode Entered & Updated as : "+pincode);
	}
	@When("User Select the DOB as {string}")
	public void user_select_the_dob_as(String date) {
	    UserAccountPageObjects.getInstance().enterProfileDob(date);
	    System.out.println("DateOfBirth Entered & Updated as : "+date);
	}
	@When("User choose the Relationship Status")
	public void user_choose_the_relationship_status() {
		 UserAccountPageObjects.getInstance().selectRelationStatus();
		 System.out.println("Relationship Status selected As Single");
	}
	@When("Click on SaveProfileButton")
	public void click_on_save_profile_button() {
		UserAccountPageObjects.getInstance().clkSaveProfileBtn();
		System.out.println("Save Profile Button Clicked Successfully");
	}
	@Then("User Profile Updated SuccessFully")
	public void user_profile_updated_success_fully() {
		System.out.println("User Profile Updated Successfully");
		CommonUtils.getInstance().AfterScenario();
	}
	

	/*
	 * @When("user Login with valid credentials") public void
	 * user_login_with_valid_credentials() { // Write code here that turns the
	 * phrase above into concrete actions throw new
	 * io.cucumber.java.PendingException(); }
	 */







}
