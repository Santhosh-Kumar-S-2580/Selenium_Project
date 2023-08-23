package CommonUtils;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import PageObjects.AddToCartPageObjects;
import PageObjects.AddToWishListPageObjects;
import PageObjects.LoginPageObjects;
import PageObjects.PlaceOrderPageObjects;
import Common_step_def.Common_Step_Definition;
import PageObjects.RegisterPageObjects;
import PageObjects.SearchPageObjects;
import PageObjects.UserAccountPageObjects;
public class CommonUtils {
	
	private static CommonUtils commonUtilsInstance=null;
	
	private CommonUtils() {
		
		
	}
	
	public static CommonUtils getInstance() {
		
		if(commonUtilsInstance==null) {
			commonUtilsInstance=new CommonUtils();
		}
		return commonUtilsInstance;
	}
	
	
	
	//WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		Common_Step_Definition.driver = new ChromeDriver(options);
		Common_Step_Definition.driver.manage().window().maximize();
		Common_Step_Definition.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		System.out.println("Chrome Browser Launched Sucessfully");
	}
	
	public void initWebElements() {
		PageFactory.initElements(Common_Step_Definition.driver,LoginPageObjects.getInstance());
		PageFactory.initElements(Common_Step_Definition.driver,RegisterPageObjects.getInstance());
		PageFactory.initElements(Common_Step_Definition.driver,SearchPageObjects.getInstance());
		PageFactory.initElements(Common_Step_Definition.driver,AddToCartPageObjects.getInstance());
		PageFactory.initElements(Common_Step_Definition.driver,AddToWishListPageObjects.getInstance());
		PageFactory.initElements(Common_Step_Definition.driver,PlaceOrderPageObjects.getInstance());
		PageFactory.initElements(Common_Step_Definition.driver,UserAccountPageObjects.getInstance());
	}
	 
	public void takeScrshot() throws Exception {
		File scrshot=((TakesScreenshot) Common_Step_Definition.driver).getScreenshotAs(OutputType.FILE) ;
		FileUtils.copyFile(scrshot, new File(Common_Step_Definition.getScenarioName()+".png"));
	
	}
	public void AfterScenario() {
		Common_Step_Definition.driver.quit();
		System.out.println("Browser Closed Successfully");
	}
	
	public void highLightElement(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) Common_Step_Definition.driver;
		executor.executeScript("arguments[0].setAttribute('style', 'border: 6px solid blue');", element);
	}
	public void selectFromDropDown(WebElement dropdown,String howTo,String value){
		Select select=new Select(dropdown);
		 
		switch (howTo) {
		case "index":
			 select.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			 select.selectByValue(value);
			break;
		case "text":
			select.selectByVisibleText(value);
		default:
			//System.out.println("Please provide a valid Selection on the Feature File.Valid Selections are : text,value,index");
			break;
		}
	}
	public void launchUrl(String url) {
		Common_Step_Definition.driver.get(url);
	}
	public void login() throws Exception {
		RegisterPageObjects.getInstance().clkProfileBtn();
		System.out.println("Profile Button Clicked SuccessFully");
		Thread.sleep(5000);;
		LoginPageObjects.getInstance().clkLoginBtn();
		System.out.println("Login Button Clicked SuccessFully and Navigated to Login Page");
//		LoginPageObjects.getInstance().enterLoginEmail("wakeye8520@chotunai.com");
//		LoginPageObjects.getInstance().enterLoginPwd("wakeye@8520");
//	    System.out.println("UserName Entered as : "+"wakeye8520@chotunai.com");
//		System.out.println("Password Entered as : "+"wakeye@8520");
		LoginPageObjects.getInstance().enterLoginEmail("Rajan@chotunai.com");
		LoginPageObjects.getInstance().enterLoginPwd("Rajan@wak88740");
	    System.out.println("UserName Entered as : "+"Rajan@chotunai.com");
		System.out.println("Password Entered as : "+"Rajan@wak88740");
		LoginPageObjects.getInstance().clkLoginToCtnBtn();
		System.out.println("Login Button Clicked successfully");
		String GreatMsg=LoginPageObjects.getInstance().showLoginGrtMsg();
		System.out.println("Greeting Message : " + GreatMsg);
	    if(GreatMsg.contains("Hi")) {
	    	System.out.println("User Login SuccessFully");
	    	System.out.println("Successfully navigated to User Account Page");
	    	System.out.println("UserName is displayed with Hi message");
	}
}
	}
//When user enters the Email as "Rajan@chotunai.com" and MobileNumber as "6387865434"
//When user enters the password as "Rajan@wak88740" 