package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://test.qatechhub.com/drag-and-drop/");
		WebElement drag=driver.findElement(By.id("draggable"));
		System.out.println(drag.getText());
		WebElement drop=driver.findElement(By.id("droppable"));
		System.out.println(drop.getText());
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();
		System.out.println(drop.getText());
		if(drop.getText().equalsIgnoreCase("dropped!")) {
			System.out.println("Drag & Drop Done Successfully.DROPPED!");
		}
		else {
			System.out.println("Drag & Drop failes");
		}
		

	}

}
