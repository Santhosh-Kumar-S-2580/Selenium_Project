import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;




public class MalabarPlaceOrder {

	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		PageFactory.initElements(driver,LoginPageObjects.getInstance());
		driver.get("https://www.malabargoldanddiamonds.com/");
		
		
		
		/*
		 * driver.findElement(By.linkText("Profile")).click(); Thread.sleep(5000);
		 * LoginPageObjects.getInstance().clkLoginBtn();
		 * LoginPageObjects.getInstance().enterLoginEmail("wakeye8520@chotunai.com");
		 * LoginPageObjects.getInstance().enterLoginPwd("wakeye@8520");
		 * LoginPageObjects.getInstance().clkLoginToCtnBtn();
		 */
		 
		
		Thread.sleep(5000);
		driver.findElement(By.id("search")).sendKeys("Ring"+Keys.ENTER);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		//This will scroll the web page till end.		

		String SearchResultText =driver.findElement(By.cssSelector("li.search")).getText();
		System.out.println(SearchResultText);
		
		if(SearchResultText.equalsIgnoreCase("Search results for: 'Ring'")) {
			System.out.println("user navigated Search Result page & Search Results Are Displayed");
		}
			WebElement selectProductType=driver.findElement(By.xpath("(//span[@class='selected_text'])[17]"));
			selectProductType.click();
			String r=driver.findElement(By.partialLinkText("Ring")).getText();
			driver.findElement(By.partialLinkText("Ring")).click();

			Thread.sleep(5000);
			System.out.println("ProductType Selected as :"+r);
			System.out.println("ProductType selected Successfully");
			Thread.sleep(5000);
			WebElement SelectProduct =driver.findElement(By.xpath("(//div[@class='image_wrapper']/a/img)[3]"));
			SelectProduct.click();
			WebElement ProductName=driver.findElement(By.xpath("//div[@class='product-name']/h1"));
			System.out.println("ProductName :"+ProductName.getText());
			
			WebElement ProductCode=driver.findElement(By.xpath("(//div[@class='detail-page-procode'])[1]"));
			System.out.println("ProductCode :"+ProductCode.getText());

			WebElement Avaliablity=driver.findElement(By.xpath("(//p[@class='availability in-stock'])[1]"));
			System.out.println("Avaliablity Of the Product :"+Avaliablity.getText());

			WebElement ProductPrice=driver.findElement(By.xpath("(//span[@class='price'])[2]"));
			System.out.println("ProductPrice :"+ProductPrice.getText());

			WebElement BuyNow=driver.findElement(By.xpath("(//button[@title='Buy Now'])[2]"));
			BuyNow.click();
			System.out.println("BuyNow Button Clicked Successfully");
			//verify product added to cart
			//li.success-msg
			WebElement AddToCartSuccessMsg=driver.findElement(By.cssSelector("li.success-msg"));

			if(AddToCartSuccessMsg.getText().contains("was added to your shopping cart."))
			{

				System.out.println("SuccessMsg :" +AddToCartSuccessMsg.getText());
			}			
			Thread.sleep(3000);
			WebElement placeOrder=driver.findElement(By.xpath("(//button[@title='Order Now'])[1]"));
			placeOrder.click();
			System.out.println("PlaceOrder Button Clicked Successfully for go to CheckOut Page");
			
			
			
			
			  LoginPageObjects.getInstance().enterLoginEmail("wakeye8520@chotunai.com");
			  LoginPageObjects.getInstance().enterLoginPwd("wakeye@8520");
			  LoginPageObjects.getInstance().clkLoginToCtnBtn();
			  
			  
			  
			  
			  Thread.sleep(5000);
				
				WebElement OrderSummary = driver.findElement(By.xpath("//div[@class='cart_content']"));
				System.out.println(OrderSummary.getText());
				
				WebElement OrderSummaryPrice = driver.findElement(By.cssSelector("table#shopping-cart-totals-table"));
				System.out.println(OrderSummaryPrice.getText());
			  
			  Thread.sleep(3000);
			
			WebElement TermsChkBox=driver.findElement(By.cssSelector("input#accept_term_ship.input-text.required-entry"));
			TermsChkBox.click();
			
			Thread.sleep(3000);
			WebElement ChkoutBtn=driver.findElement(By.cssSelector("button.button.btn-checkout.billingbutton"));
			ChkoutBtn.click();
			System.out.println("CheckOut Button Clicked Successfully & Navigated to Payment Selection Page");
			
			
			
			WebElement placeOrder1=driver.findElement(By.cssSelector("button.button.btn-checkout.paymentbutton.clearFix"));
			placeOrder1.click();
			System.out.println("PlaceOrder Button Clicked  Successfully for go to  Payment Page");
			
		
			 
			
			//

	}

}
