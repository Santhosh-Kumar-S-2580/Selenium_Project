import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class MalabarWishList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		PageFactory.initElements(driver,LoginPageObjects.getInstance());
		driver.get("https://www.malabargoldanddiamonds.com/");
		
		 driver.findElement(By.linkText("Profile")).click(); 
		 Thread.sleep(5000);
		  LoginPageObjects.getInstance().clkLoginBtn();
		  LoginPageObjects.getInstance().enterLoginEmail("wakeye8520@chotunai.com");
		  LoginPageObjects.getInstance().enterLoginPwd("wakeye@8520");
		  LoginPageObjects.getInstance().clkLoginToCtnBtn();
		

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
			
			Thread.sleep(8000);
			
			
			
			
			ArrayList<WebElement> productPrice = new ArrayList<WebElement>( driver.findElements(By.xpath("//*[@class=\"products-grid col-xs-16\"]/li")));
			ArrayList<WebElement> productTitle = new ArrayList<WebElement>( driver.findElements(By.xpath("//div[@class='image_wrapper']/a/img")));
			ArrayList<WebElement> wishlist = new ArrayList<WebElement>( driver.findElements(By.xpath("(//div[@class='wishlist '])")));
			//WebElement wishlistSuccessMsg =driver.findElement(By.xpath("(//div[@class='msgBoxContent'])"));
			//System.out.println("wishlistSuccessMsg :"+ wishlistSuccessMsg.getText());
			//WebElement wishlistOKBtn =driver.findElement(By.xpath("(//input[@class='msgButton'])"));
			//wishlistOKBtn.click();
			    
			    
				for(int i=1;i<wishlist.size();i=i+2) {					
					
					String s[]=productPrice.get(i).getText().split("\n");
					  System.out.println();
					  System.out.println(" Details Of Wishlist Product : "+(i+1));
					  System.out.println(" ----------------"); 
					  System.out.println("Product Code : " +s[1]); 
					  System.out.println("productName : "+productTitle.get(i).getAttribute("title"));
					  System.out.println(" Product Price : "+s[0]);
					  System.out.println(" ----------------"); 
					  wishlist.get(i).click();
					  WebElement wishlistSuccessMsg =driver.findElement(By.xpath("(//div[@class='msgBoxContent'])"));
					  System.out.println("wishlistSuccessMsg :"+ wishlistSuccessMsg.getText());
					  WebElement wishlistOKBtn =driver.findElement(By.xpath("(//input[@class='msgButton'])"));
					  wishlistOKBtn.click();
					  }
				
				
				Thread.sleep(3000);
					
			WebElement wishcount =  driver.findElement(By.xpath("(//span[@class='wishcount'])"));
			 System.out.println("No.of Products addes to the Wishlist :"+ wishcount.getText());
	}

}
