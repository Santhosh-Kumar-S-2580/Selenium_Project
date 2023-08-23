package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Loginpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net/login");		
		WebElement emailfield= driver.findElement(By.name("email"));
		emailfield.sendKeys("q@gmail.com");
		WebElement pwdfield= driver.findElement(By.name("password"));
		pwdfield.sendKeys("qw123");
		WebElement signbutton= driver.findElement(By.className("ladda-label"));
		signbutton.click();
	}
}
