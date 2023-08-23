package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", args);
		
		List<WebElement> c=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr/th"));
		System.out.println("No.Of.Columns in the WebTable = "+c.size());
		List<WebElement> r=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr"));
		System.out.println("No.Of.Rows in the WebTable = "+r.size());
		List<WebElement> tr=driver.findElements(By.xpath("//table[@name='courses']/tbody/tr[3]/td"));
		System.out.println("2nd row in the WebTable = ");
		for(WebElement wb:tr) {
			System.out.println(wb.getText());
		}
	    
	}

}
//to find the 2nd row -//table[@name='courses']/tbody/tr[3]/td
//to find no.of.col-//table[@name='courses']/tbody/tr/th
//to find no.of.row-//table[@name='courses']/tbody/tr/th