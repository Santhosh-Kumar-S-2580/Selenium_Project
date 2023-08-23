package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class UserAccountPageObjects {
	
	
private static UserAccountPageObjects UserAccountPageObjectInstance=null;
	
	private UserAccountPageObjects() {

	}
	
	public static UserAccountPageObjects getInstance() {
		if(UserAccountPageObjectInstance==null) {
			UserAccountPageObjectInstance=new UserAccountPageObjects();
		}
		return UserAccountPageObjectInstance;
	}
	

	 @FindBy(id="editprofile")
     private WebElement editbtn;
     @FindBy(id="firstname")
     private WebElement usrfname; 
     @FindBy(id="lastname")
     private WebElement usrlname;
     @FindBy(id="mobile")
     private WebElement usrmobile;
     @FindBy(xpath="(//input[@name='cusgender'])[1]")
     private WebElement gender;
     @FindBy(id="pincode")
     private WebElement Profilepincode;
     @FindBy(id="cusfulldate")
     private WebElement dob;
     @FindBy(css="div.single_input")
     private WebElement RelationStatus;
     @FindBy(id="save_profile")
     private WebElement saveProfile;
     @FindBy(linkText="My Address")
     private WebElement Addresstab;
     @FindBy(id="street_1")
     private WebElement AddressTxtBox;
     @FindBy(id="country")
   	 public static WebElement countryDropDown;
     @FindBy(id="city")
     private WebElement city;
     @FindBy(id="street_2")
     private WebElement LandMark;
     @FindBy(id="zip")
     private WebElement zipcode;
     @FindBy(id="region_id")
   	 public static WebElement state;
     @FindBy(id="telephone")
     private WebElement TelePhno;
     @FindBy(xpath="//*[@id=\"form-validate\"]/div[3]/button[1]")
     private WebElement saveAddress;
     @FindBy(id="advice-validate-select-region_id")
     private WebElement stateErrMsg;
     @FindBy(id="advice-required-entry-firstname")
     private WebElement usrfnameErrMsg; 
     @FindBy(id="advice-required-entry-lastname")
     private WebElement usrlnameErrMsg;
     @FindBy(id="advice-required-entry-mobile")
     private WebElement usrmobileErrMsg;
     @FindBy(id="advice-required-entry-email")
     private WebElement emailErrMsg;
     @FindBy(id="advice-required-entry-pincode")
     private WebElement zipcodeErrMsg;
     @FindBy(id="advice-required-entry-cusfulldate")
     private WebElement dobErrMsg;
     @FindBy(id="advice-required-entry-zip")
     private WebElement AddressPincodeErrMsg;
     @FindBy(id="advice-required-entry-street_1")
     private WebElement AddressErrMsg;
     @FindBy(id="advice-required-entry-city")
     private WebElement cityErrMsg;
     @FindBy(id="advice-required-entry-telephone")
     private WebElement TelePhnoErrMsg;
     
     
     
     public void clkEditBtn() {
 		CommonUtils.getInstance().highLightElement(editbtn);
 		editbtn.click();
 	}   
     public void enterProfileUpdateFirstname(String firstName) {
 		CommonUtils.getInstance().highLightElement(usrfname);
 		usrfname.clear();
 		usrfname.sendKeys(firstName);
 	}
 	public void enterProfileUpdateLastName(String LastName) {
 		CommonUtils.getInstance().highLightElement(usrlname);
 		usrlname.clear();
 		usrlname.sendKeys(LastName);
 	}
 	public void enterProfileUpdateMobile(String Phno) {
		CommonUtils.getInstance().highLightElement(usrmobile);
		usrmobile.clear();
		usrmobile.sendKeys(Phno);
	}
 	public void selectGender() {
 		CommonUtils.getInstance().highLightElement(gender);
 		gender.click();
 	}
 	public void selectRelationStatus() {
 		CommonUtils.getInstance().highLightElement(RelationStatus);
 		RelationStatus.click();
 	}
 	public void enterProfilePincode(String pincode) {
 		CommonUtils.getInstance().highLightElement(Profilepincode);
 		Profilepincode.sendKeys(pincode);
 	}
 	public void enterProfileDob(String date) {
 		CommonUtils.getInstance().highLightElement(dob);
 		dob.sendKeys(date);
 	}
 	public void clkSaveProfileBtn() {
		CommonUtils.getInstance().highLightElement(saveProfile);
		saveProfile.click();
	}
 	public void clkAddressTab() {
		CommonUtils.getInstance().highLightElement(Addresstab);
		Addresstab.click();
	}
 	public void enterAddress(String address) {
 		CommonUtils.getInstance().highLightElement(AddressTxtBox);
 		AddressTxtBox.sendKeys(address);
 	}
 	public void enterLandMark(String lndmark) {
 		CommonUtils.getInstance().highLightElement(LandMark);
 		LandMark.sendKeys(lndmark);
 	}
 	public void enterZipcode(String zip) {
 		CommonUtils.getInstance().highLightElement(zipcode);
 		zipcode.sendKeys(zip);
 	}
 	public void enterCity(String cty) {
 		CommonUtils.getInstance().highLightElement(city);
 		city.sendKeys(cty);
 	}
 	public void enterTeleph(String tele) {
 		CommonUtils.getInstance().highLightElement(TelePhno);
 		TelePhno.sendKeys(tele);
 	} 	
    public static WebElement getCountryDropDown() {
    	 CommonUtils.getInstance().highLightElement(countryDropDown);
		return countryDropDown;
	}

	public static WebElement getState() {
		CommonUtils.getInstance().highLightElement(state);
		return state;
	}
	public void clkSaveAddressBtn() {
		CommonUtils.getInstance().highLightElement(saveAddress);
		saveAddress.click();
	}

     
     
     
     
     
}









