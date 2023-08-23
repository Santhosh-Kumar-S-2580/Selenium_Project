package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sulekha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.sulekha.com/");
		driver.findElement(By.cssSelector("button.button.gray.small.block")).click();
		driver.findElement(By.linkText("Sign Up")).click();
		driver.switchTo().frame("frMyAccount");
		driver.findElement(By.id("txtRname")).sendKeys("wadaf");
		driver.findElement(By.id("txtRuname")).sendKeys("wadafi4770@miarrr.com");
		driver.findElement(By.id("txtRpwd")).sendKeys("Wadaf4770");
		driver.findElement(By.id("btnregister")).click();
	}
}

