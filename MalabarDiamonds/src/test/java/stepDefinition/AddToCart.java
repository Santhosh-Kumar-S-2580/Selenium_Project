package stepDefinition;

import CommonUtils.CommonUtils;
import PageObjects.SearchPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import PageObjects.AddToCartPageObjects;
public class AddToCart {
   
	  @Given("User land to Malabar Golds & Diamonds page {string}")
	  public void user_land_to_malabar_golds_diamonds_page(String url) {
		  CommonUtils.getInstance().launchUrl(url);
			 System.out.println("Successfully Launched Malabar Golds & Diamonds");
	  }
	  @When("user Login to valid credentials")
	  public void user_Login_to_valid_credentials() throws Exception {
		  CommonUtils.getInstance().login();
	  }
	  @When("user Enter Search Term as {string}")
	  public void user_enter_search_term_as(String Search) {
		  SearchPageObjects.getInstance().enterSearchTerm(Search);
	  }
	  @When("Verify User should be  Navigated to Search Result Page and product is displayed")
	  public void verify_user_should_be_navigated_to_search_result_page_and_product_is_displayed() throws Exception {
		  System.out.println("SearchResult Text :" +SearchPageObjects.getInstance().getSearchResultTxt());
			 if(SearchPageObjects.getInstance().getSearchResultTxt().equalsIgnoreCase("Search results for: 'Ring'")) {
		   	  System.out.println("User Successfully Navigated Search Result page & Search Results Are Displayed");
		     }
			 Thread.sleep(5000);
	  }
	  @When("User can Select filter as ProductType")
	  public void user_can_select_filter_as_product_type() throws Exception {
		 
			 SearchPageObjects.getInstance().clkselectProductTypeBox();
			 String ProdType=SearchPageObjects.getInstance().getselectProductType();
			 SearchPageObjects.getInstance().clkselectProductType();
			 Thread.sleep(5000);
				System.out.println("ProductType Selected as :"+ProdType);
				System.out.println("ProductType selected Successfully");
				Thread.sleep(5000);
				AddToCartPageObjects.getInstance().clkSelectProduct();
	  }
	  @When("Display the Selected Product Name,Product Code,Product Price and Availability of the Product")
	  public void display_the_selected_product_name_product_code_product_price_and_availability_of_the_product() {
		  	System.out.println("ProductName :"+  AddToCartPageObjects.getInstance().getProductName());
			System.out.println("ProductCode :"+AddToCartPageObjects.getInstance().getProductCode());
			System.out.println("Avaliablity Of the Product :"+AddToCartPageObjects.getInstance().getAvaliablity());
			System.out.println("ProductPrice :"+AddToCartPageObjects.getInstance().getProductPrice());
	  }
	  @When("User click the Add To Cart Button")
	  public void user_click_the_add_to_cart_button() {
		  AddToCartPageObjects.getInstance().clkAddToCartBtn();
	  }
	  @Then("Product Successfully added to cart & Verify AddToCart SuccessMessage is Displayed")
	  public void product_successfully_added_to_cart_verify_add_to_cart_success_message_is_displayed() {
		  if(AddToCartPageObjects.getInstance().getAddToCartSuccessMsg().contains("was added to your shopping cart."))
			{

				System.out.println("SuccessMsg :" +AddToCartPageObjects.getInstance().getAddToCartSuccessMsg());
			}
			AddToCartPageObjects.getInstance().clkSaveandShoppingBtn();
			AddToCartPageObjects.getInstance().clkCartBtn();
			AddToCartPageObjects.getInstance().clkCloseCartBtn();

	  }

}

	  
	  
	  
	  
	  
	  
	  
	  
	/*  
	  CommonUtils.getInstance().launchUrl(url);
		 System.out.println("Successfully Launched Malabar Golds & Diamonds");
		    CommonUtils.getInstance().login();
		    SearchPageObjects.getInstance().enterSearchTerm(search);
			 System.out.println("SearchResult Text :" +SearchPageObjects.getInstance().getSearchResultTxt());
			 if(SearchPageObjects.getInstance().getSearchResultTxt().equalsIgnoreCase("Search results for: 'Ring'")) {
		   	  System.out.println("User Successfully Navigated Search Result page & Search Results Are Displayed");
		     }
			 Thread.sleep(5000);
			 SearchPageObjects.getInstance().clkselectProductTypeBox();
			 String ProdType=SearchPageObjects.getInstance().getselectProductType();
			 SearchPageObjects.getInstance().clkselectProductType();
			 Thread.sleep(5000);
				System.out.println("ProductType Selected as :"+ProdType);
				System.out.println("ProductType selected Successfully");
				Thread.sleep(5000);
				AddToCartPageObjects.getInstance().clkSelectProduct();
				System.out.println("ProductName :"+  AddToCartPageObjects.getInstance().getProductName());
				System.out.println("ProductCode :"+AddToCartPageObjects.getInstance().getProductCode());
				System.out.println("Avaliablity Of the Product :"+AddToCartPageObjects.getInstance().getAvaliablity());
				System.out.println("ProductPrice :"+AddToCartPageObjects.getInstance().getProductPrice());
				AddToCartPageObjects.getInstance().clkAddToCartBtn();
				
				
				if(AddToCartPageObjects.getInstance().getAddToCartSuccessMsg().contains("was added to your shopping cart."))
				{

					System.out.println("SuccessMsg :" +AddToCartPageObjects.getInstance().getAddToCartSuccessMsg());
				}
				AddToCartPageObjects.getInstance().clkSaveandShoppingBtn();
				AddToCartPageObjects.getInstance().clkCartBtn();
				AddToCartPageObjects.getInstance().clkCloseCartBtn();
  */
  
  
  
  
  
  
  
  
  
