package stepDefinition;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.MyntraPageObjects;

public class Myntra {
	public WebDriver driver;
	
	@Given("Open the browser and Lanuch the Website")
	public void open_the_browser_and_lanuch_the_website() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		 driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println("Chrome Browser Launched Sucessfully");
		driver.get("https://www.myntra.com/");
		   System.out.println("Successfully Navigated to Myntra");
	    
	}
	@When("Search the products")
	public void search_the_products() {
		PageFactory.initElements(driver, MyntraPageObjects.class);
		MyntraPageObjects.SearchTextbox.sendKeys("Watch"+Keys.ENTER);
		
	}
	@When("Verify the product is displayed")
	public void verify_the_product_is_displayed() {
		String prdT=MyntraPageObjects.ProductTitle.getText();
		System.out.println("Product Title "+prdT);
		String prdC=MyntraPageObjects.ProductCount.getText();
		System.out.println("Product Count "+prdC);
		if((prdT.equalsIgnoreCase("watch")) && (prdC.contains("items"))) {
			System.out.println("Search Result page should be Displayed");
		}
		else {
			System.out.println("Search Result page should Not be Displayed");
		}
	}
	@When("Display the search product in the console")
	public void display_the_search_product_in_the_console() {
		
		
		//System.out.println(MyntraPageObjects.SearchProducts.size());
		System.out.println("Search Results");
		System.out.println("Search Result Products Name : " );
		for(int i=0;i<MyntraPageObjects.SearchProducts.size();i++) {
			
			System.out.println(i+" ) "+ MyntraPageObjects.SearchProducts.get(i).getText());
		}
	}
	@When("Verify the product count and print it")
	public void verify_the_product_count_and_print_it()  {
		
		String prdC4=MyntraPageObjects.ProductCount.getText();
		System.out.println("Product Count "+prdC4);
		if((prdC4.contains("items"))) {
			System.out.println("Count Displayed in the Search Page");
		}
		else {
			System.out.println("Count Not Displayed in the Search Page");
		}
	}
	@When("use radio button filter")
	public void use_radio_button_filter() throws Exception {
		
		MyntraPageObjects.FliterRdBox.click();
		System.out.println("Fliter RadioButton clicked");
		String prdC1=MyntraPageObjects.ProductCount.getText();
		System.out.println("Product Count After Fliter RadioButton clicked "+prdC1);
	}
	@When("Use filters using Checkbox")
	public void use_filters_using_checkbox() throws Exception {
		Thread.sleep(1000);
		MyntraPageObjects.FliterChkBox.click();
		System.out.println("Fliter CheckBox clicked");
		String prdC2=MyntraPageObjects.ProductCount.getText();
		System.out.println("Product Count After Fliter CheckBox clicked "+prdC2);
	}
	@Then("verify and print the count")
	public void verify_and_print_the_count() {
		String prdC3=MyntraPageObjects.ProductCount.getText();
		System.out.println("Product Count "+prdC3);
		if((prdC3.contains("items"))) {
			System.out.println("Count Displayed After the Fliter");
		}
		else {
			System.out.println("Count Not Displayed After the Fliter");
		}
	}



}
