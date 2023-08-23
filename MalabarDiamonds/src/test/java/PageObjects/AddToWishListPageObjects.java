package PageObjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class AddToWishListPageObjects {
	private static AddToWishListPageObjects AddToWishListPageObjectInstance=null;

	private AddToWishListPageObjects() {

	}

	public static AddToWishListPageObjects getInstance() {
		if(AddToWishListPageObjectInstance==null) {
			AddToWishListPageObjectInstance=new AddToWishListPageObjects();
		}
		return AddToWishListPageObjectInstance;
	}
	
	@FindBy(xpath="(//div[@class='wishlist '])")
	public static List<WebElement> wishlist;
	@FindBy(xpath="(//div[@class='wishlist  active'])")
	public static List<WebElement> wishlistactive;
	@FindBy(xpath="(//div[@class='msgBoxContent'])")
    private WebElement wishlistSuccessMsg;
	@FindBy(xpath="(//input[@class='msgButton'])")
    private WebElement wishlistOKBtn;
	@FindBy(xpath="(//span[@class='wishcount'])")
    private WebElement wishcount;
	
	
	public String getwishlistSuccessMsg() {
		CommonUtils.getInstance().highLightElement(wishlistSuccessMsg);
		return wishlistSuccessMsg.getText();
	}
	public String getwishcount() {
		CommonUtils.getInstance().highLightElement(wishcount);
		return wishcount.getText();
	}
	public void clkwishlistOKBtn() {
		CommonUtils.getInstance().highLightElement(wishlistOKBtn);
		wishlistOKBtn.click();
	}
	
	
	
}
