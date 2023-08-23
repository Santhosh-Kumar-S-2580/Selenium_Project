package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class AddToCartPageObjects {
	private static AddToCartPageObjects AddToCartPageObjectInstance=null;

	private AddToCartPageObjects() {

	}

	public static AddToCartPageObjects getInstance() {
		if(AddToCartPageObjectInstance==null) {
			AddToCartPageObjectInstance=new AddToCartPageObjects();
		}
		return AddToCartPageObjectInstance;
	}
	
	@FindBy(xpath="(//div[@class='image_wrapper']/a/img)[1]")
    private WebElement SelectProduct;
	@FindBy(xpath="//div[@class='product-name']/h1")
    private WebElement ProductName;
	@FindBy(xpath="(//div[@class='detail-page-procode'])[1]")
    private WebElement ProductCode;
	@FindBy(xpath="(//p[@class='availability in-stock'])[1]")
    private WebElement Avaliablity;
	@FindBy(xpath="(//span[@class='price'])[2]")
    private WebElement ProductPrice;
	@FindBy(xpath="(//button[@title='Buy Now'])[2]")
    private WebElement AddToCartBtn;
	@FindBy(css="li.success-msg")
    private WebElement AddToCartSuccessMsg;
	@FindBy(xpath="(//span[@class='continue_shopping'])[2]")
    private WebElement SaveandShoppingBtn;
	@FindBy(xpath="(//li[@class='myCartLi'])")
    private WebElement CartBtn;
	@FindBy(xpath="(//span[@class='close-btn'])[1]")
    private WebElement CloseCartBtn;
	
	
	public void clkSelectProduct() {
		CommonUtils.getInstance().highLightElement(SelectProduct);
		SelectProduct.click();
	}
	public String getProductName() {
		CommonUtils.getInstance().highLightElement(ProductName);
		return ProductName.getText();
	}
	public String getProductCode() {
		CommonUtils.getInstance().highLightElement(ProductCode);
		return ProductCode.getText();
	}
	public String getAvaliablity() {
		CommonUtils.getInstance().highLightElement(Avaliablity);
		return Avaliablity.getText();
	}
	public String getProductPrice() {
		CommonUtils.getInstance().highLightElement(ProductPrice);
		return ProductPrice.getText();
	}
	public void clkAddToCartBtn() {
		CommonUtils.getInstance().highLightElement(AddToCartBtn);
		AddToCartBtn.click();
	}
	public String getAddToCartSuccessMsg() {
		CommonUtils.getInstance().highLightElement(AddToCartSuccessMsg);
		return AddToCartSuccessMsg.getText();
	}
	public void clkSaveandShoppingBtn() {
		CommonUtils.getInstance().highLightElement(SaveandShoppingBtn);
		SaveandShoppingBtn.click();
	}
	public void clkCartBtn() {
		CommonUtils.getInstance().highLightElement(CartBtn);
		CartBtn.click();
	}
	public void clkCloseCartBtn() {
		CommonUtils.getInstance().highLightElement(CloseCartBtn);
		CloseCartBtn.click();
	}
	
	
	
}
