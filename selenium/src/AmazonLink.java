import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class AmazonLink {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		ChromeOptions opt = new ChromeOptions();
//		opt.addArguments("--remote-allow-origins=*");
		// Launching the browser
		WebDriver driver=new EdgeDriver();

	       
	         driver.get("https://www.amazon.in/");
	         ArrayList<WebElement> ar=new ArrayList<WebElement>(driver.findElements(By.xpath("(//a[@class=\"nav-a  \"])")));
	         ArrayList<String> Menulinks=new ArrayList<String>();
	         for(WebElement wb:ar) {
	        	 System.out.println(wb.getText() + " : " + wb.getAttribute("href"));
	        	 Menulinks.add(wb.getAttribute("href"));
	         }
	}

}
