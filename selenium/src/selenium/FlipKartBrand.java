package selenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class FlipKartBrand {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.className("_3704LK")).sendKeys("shirts" + Keys.ENTER);
		Actions act=new Actions(driver);
		
		
		ArrayList<WebElement> fliter = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@class='_2gmUFU _3V8rao']")));
		
		for(WebElement wb1:fliter) {
			String s1=wb1.getText();
			System.out.println(s1);
			if(s1.equalsIgnoreCase("brand")) {
				act.clickAndHold(wb1);
				wb1.click();
			}
		}
		
		
		ArrayList<WebElement> brand = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@class='_3879cV']")));
		for(WebElement wb:brand) {
			String s=wb.getText();
			System.out.println(s);
			if(s.equalsIgnoreCase("Allen solly")) {
				wb.click();
			}
		}
		
		
		
		for(WebElement wb1:fliter) {
			String s1=wb1.getText();
			System.out.println(s1);
			if(s1.equalsIgnoreCase("color")) {
				act.clickAndHold(wb1);
			}
		}
		
		
		ArrayList<WebElement> color = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//div[@class='_3879cV']")));
		for(WebElement wb2:color) {
			String s2=wb2.getText();
			System.out.println(s2);
			if(s2.equalsIgnoreCase("white")) {
				wb2.click();
			}
		}
		


//		driver.findElement(By.xpath("(//input[@type='checkbox'])[4]")).click();

}
}
