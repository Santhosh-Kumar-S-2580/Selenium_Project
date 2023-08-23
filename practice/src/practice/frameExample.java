package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/");	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement e=driver.findElement(By.partialLinkText("Frame"));
		e.click();
		driver.switchTo().frame(0);
		WebElement t1=driver.findElement(By.id("Click"));
		t1.click();
		
		driver.switchTo().defaultContent();
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		WebElement t2=driver.findElement(By.id("Click1"));
		t2.click();
		
		driver.switchTo().defaultContent();
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		
	}

}
