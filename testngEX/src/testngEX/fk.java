package testngEX;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class fk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		driver.findElement(By.className("_3704LK")).sendKeys("mobile" + Keys.ENTER);
		driver.findElement(By.className("_4rR01T")).click();
		ArrayList<String> l = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(l);
		driver.switchTo().window(l.get(1));
		System.out.println("Product Name : " +driver.findElement(By.className("B_NuCI")).getText());
		System.out.println("Amount : "+driver.findElement(By.cssSelector("div._16Jk6d")).getText());
		System.out.println("Seller Information : "+driver.findElement(By.xpath("//*[@id=\"sellerName\"]/span/span")).getText());
		System.out.println("Rating For Seller: "+driver.findElement(By.xpath("//*[@id=\"sellerName\"]/span/div")).getText());
		driver.findElement(By.cssSelector("span.MCE--B")).click();
		ArrayList<WebElement> cr = new ArrayList<WebElement>(driver.findElements(By.cssSelector("p._2-N8zT")));//Customer Review Title
		ArrayList<WebElement> crd = new ArrayList<WebElement>(driver.findElements(By.cssSelector("div.t-ZTKy")));//Customer Review Desc
			for(int i=0;i<cr.size();i++) {
			System.out.println("Customer "+ i);
	    	System.out.println("Customer Review : " + cr.get(i).getText());
	        System.out.println("Customer Explanation :"+crd.get(i).getText());
	    }
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button/span")).click();

	}

}
