package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String s=driver.findElement(By.xpath("//*[@id=\"checkbox-example\"]/fieldset/label[2]")).getText();
		System.out.println(s);
		WebElement ls=driver.findElement(By.id("dropdown-class-example"));
		Select select=new Select(ls);
		select.selectByVisibleText(s);
		driver.findElement(By.id("name")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();
		String s1=driver.switchTo().alert().getText();
		if(s1.contains(s)) {
			System.out.println(s+" text is present in the alert box");
		}
		else {
			System.out.println(s+" text is present in the alert box");
		}
		driver.switchTo().alert().accept();
	}

}
