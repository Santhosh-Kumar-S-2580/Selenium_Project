package stepDefinition;

import org.openqa.selenium.By;

import CommonUtils.CommonUtils;
import Common_step_def.Common_Step_Definition;
import PageObjects.AddToCartPageObjects;
import PageObjects.SearchPageObjects;
import PageObjects.UserAccountPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.PlaceOrderPageObjects;
import PageObjects.RegisterPageObjects;
import PageObjects.LoginPageObjects;


public class PlaceOrder {
	

	@Given("User landing into Malabar Golds & Diamonds page {string}")
	public void user_landing_into_malabar_golds_diamonds_page(String url) {
		CommonUtils.getInstance().launchUrl(url);
		System.out.println("Successfully Launched Malabar Golds & Diamonds");
	}
	@When("user can able to Enter Search Term as {string}")
	public void user_can_able_to_enter_search_term_as(String search) {
		SearchPageObjects.getInstance().enterSearchTerm(search);
		
		
	}
	@When("To Verify User should Navigated to Search Result Page and product is displayed")
	public void to_verify_user_should_navigated_to_search_result_page_and_product_is_displayed() throws Exception {
		System.out.println("SearchResult Text :"
				+SearchPageObjects.getInstance().getSearchResultTxt());
		if(SearchPageObjects.getInstance().getSearchResultTxt().
				equalsIgnoreCase("Search results for: 'Ring'")) { System.out.
			println("User Successfully Navigated Search Result page & Search Results Are Displayed"
					); }
		Thread.sleep(5000);
	}
	
	@When("User can Select the filter as ProductType")
	public void user_can_select_the_filter_as_product_type() throws Exception {
		
		SearchPageObjects.getInstance().clkselectProductTypeBox(); 
		String ProdType=SearchPageObjects.getInstance().getselectProductType();
		SearchPageObjects.getInstance().clkselectProductType();
		Thread.sleep(5000);
		System.out.println("ProductType Selected as :"+ProdType);
		System.out.println("ProductType selected Successfully"); 
		
	}
	@When("Display the Selected Product Name,Product Code,Product Price and Availability of the Product in the console")
	public void display_the_selected_product_name_product_code_product_price_and_availability_of_the_product_in_the_console() throws Exception {
		Thread.sleep(5000);
		AddToCartPageObjects.getInstance().clkSelectProduct();
		System.out.println("ProductName :"+
				AddToCartPageObjects.getInstance().getProductName());
		System.out.println("ProductCode :"+AddToCartPageObjects.getInstance().
				getProductCode());
		System.out.println("Avaliablity Of the Product :"+AddToCartPageObjects.
				getInstance().getAvaliablity());
		System.out.println("ProductPrice :"+AddToCartPageObjects.getInstance().
				getProductPrice());
	}
	@When("User click the BuyNow button")
	public void user_click_the_buy_now_button() {
		  AddToCartPageObjects.getInstance().clkAddToCartBtn();
	}
	@When("User should be navigated to shopping cart page & click on the Place Order Button")
	public void user_should_be_navigated_to_shopping_cart_page_click_on_the_place_order_button() throws Exception {
		
		/*
		 * if(AddToCartPageObjects.getInstance().getAddToCartSuccessMsg().
		 * contains("was added to your shopping cart.")) {
		 * 
		 * System.out.println("SuccessMsg :"+AddToCartPageObjects.getInstance().
		 * getAddToCartSuccessMsg()); }
		 */
		 
		
	}
	@When("Navigated to checkout page")
	public void navigated_to_checkout_page() throws Exception  {
		Common_Step_Definition.driver.findElement(By.xpath("//button[@aria-label='Close Chatbox']")).click();
		
		Thread.sleep(3000);
		PlaceOrderPageObjects.getInstance().clkplaceOrderBtn();
		System.out.println("PlaceOrder Button Clicked Successfully for go to CheckOut Page");
	    System.out.println("User should be successfully navigated to checkout page");
	}
	@When("Login with Valid Crendentials")
	public void login_with_valid_crendentials() {
		System.out.println("ENTER THE LOGIN DETAILS");
		
	}
	@When("User can enters username as {string} and password as {string}")
	public void user_can_enters_username_as_and_password_as(String username, String pass) {
		LoginPageObjects.getInstance().enterLoginEmail(username);
		LoginPageObjects.getInstance().enterLoginPwd(pass);
		LoginPageObjects.getInstance().clkLoginToCtnBtn();
	}
	@When("User can enter the shipping Details")
	public void user_can_enter_the_shipping_details() {
		System.out.println("ENTER THE SHIPPING DETAILS");
	}
	@When("User can choose the salutation as {string} in the dropdown Using {string}")
	public void user_can_choose_the_salutation_as_in_the_dropdown_using(String salutationValue, String howTo) throws Exception {
		Thread.sleep(5000);
		CommonUtils.getInstance().selectFromDropDown(RegisterPageObjects.getInstance().getSalutationDD(), howTo, salutationValue);
		System.out.println("Salutation Selected as "+salutationValue+"Using"+howTo);
	}
	@When("User can enter the FirstName as {string}")
	public void user_can_enter_the_first_name_as(String fname) {
		PlaceOrderPageObjects.getInstance().enterplaceOrderusrfname(fname);
		System.out.println("FirstName Entered as : "+fname);
		

	}
	@When("User can enter the LastName as {string}")
	public void user_can_enter_the_last_name_as(String lname) {
		PlaceOrderPageObjects.getInstance().enterplaceOrderusrlname(lname);;
		System.out.println("LastName Entered as : "+lname);
	}
	@When("User can type the Address as {string}")
	public void user_can_type_the_address_as(String addr) {
		PlaceOrderPageObjects.getInstance().enterplaceOrderAddressTxtBox(addr);
		System.out.println("Address Entered  as: "+addr);
	}
	@When("User can type the Landmark as {string}")
	public void user_can_type_the_landmark_as(String lndmark) {
		PlaceOrderPageObjects.getInstance().enterplaceOrderLandMark(lndmark);
		System.out.println("Landmark Entered as : "+lndmark);
	}
	@When("User can type the Telephone as {string}")
	public void user_can_type_the_telephone_as(String tele) {
		PlaceOrderPageObjects.getInstance().enterplaceOrderTelePhno(tele);
		System.out.println("Telephone Entered as : "+tele);
	}
	@When("User can type the ZipCode as {string}")
	public void user_can_type_the_zip_code_as(String zip) {
		PlaceOrderPageObjects.getInstance().enterplaceOrderzipcode(zip);
		System.out.println("AddressZipcode Entered as : "+zip);
	}
	@When("User can type the City as {string}")
	public void user_can_type_the_city_as(String cty) {
		PlaceOrderPageObjects.getInstance().enterplaceOrdercity(cty);;
		System.out.println("City Entered as : "+cty);
	}
	
