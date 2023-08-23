package selenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class flipkart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.linkText("Login"))).build().perform();
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div/div/div[2]"))).build().perform();
		//act.moveToElement(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div/div/div[2]"))).build().perform();
		driver.switchTo().activeElement().sendKeys("6767786778");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	}
	//_3wJI0x
}
/*driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
		driver.switchTo().activeElement().sendKeys("6767786778");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/input")).sendKeys("343244");*/