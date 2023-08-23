package practice;






import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class buttonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/");	
		WebElement e=driver.findElement(By.partialLinkText("Button"));
		e.click();
		/*WebElement b1=driver.findElement(By.id("home"));
		b1.click();*/
		org.openqa.selenium.Point xy=driver.findElement(By.id("position")).getLocation();
		System.out.println("x axis"+xy.getX()+"Y axis"+xy.getY());
		WebElement b3=driver.findElement(By.id("color"));
		System.out.println(b3.getAttribute("style"));
		WebElement b4=driver.findElement(By.id("size"));
		System.out.println(b4.getSize());

}
}