package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AllBirdsRegister {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("start-maximized");
		options.addArguments("disable-infobars");
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.allbirds.com/");
		driver.findElement(By.xpath("//*[@id=\"top-navigation\"]/nav/ul[2]/li[4]/div/a")).click();
		driver.findElement(By.id("FirstName")).sendKeys("wadafii");
		driver.findElement(By.id("LastName")).sendKeys("44670@miarr.com");
		driver.findElement(By.id("Email")).sendKeys("wadafi4670@miarrr.com");
		driver.findElement(By.id("CreatePassword")).sendKeys("wadafi4670");
		driver.findElement(By.id("CustomerPasswordConfirmation")).sendKeys("wadafi4670");
		driver.findElement(By.xpath("//*[@id=\"create_customer\"]/input[8]")).click();
		//driver.findElement(By.className("shopify-challenge__button btn")).click();
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		new WebDriverWait(driver,Duration.ofSeconds(10)).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.recaptcha.net/recaptcha/api2/')]")));
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(By.id("recaptcha-anchor"))).click();
		driver.switchTo().defaultContent();
		new WebDriverWait(driver,Duration.ofSeconds(20)).until(ExpectedConditions.elementToBeClickable(By.cssSelector("input.btn"))).click();
		
		//driver.findElement(By.cssSelector("input.btn")).click();
	//	driver.findElement(By.linkText("LOGOUT")).click();
	}
}
/**/
