package selenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollBy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =  (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", args);
		
	}

}
