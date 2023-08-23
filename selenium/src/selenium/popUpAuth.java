package selenium;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popUpAuth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/auth.xhtml");
		WebElement Aubtn=driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt90\"]/span"));
		Aubtn.click();
		System.out.println(driver.findElement(By.tagName("body")).getText());
		ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(win.get(0));
		System.out.println(win);
		driver.navigate().to("http://admin:testleaf@leafground.com:8090/login");
		System.out.println(driver.findElement(By.tagName("body")).getText());
	}


}
