import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;



public class SpecificUser {

	public static void main(String[] args) throws Exception {
		// Define the path to the Chrome executable
        String chromePath = "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe";

        // Define the username and password for the different user
        String username = "santhosh.kumar";
        String password = "";

        // Define the command to run Chrome as the different user
        String cmd = "cmd /c echo " + password + " | runas /user:" + username + " \"" + chromePath + "\"";

        // Use the Runtime class to execute the command
        Runtime.getRuntime().exec(cmd);

        // Set the Chrome driver executable path and create a new ChromeDriver instance
      //  System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
        EdgeOptions options = new EdgeOptions();
    //    C:\Users\santhosh.kumar\AppData\Local\Microsoft\Edge\User Data\Default
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--inprivate");
        options.addArguments("--user-data-dir=C:\\Users\\"+username+"\\AppData\\Local\\Microsoft\\Edge\\User Data");
        options.addArguments("--profile-directory=Default");
       
//		DesiredCapabilities capabilities = new DesiredCapabilities();
//		capabilities.setCapability(EdgeOptions.CAPABILITY, options);
//		options.merge(capabilities);
        
        WebDriver driver = new EdgeDriver(options);
        

        // Set the page load timeout and navigate to a website
      //  driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.get("https://www.malabargoldanddiamonds.com/");
     //   driver.get("https://www.google.com");

        // Verify the page title
//        String pageTitle = driver.getTitle();
//        if (pageTitle.contains("Google")) {
//            System.out.println("Test passed!");
//        } else {
//            System.out.println("Test failed!");
//        }


	}
}






































































//TODO Auto-generated method stub
		//System.setProperty("webdriver.http.factory", "jdk-http-client");
		//ChromeOptions options = new ChromeOptions();
	//	EdgeOptions options = new EdgeOptions();
  //   options.addArguments("--remote-allow-origins=*");
  //   options.addArguments("--user-data-dir=C:\\Users\\santhosh.kumar\\AppData\\Local\\Microsoft\\Edge\\User Data\\Default");
    // webdrivermanager.chromedriver().setup();
   //  options.addArguments("--profile-directory=Default");
//		options.addArguments("--disable-notifications");
//		WebDriver driver = new EdgeDriver(options);
		
		
		
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
//		driver.findElement(By.id("i0116")).sendKeys("santhosh.kumar@qualitestgroup.com");
//		driver.findElement(By.id("idSIButton9")).click();
//		driver.findElement(By.id("i0118")).sendKeys("$$aann2525");
//		driver.findElement(By.id("idSIButton9")).click();
		
		//driver.get("https://www.malabargoldanddiamonds.com/");
//		driver.get("edge://version");
//		driver.navigate().to("https://outlook.office.com/mail/");
		