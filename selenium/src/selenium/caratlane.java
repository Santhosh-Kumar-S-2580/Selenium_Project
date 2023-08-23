package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class caratlane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.caratlane.com/");
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.id("takestowishlist"))).build().perform();
		driver.findElement(By.linkText("Log In")).click();
		driver.findElement(By.cssSelector("input.e1d8b1dc1")).sendKeys("cetalil569@subdito.com");
		driver.findElement(By.cssSelector("button.e1jmj0hg1.css-axgvvf.e1jmj0hg0")).click();
		driver.findElement(By.id("password")).sendKeys("Rx100@7803");
		driver.findElement(By.cssSelector("button.e1jmj0hg1.css-pwoqpz.e1jmj0hg0")).click();
		
	}

}
