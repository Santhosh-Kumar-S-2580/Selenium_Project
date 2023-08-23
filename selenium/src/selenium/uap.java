package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uap { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net/login");		
		WebElement emailfield= driver.findElement(By.name("email"));
		emailfield.sendKeys("qw@gmail.com");
		WebElement pwdfield= driver.findElement(By.name("password"));
		pwdfield.sendKeys("qw12");
		WebElement signbutton= driver.findElement(By.className("ladda-label"));
		signbutton.click();
		driver.navigate().to("https://phptravels.net/account/profile");
		WebElement firstNamefield= driver.findElement(By.name("firstname"));
		firstNamefield.clear();
		firstNamefield.sendKeys("sam");
		driver.navigate().to("https://phptravels.net/account/profile/sucess");
		/*WebElement upbutton= driver.findElement(By.("/html/body/table/tbody/tr[1131]/td[2]/span[2]"));
		upbutton.click();*/
	}

}
//<button type="submit" class="theme-btn waves-effect">Update Profile</button>
