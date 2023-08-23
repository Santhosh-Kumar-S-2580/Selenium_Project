import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MalabarCart {

	public static void main(String[] args) throws Exception {
		

		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.get("https://www.malabargoldanddiamonds.com/");
		

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
			WebElement SelectProduct =driver.findElement(By.xpath("(//div[@class='image_wrapper']/a/img)[1]"));
			SelectProduct.click();
			WebElement ProductName=driver.findElement(By.xpath("//div[@class='product-name']/h1"));
			System.out.println("ProductName :"+ProductName.getText());
			
			WebElement ProductCode=driver.findElement(By.xpath("(//div[@class='detail-page-procode'])[1]"));
			System.out.println("ProductCode :"+ProductCode.getText());

			WebElement Avaliablity=driver.findElement(By.xpath("(//p[@class='availability in-stock'])[1]"));
			System.out.println("Avaliablity Of the Product :"+Avaliablity.getText());

			WebElement ProductPrice=driver.findElement(By.xpath("(//span[@class='price'])[2]"));
			System.out.println("ProductPrice :"+ProductPrice.getText());

			WebElement AddToCart=driver.findElement(By.xpath("(//button[@title='Buy Now'])[2]"));
			AddToCart.click();
			System.out.println("Add To Cart Button Clicked Successfully");


			//verify product added to cart
			//li.success-msg
			WebElement AddToCartSuccessMsg=driver.findElement(By.cssSelector("li.success-msg"));



			WebElement SaveandShopping=driver.findElement(By.xpath("(//span[@class='continue_shopping'])[2]"));
			SaveandShopping.click();
			System.out.println("SaveandShopping Button Clicked Successfully");


			WebElement CartBtn=driver.findElement(By.xpath("(//li[@class='myCartLi'])"));
			CartBtn.click();
			System.out.println("Cart Icon Clicked Successfully & show the Cart Items");
           Thread.sleep(2000);

			WebElement CloseCartBtn=driver.findElement(By.xpath("(//span[@class='close-btn'])[1]"));
			CloseCartBtn.click();
			System.out.println("CloseCart Button Clicked Successfully");

			/*
			 * WebElement
			 * ViewCartBtn=driver.findElement(By.xpath("((//a[@class='f-left'])[1]"));
			 * ViewCartBtn.click();
			 * System.out.println("View Cart Button Clicked Successfully");
			 */




			
		}
	}
