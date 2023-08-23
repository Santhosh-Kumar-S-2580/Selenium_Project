package practice;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st =new Scanner(System.in);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");	
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		WebElement e=driver.findElement(By.partialLinkText("Edit"));
		e.click();
		System.out.println("enter the emailid");
		String em=st.nextLine();
		WebElement t1=driver.findElement(By.id("email"));
		t1.sendKeys(em);
		WebElement t2=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input"));
		t2.sendKeys("text");
		WebElement t3= driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/input"));
		String s1=t3.getAttribute("value");
		System.out.println(s1);
		WebElement t4=driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input"));
	    t4.clear();
		WebElement t5 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input"));
		boolean b =t5.isEnabled();
		//System.out.println(b);
		if(b==true) {
			System.out.println("textbox is enabled");
		}
		else
		{
			System.out.println("textbox is disabled");
		}
	}
}
