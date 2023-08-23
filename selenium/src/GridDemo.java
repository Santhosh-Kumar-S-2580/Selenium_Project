	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;


public class GridDemo {

	public static void main(String [] args) throws MalformedURLException {
//	    String username = "USERNAME";			//Enter your username 
//	    String accesskey = "ACCESSKEY";			//Enter your accesskey
//	    s 
//	    String gridURL = "@hub.lambdatest.com/wd/hub";
	    DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("browserName", "edge"); 	//To specify the browser
        capabilities.setCapability("version", "70.0");		//To specify the browser version
        capabilities.setCapability("platform", "win10"); 	// To specify the OS
//        capabilities.setCapability("build", "LambdaTestApp");  //To identify the test 
//        capabilities.setCapability("name", "LambdaTestGridExample");
//        capabilities.setCapability("network", true); 		// To enable network logs
//        capabilities.setCapability("visual", true); 	// To enable step by step screenshot
//        capabilities.setCapability("video", true);			// To enable video recording
//        capabilities.setCapability("console", true); 		// To capture console logs
        RemoteWebDriver driver = new RemoteWebDriver(new URL("https://192.168.29.32ibase1.sharepoint.com/sites/hub/"), capabilities);
	    
        driver.get("https://opensource-demo.orangehrmlive.com/");
		String pageTitle = driver.getTitle();					
		System.out.println("The title of this page is ===> " +pageTitle);
		driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
	System.out.println("successfully logged in");    
	}}