package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parabankFooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		String expectedUrl = "https://parabank.parasoft.com/parabank/index.htm";
		driver.get(expectedUrl);
		WebElement footerLinks=  driver.findElement(By.id("footerPanel"));
		System.out.println(footerLinks.findElements(By.tagName("a")).size());
		for( int i=1;i<footerLinks.findElements(By.tagName("a")).size();i++) {
			String open=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footerLinks.findElements(By.tagName("a")).get(i).sendKeys(open);
		}
	}

}
