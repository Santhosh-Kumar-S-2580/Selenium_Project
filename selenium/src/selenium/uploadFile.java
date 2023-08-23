package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadFile {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/file.xhtml");
		WebElement  DL=driver.findElement(By.id("j_idt97:j_idt98_label")); 
		DL.click(); 
		Thread.sleep(1000);
		StringSelection sl=new StringSelection("C:\\Users\\santhosh.kumar\\Downloads\\TestLeaf Logo.png");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sl,null);
		Robot robot = new Robot();
		robot.delay(300);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(200);
		robot.keyRelease(KeyEvent.VK_ENTER);
		driver.findElement(By.xpath("//*[@id=\"j_idt97:j_idt98\"]/div[1]/button[1]/span[2]")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.className("ui-growl-title")).getText());
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
		
		
		

		
		//ui-growl-title
	}

}
