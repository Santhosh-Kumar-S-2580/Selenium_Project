package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class textBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		WebElement txt=driver.findElement(By.id("j_idt106:auto-complete_input"));
		txt.sendKeys("ss");
		Thread.sleep(1000);
        List<WebElement> ls=driver.findElements(By.xpath("//span[@id='j_idt106:auto-complete_panel']/ul/li"));
        int p=0;
        for(WebElement w:ls) {
        	//p++;
        	System.out.println(w.getText());
        	p++;
        	if(p==3) {
        	w.click();
        	break;
        	}
        	
        }
        
	}

}
