package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				WebDriver driver = new ChromeDriver();

				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://the-internet.herokuapp.com/nested_frames");
				driver.switchTo().frame("frame-top");
				driver.switchTo().frame("frame-middle");
				System.out.println(driver.findElement(By.id("content")).getText());


				
	}

}
