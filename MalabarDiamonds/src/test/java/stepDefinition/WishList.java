package stepDefinition;

import org.openqa.selenium.By;

import CommonUtils.CommonUtils;
import Common_step_def.Common_Step_Definition;
import PageObjects.SearchPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import CommonUtils.CommonUtils;
import PageObjects.SearchPageObjects;
import PageObjects.AddToCartPageObjects;
import PageObjects.AddToWishListPageObjects;

public class WishList {
	

	@Given("User should be land to Malabar Golds & Diamonds page {string}")
	public void user_should_be_land_to_malabar_golds_diamonds_page(String url) {
		 CommonUtils.getInstance().launchUrl(url);
  		 System.out.println("Successfully Launched Malabar Golds & Diamonds");
	}
	@When("user Login into valid credentials")
	public void user_login_into_valid_credentials() throws Exception {
		  CommonUtils.getInstance().login();
	}
	@When("user should be Enter the Search Term as {string}")
	public void user_should_be_enter_the_search_term_as(String search) {
		SearchPageObjects.getInstance().enterSearchTerm(search);
	}
	@When("Verify User must be  Navigated to Search Result Page and product is displayed")
	public void Verify_User_must_be_Navigated_to_Search_Result_Page_and_product_is_displayed() {
		System.out.println("SearchResult Text :" +SearchPageObjects.getInstance().getSearchResultTxt());
			 if(SearchPageObjects.getInstance().getSearchResultTxt().equalsIgnoreCase("Search results for: 'Ring'")) {
		   	  System.out.println("User Successfully Navigated Search Result page & Search Results Are Displayed");
		     }
	}
	@When("User should Select filter as ProductType")
	public void user_should_select_filter_as_product_type() throws Exception {
		 Thread.sleep(5000);
			 SearchPageObjects.getInstance().clkselectProductTypeBox();
			 String ProdType=SearchPageObjects.getInstance().getselectProductType();
			 SearchPageObjects.getInstance().clkselectProductType();
			 Thread.sleep(3000);
				System.out.println("ProductType Selected as :"+ProdType);
				System.out.println("ProductType selected Successfully");
				Thread.sleep(3000);
	}
	@When("User click the Wishlist Icon & Display the Wishlist SuccessMessage")
	public void user_click_the_wishlist_icon_display_the_wishlist_success_message() throws Exception {
		Thread.sleep(3000);   
		    
		    	Common_Step_Definition.driver.findElement(By.cssSelector("button.olark-launch-button.olark-size-md")).click();
			System.out.println("No.Of Results Displayed In The Search Result Page :"+ SearchPageObjects.productTitle.size());
			 for(int i=0;i<AddToWishListPageObjects.wishlist.size();i=i+1) {
				 
				 AddToWishListPageObjects.wishlist.get(i).click();
					System.out.println("wishlistSuccessMsg :"+ AddToWishListPageObjects.getInstance().getwishlistSuccessMsg());
					AddToWishListPageObjects.getInstance().clkwishlistOKBtn();
				 
				 
				
			 }
	}
	
	@Then("verify Product Successfully added to wishlist and display the wishlist count")
	public void verify_product_successfully_added_to_wishlist_and_display_the_wishlist_count() throws Exception {
		Thread.sleep(3000);
			System.out.println("No.of Products addes to the Wishlist :"+AddToWishListPageObjects.getInstance().getwishcount() );
			CommonUtils.getInstance().AfterScenario();
	}


}
