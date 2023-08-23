package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class captcha {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:/Users/santhosh.kumar/Desktop/New%20folder/index.html");
		String s=driver.findElement(By.id("image")).getText();
		driver.findElement(By.id("submit")).sendKeys(s);
		driver.findElement(By.id("btn")).click();
		
	}

}
