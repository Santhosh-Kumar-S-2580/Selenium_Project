import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpiceJet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.spicejet.com");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("beng");
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("delh");
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-16ru68a.r-y47klf.r-1loqt21.r-eu3ka.r-1otgn73.r-1aockid")).click();
		driver.findElement(By.cssSelector(".css-1dbjc4n.r-1awozwy.r-z2wwpe.r-1loqt21.r-18u37iz.r-1777fci.r-1g94qm0.r-1w50u8q.r-ah5dr5.r-1otgn73")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-1awozwy r-1xfd6ze r-1loqt21 r-18u37iz r-1777fci r-1w50u8q r-ah5dr5 r-1otgn73']")).click();
		driver.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[3]/div[2]/div/div/div[2]/input")).sendKeys("nambi");
		driver.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[3]/div[3]/div/div/div[2]/input")).sendKeys("Rajan");
		driver.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[3]/div[4]/div/div[2]/input")).sendKeys("7708902356");
		driver.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[4]/div[1]/div/div/div[2]/input")).sendKeys("rajan@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"primary-contact-details\"]/div[4]/div[3]/div/div/div[2]/input")).sendKeys("Chennai");
		driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[1]/div[2]/div")).sendKeys("Miss");
		driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[2]/div/div/div[2]/input")).sendKeys("Gayathri");
		driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[3]/div/div/div[2]/input")).sendKeys("L");
		driver.findElement(By.xpath("//*[@id=\"pax-item-MCFBRFQ-\"]/div[2]/div/div/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys("8787872622");
		driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")).click();
		driver.findElement(By.xpath("//*[@id=\"at_addon_close_icon\"]")).click();
		driver.findElement(By.xpath("//*[@class='css-1dbjc4n r-1awozwy r-19m6qjp r-z2wwpe r-1loqt21 r-18u37iz r-1777fci r-6ity3w r-d9fdf6 r-9qu9m4 r-ah5dr5 r-1otgn73']")).click();
		
	}

}
