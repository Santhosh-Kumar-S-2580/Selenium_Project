package stepDefinition;

import CommonUtils.CommonUtils;
import PageObjects.RegisterPageObjects;
import PageObjects.SearchPageObjects;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchProduct {
	
	@Given("User move to Malabar Golds & Diamonds page {string}")
	public void user_move_to_malabar_golds_diamonds_page(String url) {
	    CommonUtils.getInstance().launchUrl(url);
		 System.out.println("Successfully Launched Malabar Golds & Diamonds");
	}
	@When("user Enter  the Search Term as {string}")
	public void user_enter_the_search_term_as(String search) {
		SearchPageObjects.getInstance().enterSearchTerm(search);
		System.out.println("Search Ter Entered as :"+ search);
	}
	@When("Verify User Navigated to Search Result Page and product is displayed")
	public void verify_user_navigated_to_search_result_page_and_product_is_displayed() {
		 System.out.println("SearchResult Text :" +SearchPageObjects.getInstance().getSearchResultTxt());
		 if(SearchPageObjects.getInstance().getSearchResultTxt().equalsIgnoreCase("Search results for: 'Ring'")) {
	   	  System.out.println("User Successfully Navigated Search Result page & Search Results Are Displayed");
	     }
	}
	
	@When("Display the search products Details in the console")
	public void display_the_search_products_details_in_the_console() throws Exception {
		Thread.sleep(5000);
		 System.out.println("No.Of Results Displayed In The Search Result Page :"+ SearchPageObjects.productTitle.size());
		 for(int i=0;i<SearchPageObjects.productTitle.size();i++) {
			 String s[]=SearchPageObjects.productPrice.get(i).getText().split("\n");
			  System.out.println();
			  System.out.println(" Details Of Product : "+(i+1));
			  System.out.println(" ----------------"); 
			  System.out.println("Product Code : " +s[1]); 
			  System.out.println("productName : "+SearchPageObjects.productTitle.get(i).getAttribute("title"));
			  System.out.println(" Product Price : "+s[0]);
			  System.out.println(" ----------------"); 
		 }
	}
	
	@When("User Select filter as ProductType and ProductPrice")
	public void user_select_filter_as_product_type_and_product_price() throws Exception {
		 SearchPageObjects.getInstance().clkselectProductTypeBox();
		 String ProdType=SearchPageObjects.getInstance().getselectProductType();
		 SearchPageObjects.getInstance().clkselectProductType();
		 Thread.sleep(3000);
			System.out.println("ProductType Selected as :"+ProdType);
			System.out.println("ProductType selected Successfully");
			/*
			 * Thread.sleep(2000); SearchPageObjects.getInstance().clkselectPriceBox();
			 * String Prodprice=SearchPageObjects.getInstance().getselectPrice();
			 * SearchPageObjects.getInstance().clkselectPrice();
			 * System.out.println("Price Selected as :"+ Prodprice);
			 * System.out.println("Price selected Successfully");
			 */
	}
	@Then("Verify the product is displayed and Display the search products Details after Selecting the filter in the console")
	public void verify_the_product_is_displayed_and_display_the_search_products_details_after_selecting_the_filter_in_the_console() throws Exception {
		Thread.sleep(10000);
		System.out.println("No.Of Results Displayed In The Search Result Page After Selecting the Filter :"+ SearchPageObjects.AfterFilterproductTitle.size());
		for(int i=0;i< SearchPageObjects.AfterFilterproductPrice.size();i++) {
			
			String s[]= SearchPageObjects.AfterFilterproductPrice.get(i).getText().split("\n");
			  System.out.println();
			  System.out.println(" Details Of Product : "+(i+1));
			  System.out.println(" ----------------"); 
			  System.out.println("Product Code : " +s[1]); 
			  System.out.println("productName : "+ SearchPageObjects.AfterFilterproductTitle.get(i).getAttribute("title"));
			  System.out.println(" Product Price : "+s[0]);
			  System.out.println(" ----------------"); 
			  }
		System.out.println("Products Dispalyed Successfully ");
		CommonUtils.getInstance().AfterScenario();
	}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	 * public void search() throws Exception{
	 * 
	 * SearchPageObjects.getInstance().enterSearchTerm(search);
	 * System.out.println("SearchResult Text :"
	 * +SearchPageObjects.getInstance().getSearchResultTxt());
	 * if(SearchPageObjects.getInstance().getSearchResultTxt().
	 * equalsIgnoreCase("Search results for: 'Ring'")) { System.out.
	 * println("User Successfully Navigated Search Result page & Search Results Are Displayed"
	 * ); } Thread.sleep(10000);
	 * System.out.println("No.Of Results Displayed In The Search Result Page :"+
	 * SearchPageObjects.productTitle.size()); for(int
	 * i=0;i<SearchPageObjects.productTitle.size();i++) { String
	 * s[]=SearchPageObjects.productPrice.get(i).getText().split("\n");
	 * System.out.println(); System.out.println(" Details Of Product : "+(i+1));
	 * System.out.println(" ----------------"); System.out.println("Product Code : "
	 * +s[1]);
	 * System.out.println("productName : "+SearchPageObjects.productTitle.get(i).
	 * getAttribute("title")); System.out.println(" Product Price : "+s[0]);
	 * System.out.println(" ----------------"); }
	 * SearchPageObjects.getInstance().clkselectProductTypeBox(); String
	 * ProdType=SearchPageObjects.getInstance().getselectProductType();
	 * SearchPageObjects.getInstance().clkselectProductType(); Thread.sleep(5000);
	 * System.out.println("ProductType Selected as :"+ProdType);
	 * System.out.println("ProductType selected Successfully"); Thread.sleep(10000);
	 * SearchPageObjects.getInstance().clkselectPriceBox(); String
	 * Prodprice=SearchPageObjects.getInstance().getselectPrice();
	 * SearchPageObjects.getInstance().clkselectPrice();
	 * System.out.println("Price Selected as :"+ Prodprice);
	 * System.out.println("Price selected Successfully"); Thread.sleep(10000);
	 * System.out.
	 * println("No.Of Results Displayed In The Search Result Page After Selecting the Filter :"
	 * + SearchPageObjects.AfterFilterproductTitle.size()); for(int i=0;i<
	 * SearchPageObjects.AfterFilterproductPrice.size();i++) {
	 * 
	 * String s[]=
	 * SearchPageObjects.AfterFilterproductPrice.get(i).getText().split("\n");
	 * System.out.println(); System.out.println(" Details Of Product : "+(i+1));
	 * System.out.println(" ----------------"); System.out.println("Product Code : "
	 * +s[1]); System.out.println("productName : "+
	 * SearchPageObjects.AfterFilterproductTitle.get(i).getAttribute("title"));
	 * System.out.println(" Product Price : "+s[0]);
	 * System.out.println(" ----------------"); }
	 * 
	 * }
	 */
