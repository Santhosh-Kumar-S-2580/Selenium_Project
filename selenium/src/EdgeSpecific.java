import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.http.ClientConfig;



public class EdgeSpecific {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
				//ChromeOptions options = new ChromeOptions();
	         	String username = "santhosh.kumar";
//				EdgeOptions options = new EdgeOptions();
//		     options.addArguments("--remote-allow-origins=*");//C:\Users\santhosh.kumar\AppData\Local\Microsoft\Edge\User Data\Profile 2
//		     options.addArguments("--user-data-dir=C:\\Users\\"+username+"\\AppData\\Local\\Microsoft\\Edge\\User Data");
//		     options.addArguments("--profile-directory=Profile 2");
//				options.addArguments("--disable-notifications");
//				WebDriver driver = new EdgeDriver(options);
//				driver.manage().window().maximize();
//				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
//				driver.navigate().to("edge://version/");
//				//Thread.sleep(2000);
//				//driver.get("https://www.malabargoldanddiamonds.com/");
//				driver.navigate().to("https://www.google.com/");
				//driver.findElement(By.id("q")).sendKeys("Hello"+Keys.ENTER);
//			System.out.println(driver.getCurrentUrl());	
//			System.out.println(driver.getTitle()); 
//			driver.navigate().to("edge://version/");
//			System.out.println(driver.getCurrentUrl());	
//			System.out.println(driver.getTitle()); 
			
				System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe"); 
				//EdgeOptions edgeOptions = new EdgeOptions();
//				edgeOptions.addArguments("profile-directory=Profile 2");
//				// Here you set the path of the profile ending with User Data not the profile folder
//				edgeOptions.addArguments("user-data-dir=C:\\Users\\"+username+"\\AppData\\Local\\Microsoft\\Edge\\User Data");
//
//				// Here you specify the actual profile folder
//				//https://ibase1.sharepoint.com/sites/hub/
//
//				edgeOptions.addArguments("--start-maximized");
//				
				//WebDriver driver = new EdgeDriver(edgeOptions); 
	         	WebDriver driver = new EdgeDriver();
	         	JavascriptExecutor js = (JavascriptExecutor)driver;
	         			js.executeScript("	host = location.host");
	         	js.executeScript("window.location = 'https://demo.guru99.com/'");
			        driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
			        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
			        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
			        driver.close();
				//driver.get("https://www.google.com");
				driver.getTitle();
				
				//driver.navigate().back();
				
	}

}
