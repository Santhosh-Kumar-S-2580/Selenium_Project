package OrangeHRM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HRMLogin {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123"+Keys.ENTER);
		driver.findElement(By.xpath("(//*[@class='oxd-main-menu-item'])[6]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("Paul");
		driver.findElement(By.xpath("//*[@name='middleName']")).sendKeys("P");
		driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("Colling");
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]")).sendKeys("Paul");
		//driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[3]")).sendKeys("0025");
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[4]")).sendKeys("3434");
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[5]")).sendKeys("TN778676vgy");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input")).sendKeys("2023-01-30");
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[7]")).sendKeys("4654754744");
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[8]")).sendKeys("34324324234");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input")).sendKeys("1975-10-15");
		driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[10]")).sendKeys("Defence");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/div/div[2]/div/div[2]/div/label/span/i")).click();
		driver.findElement(By.xpath("(//*[@type='submit'])[1]")).click();
	}

}
//*[@name='firstName']