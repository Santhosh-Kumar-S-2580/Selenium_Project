package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class imageExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement e=driver.findElement(By.partialLinkText("Image"));
		e.click();
		WebElement t1=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/img"));
		t1.click();
		driver.navigate().back();
		WebElement t2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		if(t2.getAttribute("naturalWidth").equals("0")) {
			System.out.println("Image are broken");
		}
		else
		{
			System.out.println("Image are NOT  broken");
		}
	}


}


