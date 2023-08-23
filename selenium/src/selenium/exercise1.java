package selenium;
import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.*;
//import org.openqa.selenium.support.decorators.WebDriverDecorator;
public class exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//C:\Users\santhosh.kumar\Downloads\chromedriver_win32\chromedriver.exe
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.w3schools.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.partialLinkText("Log in")).click();
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("//*[@id=\"search2\"]")).sendKeys("HTML"+Keys.ENTER);
		//driver.findElement(By.xpath("//*[@id=\"current-password\"]")).sendKeys("gowthan123");
		//driver.findElement(By.id("learntocode_searchicon")).click();
		
		//driver.close();
		//driver.quit();
	}

}
