package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class rahulKart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		WebElement usr = driver.findElement(By.id("username"));
		usr.sendKeys("rahulshettyacademy");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("learning");
		WebElement rb = driver.findElement(By.id("usertype"));
		rb.click();
		WebElement chk = driver.findElement(By.id("terms"));
		chk.click();
		WebElement dd = driver.findElement(By.xpath("//*[@id=\"login-form\"]/div[5]/select"));
		Select select = new Select(dd);
		select.selectByIndex(2);
		WebElement sbtn = driver.findElement(By.id("signInBtn"));
		sbtn.click();
		List<WebElement> l = driver.findElements(By.xpath("//*[@class=\"btn btn-info\"]"));
		for (WebElement w : l) {
			System.out.println(w.getText());
			w.click();
		}
		WebElement chot = driver.findElement(By.partialLinkText("Checkout"));
		chot.click();
		
		
		// rahulshettyacademy and Password is learning)

	}

}
