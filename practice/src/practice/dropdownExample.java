package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdownExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");	
		WebElement e=driver.findElement(By.partialLinkText("Drop down"));
		e.click();	
		WebElement d1=driver.findElement(By.id("dropdown1"));
		Select select=new Select(d1);
		select.selectByIndex(1);
		
		WebElement d2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/select"));
		Select select1=new Select(d2);
		select1.selectByVisibleText("Appium");
		
		WebElement d3=driver.findElement(By.id("dropdown3"));
		Select select2=new Select(d3);
		select2.selectByValue("2");
		
		WebElement d4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/select"));
		Select select3=new Select(d4);
		List <WebElement> getop=select3.getOptions();
		System.out.println(getop.size());
		
		WebElement d5=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/select"));
		d5.sendKeys("Load Runner");
		
		WebElement d6=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[6]/select"));
		Select select6=new Select(d6);
		select6.selectByIndex(0);
		select6.selectByIndex(1);
		
		
		
	}

}
