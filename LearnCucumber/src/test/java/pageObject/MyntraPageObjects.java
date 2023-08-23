package pageObject;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraPageObjects {
	 @FindBy(xpath="//input")
	 public static WebElement SearchTextbox;
	 @FindBy(xpath="//h1[@class='title-title']")
	 public static WebElement ProductTitle;
	 @FindBy(xpath="//span[@class='title-count']")
	 public static WebElement ProductCount;
	 @FindBy(xpath="//*[@class='product-product']")
	 public static List<WebElement> SearchProducts;
	 @FindBy(xpath="//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[2]/ul/li[1]/label")
	 public static WebElement FliterRdBox;
	 @FindBy(xpath="//*[@id=\"mountRoot\"]/div/main/div[3]/div[1]/section/div/div[3]/ul/li[1]/label")
	 public static WebElement FliterChkBox;
	 
}
//driver.findElement(By.xpath("//input")).sendKeys("Mobile Accessories"+Keys.ENTER);
//System.out.println("Search result displayed Sucessfully");
//driver.findElement(By.xpath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]")).click();
//System.out.println("Click on the Product sucessfully & Navigated the product page");


//product title =css -> h1.title-title
//product count css span.title-count
//search products //*[@class='product-product']


