package practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/");	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement e=driver.findElement(By.partialLinkText("Alert"));
		e.click();
		WebElement t1=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/div/div/button"));
		t1.click();
		driver.switchTo().alert().accept();
		WebElement t2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		t2.click();
		driver.switchTo().alert().accept();
		WebElement t3=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		t3.click();
		driver.switchTo().alert().sendKeys("TestLeaf");
		driver.switchTo().alert().accept();
		WebElement t4=driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[4]/div/div/button"));
		t4.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();		
	}

}
