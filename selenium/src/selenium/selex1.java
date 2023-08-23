package selenium;



import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selex1 {
     
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://www.amazon.in/");
      // Locating the Main Menu (Parent element)
         Actions actions = new Actions(driver);
         	//Hovering on main menu
     	actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform();
        Thread.sleep(10000);
        driver.findElement(By.linkText("Sign in")).click();
        
         //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
         //implicitlyWait();
   
     	
	}
	

}

