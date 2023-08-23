package selenium;

import java.io.IOException;
import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

public class FlipkartHover {

	public static void main(String[] args) throws MalformedURLException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		Actions act = new Actions(driver);
		act.clickAndHold(driver.findElement(By.xpath("//*[@class='CXW8mj']//img[@alt='Fashion']"))).build().perform();
		driver.findElement(By.linkText("Men's Top Wear")).click();
		act.clickAndHold(driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[3]"))).build()
				.perform();
		ArrayList<WebElement> lnk = new ArrayList<WebElement>(
				driver.findElements(By.xpath("//*[@class='_1QrT3s']/div/a")));
		System.out.println("No.Of.Links under the Mens Tab : " + lnk.size());

		for (WebElement wb : lnk) {
			System.out.println("Link Text : " + wb.getText() + "---->" + "Link : " + wb.getAttribute("href"));
		}
		SoftAssert a = new SoftAssert();

		for (WebElement wb : lnk)

		{

			String url = wb.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int respCode = conn.getResponseCode();

			System.out.println(respCode);

			a.assertTrue(respCode < 400, "The link with Text" + wb.getText() + " is broken with code" + respCode);

		}

		a.assertAll();

	}

}
