import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.myntra.com/");
		driver.navigate().to("https://www.myntra.com/login?referer=https://www.myntra.com/");
//		Actions act = new Actions(driver);
//		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[2]"))).build().perform();
//		driver.findElement(By.linkText("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/div[2]/div[2]/div[1]/input")).sendKeys("7708822368");
        driver.findElement(By.cssSelector("div.submitBottomOption")).click();
        //driver.findElement(By.cssSelector("div.bottomLink")).click();
		driver.findElement(By.xpath("//*[@id=\"reactPageContent\"]/div/div/form/div/div[2]/input")).sendKeys("Gaya3@123");
		driver.findElement(By.cssSelector("button.btn.primary.lg.block.submitButton")).click();
		
		
		
		
		
		
		
		//		driver.findElement(By.xpath("//input")).sendKeys("Mobile Accessories"+Keys.ENTER);
//		driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]")).click();
//		ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
//		driver.switchTo().window(l.get(1));
//		driver.findElement(By.xpath("//*[@id=\"mountRoot\"]/div/div[1]/main/div[2]/div[2]/div[2]/div[2]/div/div[1]")).click();
//		driver.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/a[2]/span[1]")).click();
		




		}}
