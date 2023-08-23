package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ParabankHomePage {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String expectedUrl = "https://parabank.parasoft.com/parabank/index.htm";
		driver.get(expectedUrl);
		try{
		  Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
		  System.out.println("Navigated to correct webpage");
		}
		catch(Throwable pageNavigationError){
		  System.out.println("Didn't navigate to correct webpage");
		}
		boolean logoPresent = driver.findElement(By.xpath("//*[@id=\"topPanel\"]/a[2]/img")).isDisplayed();
        Assert.assertTrue(logoPresent);
        System.out.println("LOGO present in the Webpage");
        WebElement footerLinks=  driver.findElement(By.id("footerPanel"));
		System.out.println("No.of.links in the Footer Section " + footerLinks.findElements(By.tagName("a")).size());
		for( int i=1;i<footerLinks.findElements(By.tagName("a")).size();i++) {
			String open=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerLinks.findElements(By.tagName("a")).get(i).sendKeys(open);
			System.out.println("Navigated to "+footerLinks.findElements(By.tagName("a")).get(i).getText()+ "  Page ");
		}
          }
	}

