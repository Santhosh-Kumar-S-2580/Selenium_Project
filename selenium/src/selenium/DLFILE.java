package selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DLFILE {

	
		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.leafground.com/file.xhtml");
			
			 WebElement  DL=driver.findElement(By.xpath("//*[@id=\"j_idt93:j_idt95\"]/span[2]")); 
			  DL.click(); 
			  Thread.sleep(1000);
			  File file=new File("C:\\Users\\santhosh.kumar\\Downloads"); 
			  File[] f=file.listFiles(); for(File fl:f) { 
			  if(fl.getName().equals("TestLeaf Logo.png")) { 
			  System.out.println("FILE DOWNLOADED & STORED IN THE SYSTEM"); break; } } 

	}

}
