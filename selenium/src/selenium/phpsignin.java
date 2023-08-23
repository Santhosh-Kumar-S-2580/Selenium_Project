package selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class phpsignin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.phptravels.net/signup");
		WebElement firstNamefield= driver.findElement(By.name("first_name"));
	firstNamefield.sendKeys("sam");
	WebElement lastNamefield= driver.findElement(By.name("last_name"));
	lastNamefield.sendKeys("s1");
	WebElement phonefield= driver.findElement(By.name("phone"));
	phonefield.sendKeys("9870654321");
	WebElement emailfield= driver.findElement(By.name("email"));
	emailfield.sendKeys("zcv@gmail.com");
	WebElement pwdfield= driver.findElement(By.name("password"));
	pwdfield.sendKeys("sam123");
	WebElement dropdown= driver.findElement(By.id("account_type"));
	Select select=new Select(dropdown);
	select.selectByValue("agent");
	WebElement signbutton= driver.findElement(By.name("button"));
	signbutton.click();
	}
	//<span class="recaptcha-checkbox goog-inline-block recaptcha-checkbox-unchecked rc-anchor-checkbox recaptcha-checkbox-clearOutline" role="checkbox" aria-checked="false" id="recaptcha-anchor" tabindex="0" dir="ltr" aria-labelledby="recaptcha-anchor-label"><div class="recaptcha-checkbox-border" role="presentation"></div><div class="recaptcha-checkbox-borderAnimation" role="presentation"></div><div class="recaptcha-checkbox-spinner" role="presentation"><div class="recaptcha-checkbox-spinner-overlay"></div></div><div class="recaptcha-checkbox-checkmark" role="presentation"></div></span>
	//*[@id="fadein"]/div[3]/div/div[2]/div[2]/div/form/div[7]/div/div/iframe
	//html/body/div[3]/div/div[2]/div[2]/div/form/div[7]/div/div/iframe
}
