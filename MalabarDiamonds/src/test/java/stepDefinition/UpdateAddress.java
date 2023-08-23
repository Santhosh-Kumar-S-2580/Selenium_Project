package stepDefinition;

import CommonUtils.CommonUtils;
import PageObjects.UserAccountPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UpdateAddress {

	
	@Given("User go  Malabar Golds & Diamonds page {string}")
	public void user_go_malabar_golds_diamonds_page(String url) {
		CommonUtils.getInstance().launchUrl(url);
		 System.out.println("Successfully Launched Malabar Golds & Diamonds");
	    
	}
	@When("user Login with valid credentials")
	public void user_login_with_valid_credentials() throws Exception {
	    CommonUtils.getInstance().login();
	}
	@When("user click on the My Address tab")
	public void user_click_on_the_my_address_tab() {
		UserAccountPageObjects.getInstance().clkAddressTab();
		System.out.println("Address tab clicked Successfully & navigated to Address Edit Page");
	}
	@When("User type the Address as {string}")
	public void user_type_the_address_as(String addr) {
		UserAccountPageObjects.getInstance().enterAddress(addr);
		System.out.println("Address Entered & Updated as : "+addr);
	    
	}
	@When("User type the Landmark as {string}")
	public void user_type_the_landmark_as(String lndmark) {
		UserAccountPageObjects.getInstance().enterLandMark(lndmark);
		System.out.println("Landmark Entered & Updated as : "+lndmark);
	}
	@When("User type the ZipCode as {string}")
	public void user_type_the_zip_code_as(String zip) {
		UserAccountPageObjects.getInstance().enterZipcode(zip);
		System.out.println("AddressZipcode Entered & Updated as : "+zip);
		
	}
	@When("User choose the country as {string} in the dropdown Using {string}")
	public void user_choose_the_country_as_in_the_dropdown_using(String country, String howTo) {
		CommonUtils.getInstance().selectFromDropDown(UserAccountPageObjects.getInstance().getCountryDropDown(), howTo, country);
		System.out.println("Country Selected & Updated as "+country+"Using"+howTo);
	}
	@When("User choose the state as {string} in the dropdown Using {string}")
	public void user_choose_the_state_as_in_the_dropdown_using(String state, String howTo) {
		CommonUtils.getInstance().selectFromDropDown(UserAccountPageObjects.getInstance().getState(), howTo, state);
		System.out.println("State Selected & Updated as "+state+"Using"+howTo);
	}
	@When("User type the City as {string}")
	public void user_type_the_city_as(String cty) {
		UserAccountPageObjects.getInstance().enterCity(cty);
		System.out.println("City Entered & Updated as : "+cty);
		
	}
	@When("User type the Telephone as {string}")
	public void user_type_the_telephone_as(String tele) {
		UserAccountPageObjects.getInstance().enterTeleph(tele);
		System.out.println("Telephone Entered & Updated as : "+tele);
	}
	@When("Click on SaveAddressButton")
	public void click_on_save_address_button() {
		UserAccountPageObjects.getInstance().clkSaveAddressBtn();
		System.out.println("Save Address Button Clicked Successfully");
	}
	@Then("User Address Updated SuccessFully")
	public void user_address_updated_success_fully() {
		System.out.println("User Address Updated Successfully");
		CommonUtils.getInstance().AfterScenario();
	}


}
