package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sortable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/santhosh.kumar/Documents/sort.html");
		//driver.switchTo().frame(0);
		List<WebElement> l=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		System.out.println(l.size());
		WebElement I1=l.get(0);
	WebElement I2=l.get(1);
    WebElement I3=l.get(2);
	WebElement I4=l.get(3);
	WebElement I5=l.get(4);
	WebElement I6=l.get(5);
		WebElement I7=l.get(6);
		
		System.out.println("Before Sorting");
		for(WebElement w:l) {
			System.out.println(w.getText());
			
		}
		Actions act=new Actions(driver);
		//act.dragAndDrop(I1, I2).build().perform();
		
		act.clickAndHold(I7);
		act.moveToElement(I1);
		act.release(I1);
		act.build().perform();
		
		
		
		act.clickAndHold(I6);
		act.moveToElement(I1);
		act.release(I1);
		act.build().perform();
		
		act.clickAndHold(I5);
		act.moveToElement(I1);
		act.release(I1);
		act.build().perform();
		
		act.clickAndHold(I4);
		act.moveToElement(I1);
		act.release(I1);
		act.build().perform();
		
		act.clickAndHold(I3);
		act.moveToElement(I1);
		act.release(I1);
		act.build().perform();
		
		act.clickAndHold(I2);
		act.moveToElement(I1);
		act.release(I1);
		act.build().perform();
		
		List<WebElement> l1=driver.findElements(By.xpath("//*[@id=\"sortable\"]/li"));
		System.out.println("After Sorting");
		for(WebElement w:l1) {
			System.out.println(w.getText());
			
		}
		

	}

}
