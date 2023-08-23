package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AllBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://www.allbirds.com/");
		driver.findElement(By.xpath("//*[@id=\"top-navigation\"]/nav/ul[2]/li[4]/div/a")).click();
		driver.findElement(By.id("CustomerEmail")).sendKeys("wadafi4670@miarr.com");
		driver.findElement(By.id("CustomerPassword")).sendKeys("wadafi4670");
		driver.findElement(By.xpath("//*[@id=\"customer_login\"]/input[5]")).click();
		//driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/form/input[2]")).click();
		driver.findElement(By.className("recaptcha-checkbox-border")).click();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/form/input[2]")).click();
	//	driver.findElement(By.linkText("LOGOUT")).click();
	}

}
/*driver.findElement(By.id("FirstName")).sendKeys("wadafi4670@miarr.com");
driver.findElement(By.id("LastName")).sendKeys("wadafi4670@miarr.com");
driver.findElement(By.id("Email")).sendKeys("wadafi4670@miarr.com");
driver.findElement(By.id("CreatePassword")).sendKeys("wadafi4670@miarr.com");
driver.findElement(By.id("CustomerPasswordConfirmation")).sendKeys("wadafi4670@miarr.com");
driver.findElement(By.xpath("//*[@id=\"create_customer\"]/input[8]")).sendKeys("wadafi4670@miarr.com");*/
