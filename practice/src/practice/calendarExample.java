package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendarExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc =new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement e=driver.findElement(By.partialLinkText("Calendar"));
		e.click();
		WebElement t1=driver.findElement(By.id("datepicker"));
		t1.sendKeys("10/10/2022"+Keys.ENTER);
		
		
	}

}
