package practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SC {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver","C:\\Users\\santhosh.kumar\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://bazaar.shopclues.com/");
		driver.findElement(By.linkText("Sign In")).click();
		//<String> t=new ArrayList<String>(driver.getWindowHandles());
		//System.out.println(t);
		//driver.switchTo().window(t.get(0));
		//driver.findElement(By.className("label_jump")).click(); 
		//driver.findElement(By.id("https://bazaar.shopclues.com/")).sendKeys("sokabi4054@eilnews.com");
	//	System.out.println(driver.findElement(By.tagName("label")).getText());
		//driver.findElement(By.linkText("Continue with Facebook")).click();
	}//moe-chrome-style-notification-btn moe-btn-allow moe-allow-class

}//Continue with Facebook
//main_user_login
//<a href="javascript:void(0);" onclick="loginPopup();">Sign In</a>>