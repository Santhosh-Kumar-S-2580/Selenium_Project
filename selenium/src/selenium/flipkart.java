package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		System.setProperty("webdriver.edge.driver","C:\\Users\\santhosh.kumar\\Downloads\\edgedriver_win32\\msedgedriver.exe");
		WebDriver driver =new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
		//Locating the Main Menu (Parent element)
		WebElement mainMenu = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]/div/div"));

		//Instantiating Actions class
		Actions actions = new Actions(driver);

		//Hovering on main menu
		actions.moveToElement(mainMenu);
		Thread.sleep(2000);
		//Locating the element from Sub Menu
		WebElement subMenu = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[3]/a[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/a[1]"));

		//To mouseover on sub menu
		actions.moveToElement(subMenu);

		//build()- used to compile all the actions into a single step 
		actions.click().build().perform();
	}

}
