package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		/*ChromeOptions options = new ChromeOptions();

		options.addArguments("start-maximized");

		options.addArguments("disable-infobars");

		options.addArguments("--disable-extensions");*/

		WebDriver driver = new ChromeDriver();

		driver.get("https://phptravels.org/login");
		driver.switchTo().frame(0);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
		
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(
		        By.xpath("//iframe[starts-with(@name, 'c-') and starts-with(@src, 'https://www.google.com/recaptcha/')]")));

		wait.until(ExpectedConditions.elementToBeClickable(
		            By.cssSelector("div.recaptcha-checkbox-border"))).click();

		System.out.println("Clicked the checkbox");
	}

}




