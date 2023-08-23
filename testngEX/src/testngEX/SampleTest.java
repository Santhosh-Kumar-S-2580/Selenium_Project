package testngEX;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SampleTest {
	 public WebDriver driver;
	   @BeforeTest
      public void openChrome() {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
	  		driver.manage().window().maximize();
	  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	  		System.out.println("Chrome Browser Launched Sucessfully");
  		      }
	   
	   @Test
	   public void openURL() {
		   driver.get("https://www.flipkart.com/");
			driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
			System.out.println("Navigated to flipkart");
	   }
	   @Test
	   public void secondURL() {
		   driver.get("https://www.amazon.in/");
		   System.out.println("Navigated to amazon");
	   
	   }
	   @Test
	   public void myntra() {
		   driver.get("https://www.myntra.com/");
		   System.out.println("Navigated to flipkart");
			driver.findElement(By.xpath("//input")).sendKeys("Mobile Accessories"+Keys.ENTER);
			System.out.println("Search result displayed Sucessfully");
			driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]")).click();
			System.out.println("Click on the Product sucessfully & Navigated the product page");
			ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(l.get(1));
			driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]")).click();
			System.out.println("add to bag clicked Sucessfully");
			driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[1]")).click();
			System.out.println("navigated to checklist page");
	   }
	   @AfterMethod
	   public void closeChrome() {
		  driver.quit(); 
		  System.out.println("Chrome Browser Successfully Closed");
	
	   }
	   
}


