package selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile"+Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
		//Change driver handle to Another window
		ArrayList<String> l=new ArrayList<String>(driver.getWindowHandles());
	   System.out.println(l);
	   driver.switchTo().window(l.get(1));
		
		Thread.sleep(1000);
		driver.findElement(By.id("buyBackAccordionRow")).click();
		
		driver.findElement(By.id("newAccordionRow")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("add-to-cart-button")).click();
	
	}

}

