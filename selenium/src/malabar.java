import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class malabar {

	public static void main(String[] args) throws Exception {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
		driver.get("https://www.malabargoldanddiamonds.com/");
		driver.findElement(By.id("search")).sendKeys("Ring"+Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

         //This will scroll the web page till end.		
        
          String SearchResultText =driver.findElement(By.cssSelector("li.search")).getText();
          System.out.println(SearchResultText);
          if(SearchResultText.equalsIgnoreCase("Search results for: 'Ring'")) {
        	  System.out.println("user navigated Search Result page & Search Results Are Displayed");
          }
        //  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
         
          Thread.sleep(10000);
		ArrayList<WebElement> productPrice = new ArrayList<WebElement>( driver.findElements(By.xpath("//*[@class=\"products-grid col-xs-16\"]/li")));
		ArrayList<WebElement> productTitle = new ArrayList<WebElement>( driver.findElements(By.xpath("//div[@class='image_wrapper']/a/img")));
		
		    
		    System.out.println("No.Of Results Displayed :"+ productTitle.size());
			for(int i=0;i<productPrice.size();i++) {
				
				String s[]=productPrice.get(i).getText().split("\n");
				  System.out.println();
				  System.out.println(" Details Of Product : "+(i+1));
				  System.out.println(" ----------------"); 
				  System.out.println("Product Code : " +s[1]); 
				  System.out.println("productName : "+productTitle.get(i).getAttribute("title"));
				  System.out.println(" Product Price : "+s[0]);
				  System.out.println(" ----------------"); 
				  }
			
			
			
			WebElement selectProductType=driver.findElement(By.xpath("(//span[@class='selected_text'])[17]"));
			selectProductType.click();
			String r=driver.findElement(By.partialLinkText("Ring")).getText();
			driver.findElement(By.partialLinkText("Ring")).click();
			
			Thread.sleep(5000);
			System.out.println("ProductType Selected as :"+r);
			System.out.println("ProductType selected Successfully");
			
			Thread.sleep(10000);
		       js.executeScript("window.scrollBy(0,-350)", "");
			WebElement selectPrice=driver.findElement(By.xpath("(//span[@class='selected_text'])[19]"));
			selectPrice.click();
			String r1=driver.findElement(By.xpath("(//a[@class='amshopby-price-top amshopby-attr'])[2]")).getText();
			driver.findElement(By.xpath("(//a[@class='amshopby-price-top amshopby-attr'])[2]")).click();
			System.out.println("Price Selected as :"+ r1);
			System.out.println("Price selected Successfully");
				
			
			Thread.sleep(10000);
			ArrayList<WebElement> AfterproductPrice = new ArrayList<WebElement>( driver.findElements(By.xpath("//*[@class=\"products-grid col-xs-16\"]/li")));
			ArrayList<WebElement> AfterproductTitle = new ArrayList<WebElement>( driver.findElements(By.xpath("//div[@class='image_wrapper']/a/img")));
			
			    
			    System.out.println("No.Of Results Displayed After Filter :"+ productTitle.size());
				for(int i=0;i<AfterproductPrice.size();i++) {
					
					String s[]=AfterproductPrice.get(i).getText().split("\n");
					  System.out.println();
					  System.out.println(" Details Of Product : "+(i+1));
					  System.out.println(" ----------------"); 
					  System.out.println("Product Code : " +s[1]); 
					  System.out.println("productName : "+AfterproductTitle.get(i).getAttribute("title"));
					  System.out.println(" Product Price : "+s[0]);
					  System.out.println(" ----------------"); 
					  }
			//(//span[@class='selected_text'])[19]
	}
		 
			
			  

}
