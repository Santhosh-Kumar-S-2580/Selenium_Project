package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selectable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"selectable\"]/li"));
		System.out.println(l.size());
		for(WebElement w:l) {
			System.out.println(w.getText());
		}
		Actions act=new Actions(driver);
		act.clickAndHold(l.get(0));
		act.clickAndHold(l.get(1));
		act.clickAndHold(l.get(2));
		act.build().perform();
	} 

}
