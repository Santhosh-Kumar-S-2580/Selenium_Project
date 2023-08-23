package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class PlaceOrderPageObjects {
	private static PlaceOrderPageObjects PlaceOrderPageObjectInstance=null;

	private PlaceOrderPageObjects() {

	}

	public static PlaceOrderPageObjects getInstance() {
		if(PlaceOrderPageObjectInstance==null) {
			PlaceOrderPageObjectInstance=new PlaceOrderPageObjects();
		}
		return PlaceOrderPageObjectInstance;
	}
	
	@FindBy(xpath="(//button[@title='Order Now'])[1]")
    private WebElement placeOrderBtn;
	@FindBy(id="billing:firstname")
    private WebElement placeOrderusrfname; 
    @FindBy(id="billing:lastname")
    private WebElement placeOrderusrlname;
    @FindBy(id="billing:street1")
    private WebElement placeOrderAddressTxtBox;
    @FindBy(id="billing:street2")
    private WebElement placeOrderLandMark;
    @FindBy(id="billing:telephone")
    private WebElement placeOrderTelePhno;
    @FindBy(id="billing:postcode")
    private WebElement placeOrderzipcode;
    @FindBy(id="billing:city")
    private WebElement placeOrdercity;
    @FindBy(id="billing:country_id")
  	public static WebElement placeOrdercountryDropDown;
    @FindBy(id="billing:region_id")
  	public static WebElement placeOrderStateDropDown;
    @FindBy(xpath="//div[@class='cart_content']")
    private WebElement OrderSummary;
    @FindBy(css="table#shopping-cart-totals-table")
    private WebElement OrderSummaryPrice;
    @FindBy(css="input#accept_term_ship.input-text.required-entry")
    private WebElement TermsChkBox;
    @FindBy(css="button.button.btn-checkout.billingbutton")
    private WebElement ChkoutBtn;
    @FindBy(css="button.button.btn-checkout.paymentbutton.clearFix")
    private WebElement placeOrder1;
      
    
    public void clkplaceOrderBtn() {
		CommonUtils.getInstance().highLightElement(placeOrderBtn);
		placeOrderBtn.click();
	}
    public void clkplaceOrder1() {
		CommonUtils.getInstance().highLightElement(placeOrder1);
		placeOrder1.click();
	}
    public void clkTermsChkBox() {
		CommonUtils.getInstance().highLightElement(TermsChkBox);
		TermsChkBox.click();
	}
    public void clkChkoutBtn() {
		CommonUtils.getInstance().highLightElement(ChkoutBtn);
		ChkoutBtn.click();
	}
    public void enterplaceOrderusrfname(String firstName) {
 		CommonUtils.getInstance().highLightElement(placeOrderusrfname);
 		placeOrderusrfname.clear();
 		placeOrderusrfname.sendKeys(firstName);
 	}
 	public void enterplaceOrderusrlname(String LastName) {
 		CommonUtils.getInstance().highLightElement(placeOrderusrlname);
 		placeOrderusrlname.clear();
 		placeOrderusrlname.sendKeys(LastName);
 	}
 	public void enterplaceOrderTelePhno(String Phno) {
		CommonUtils.getInstance().highLightElement(placeOrderTelePhno);
		placeOrderTelePhno.clear();
		placeOrderTelePhno.sendKeys(Phno);
	}
 	
 	public void enterplaceOrderAddressTxtBox(String address) {
 		CommonUtils.getInstance().highLightElement(placeOrderAddressTxtBox);
 		placeOrderAddressTxtBox.clear();
 		placeOrderAddressTxtBox.sendKeys(address);
 	}
 	public void enterplaceOrderLandMark(String lndmark) {
 		CommonUtils.getInstance().highLightElement(placeOrderLandMark);
 		placeOrderLandMark.clear();
 		placeOrderLandMark.sendKeys(lndmark);
 	}
 	public void enterplaceOrderzipcode(String zip) {
 		CommonUtils.getInstance().highLightElement(placeOrderzipcode);
 		placeOrderzipcode.clear();
 		placeOrderzipcode.sendKeys(zip);
 	}
 	public void enterplaceOrdercity(String cty) {
 		CommonUtils.getInstance().highLightElement(placeOrdercity);
 		placeOrdercity.clear();
 		placeOrdercity.sendKeys(cty);
 	}
 	 public static WebElement getplaceOrdercountryDropDown() {
    	 CommonUtils.getInstance().highLightElement(placeOrdercountryDropDown);
		return placeOrdercountryDropDown;
	}

	public static WebElement getplaceOrderStateDropDown() {
		CommonUtils.getInstance().highLightElement(placeOrderStateDropDown);
		return placeOrderStateDropDown;
	}
	
	public String getOrderSummary() {
		CommonUtils.getInstance().highLightElement(OrderSummary);
		return OrderSummary.getText();
		
	}
	public String getOrderSummaryPrice() {
		CommonUtils.getInstance().highLightElement(OrderSummaryPrice);
		return OrderSummaryPrice.getText();
		
	}
    
    
    
}
