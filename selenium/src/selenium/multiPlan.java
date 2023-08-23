package selenium;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiPlan {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.multiplan.us/");
		//Locating elements using XPath locator for search box
		driver.findElement(By.xpath("//ul[@id='menu-1-265a1ba']//a[@class='elementor-item'][normalize-space()='PROVIDERS']")).click();
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/div/div/div/section[3]/div/div/div/div/div/section/div/div/div[1]/div/div/div[3]/div/div/a/span/span")).click();
		// To handle all new opened window
		ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(newTb.get(1));
		driver.findElement(By.id("T:dclay:gl2")).click();
		//Pause the execution for xx Sec
		//Find the elements using "ID" and send respective value
		driver.findElement(By.id("T:dclay:oc_8745792971rudUIQ1:pt1:s1:it1::content")).sendKeys("naveenprasanth1229@gmail.com");
		driver.findElement(By.id("T:dclay:oc_8745792971rudUIQ1:pt1:s1:it2::content")).sendKeys("naveenprasanth1229@gmail.com");
		//Find the elements using "ID" and send respective value
		driver.findElement(By.id("T:dclay:oc_8745792971rudUIQ1:pt1:s1:it3::content")).sendKeys("Naveen");
		//Find the elements using "ID" and send respective value
		driver.findElement(By.id("T:dclay:oc_8745792971rudUIQ1:pt1:s1:it4::content")).sendKeys("Prasanth");
		//Find the elements using "ID" and send respective value
		driver.findElement(By.id("T:dclay:oc_8745792971rudUIQ1:pt1:s1:it5::content")).sendKeys("9787634977");
		//Find the elements using "ID" and send respective value
		driver.findElement(By.id("T:dclay:oc_8745792971rudUIQ1:pt1:s1:it7::content")).sendKeys("91");
		//Find the elements using "ID" and click
		driver.findElement(By.id("T:dclay:oc_8745792971rudUIQ1:pt1:s1:cb1")).click();
		//To click the "yes!I want to cancel" button
		driver.findElement(By.xpath("/html/body/div[2]/div/form/div/div[2]/div[1]/div[1]/table/tbody/tr/td/div/div/table/tbody/tr[2]/td[2]/div/div[4]/div/div[1]/div[1]/table/tbody/tr/td[3]/div/a/span")).click();
	}
}
