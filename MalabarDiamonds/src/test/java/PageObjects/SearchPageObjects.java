package PageObjects;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class SearchPageObjects {
	
private static SearchPageObjects SearchPageObjectInstance=null;

private SearchPageObjects() {

}

public static SearchPageObjects getInstance() {
	if(SearchPageObjectInstance==null) {
		SearchPageObjectInstance=new SearchPageObjects();
	}
	return SearchPageObjectInstance;
}
	@FindBy(id="search")
    private WebElement SearchTxtBox;
	@FindBy(css="li.search")
    private WebElement SearchResultText;
	@FindBy(xpath="//*[@class='products-grid col-xs-16']/li")
    public static List<WebElement> productPrice;
	@FindBy(xpath="//div[@class='image_wrapper']/a/img")
	public static List<WebElement> productTitle;
	@FindBy(xpath="(//span[@class='selected_text'])[17]")
    private WebElement selectProductTypeBox;
	@FindBy(partialLinkText="Ring")
    private WebElement selectProductType;
	@FindBy(xpath="(//span[@class='selected_text'])[19]")
    private WebElement selectPriceBox;
	@FindBy(xpath="(//a[@class='amshopby-price-top amshopby-attr'])[2]")
    private WebElement selectPrice;
	@FindBy(xpath="//*[@class='products-grid col-xs-16']/li")
	public static List<WebElement> AfterFilterproductPrice;
	@FindBy(xpath="//div[@class='image_wrapper']/a/img")
	public static List<WebElement> AfterFilterproductTitle;
	
			
	public void enterSearchTerm(String search) {
		CommonUtils.getInstance().highLightElement(SearchTxtBox);
		SearchTxtBox.sendKeys(search+Keys.ENTER);
	}
	public String getSearchResultTxt() {
		CommonUtils.getInstance().highLightElement(SearchResultText);
		return SearchResultText.getText();
	}
	public void clkselectProductTypeBox() {
		CommonUtils.getInstance().highLightElement(selectProductTypeBox);
		selectProductTypeBox.click();
	}
	public void clkselectProductType() {
		CommonUtils.getInstance().highLightElement(selectProductType);
		selectProductType.click();
	}
	public String getselectProductType() {
		CommonUtils.getInstance().highLightElement(selectProductType);
		return selectProductType.getText();
	}
	
	public void clkselectPriceBox() {
		CommonUtils.getInstance().highLightElement(selectPriceBox);
		selectPriceBox.click();
	}
	public void clkselectPrice() {
		CommonUtils.getInstance().highLightElement(selectPrice);
		selectPrice.click();
	}
	public String getselectPrice() {
		CommonUtils.getInstance().highLightElement(selectPrice);
		return selectPrice.getText();
	}
	
	
}
       
























