package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class txt1change {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");

		WebElement lbl1=driver.findElement(By.id("j_idt106:j_idt113"));
		System.out.println(" Label Position before Changed");
		int x1=lbl1.getLocation().getX();
		int y1=lbl1.getLocation().getY();
		System.out.println("x="+x1);
		System.out.println("y="+y1);
		WebElement txt=driver.findElement(By.id("j_idt106:float-input"));
		txt.sendKeys("ss");
		Thread.sleep(1000);

		WebElement lbl2=driver.findElement(By.id("j_idt106:j_idt113"));
		System.out.println(" Label Position After Changed");
		int x2=lbl1.getLocation().getX();
		int y2=lbl1.getLocation().getY();
		System.out.println("x="+x2);
		System.out.println("y="+y2);
		
		if(x1==x2 && y1==y2)
		{
			System.out.println(" Label Position Not Changed");
		}
		else {
			System.out.println(" Label Position Changed");
		}
		
//		driver.findElement(By.id("j_idt106:j_idt116_input")).sendKeys("1/12/2022"+Keys.ENTER);
//        Thread.sleep(1000);
//		driver.findElement(By.className("ui-button-text")).click();
	}

}