	@When("User can choose the state as {string} in the dropdown Using {string}")
	public void user_can_choose_the_state_as_in_the_dropdown_using(String state, String howTo) {
		CommonUtils.getInstance().selectFromDropDown(PlaceOrderPageObjects.getInstance().getplaceOrderStateDropDown(), howTo, state);
		System.out.println("State Selected as "+state+"Using"+howTo);
	}
	@When("User can choose the country as {string} in the dropdown Using {string}")
	public void user_can_choose_the_country_as_in_the_dropdown_using(String country, String howTo) {
		
		CommonUtils.getInstance().selectFromDropDown(PlaceOrderPageObjects.getInstance().getplaceOrdercountryDropDown(), howTo, country);
		System.out.println("Country Selected as "+country+"Using"+howTo);
	}
	@When("click Terms and condition checkbox")
	public void click_terms_and_condition_checkbox() throws Exception {
		Thread.sleep(5000);
		System.out.println(PlaceOrderPageObjects.getInstance().getOrderSummary());
		System.out.println(PlaceOrderPageObjects.getInstance().getOrderSummaryPrice()); 
		Thread.sleep(3000); 
		PlaceOrderPageObjects.getInstance().clkTermsChkBox();
	}
	@When("click ContinueCheckout Button")
	public void click_continue_checkout_button() throws Exception {
		Thread.sleep(3000); 
		PlaceOrderPageObjects.getInstance().clkChkoutBtn();
	}
	@When("user can Navigated to Payment selection Page & click the placeorder button")
	public void user_can_navigated_to_payment_selection_page_click_the_placeorder_button() {
		System.out.println("CheckOut Button Clicked Successfully & Navigated to Payment Selection Page");
		PlaceOrderPageObjects.getInstance().clkplaceOrder1();
	}
	@Then("User Navigated to Payment gateway page & Orderplaced successfully")
	public void user_navigated_to_payment_gateway_page_orderplaced_successfully() {
		System.out.println("PlaceOrder Button Clicked  Successfully for go to  Payment Page");
		CommonUtils.getInstance().AfterScenario();
	}

	
}
