import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
public class chromeJS {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
//		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
//		WebDriver driver= new ChromeDriver(options);			
//		
//        //Creating the JavascriptExecutor interface object by Type casting		
//        JavascriptExecutor js = (JavascriptExecutor)driver;		
//        		
//        //Launching the Site.		
//      //  driver.get("https://demo.guru99.com/V4/");
//			
//        //Fetching the Domain Name of the site. Tostring() change object to name.		
//     					
//
//        		
//      //Navigate to new Page i.e to generate access page. (launch new url)		
//     js.executeScript("window.location = 'https://demo.guru99.com/'");	
//      //  js.executeScript("window.location = 'chrome://version'");
//
//      String DomainName = js.executeScript("return document.domain;").toString();			
//      System.out.println("Domain name of the site = "+DomainName);					
//        		
//      //Fetching the URL of the site. Tostring() change object to name		
//      String url = js.executeScript("return document.URL;").toString();			
//      System.out.println("URL of the site = "+url);					
//        		
//     //Method document.title fetch the Title name of the site. Tostring() change object to name		
//     String TitleName = js.executeScript("return document.title;").toString();			
//     System.out.println("Title of the page = "+TitleName);
//    System.out.println(driver.getTitle()); 
//    driver.findElement(By.name("emailid")).sendKeys("SSASAS@GKANSMA");
//    driver.navigate().to("chrome://version/");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		RemoteWebDriver  driver = new RemoteWebDriver(new URL("http://www.myexamplebrowserstack.com"),chromeOptions);
		driver.get("http://www.google.com");
		driver.quit();
     
	}

}
