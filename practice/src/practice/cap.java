package practice;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

class cap {

	public static void main(String[] args) throws IOException, TesseractException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\santhosh.kumar\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://makeuseofcode.github.io/CAPTCHA-Validator/");
		ArrayList<String> tb=new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tb);
		driver.switchTo().window(tb.get(0));
		WebElement img =driver.findElement(By.id("captcha"));
		File src=img.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\santhosh.kumar\\eclipse-workspace\\practice\\capcthaimg\\captcha.png";
		FileHandler.copy(src, new File(path));
		/*ITesseract image=new Tesseract();
		String str=image.doOCR(new File(path));
		System.out.println("Image OCR done");
		System.out.println(str);*/
	}

}
//captcha