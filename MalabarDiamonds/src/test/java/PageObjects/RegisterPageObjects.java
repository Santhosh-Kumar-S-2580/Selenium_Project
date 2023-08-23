package PageObjects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class RegisterPageObjects {
		
private static RegisterPageObjects RegisterPageObjectInstance=null;
	
	private RegisterPageObjects() {

	}
	
	public static RegisterPageObjects getInstance() {
		if(RegisterPageObjectInstance==null) {
			RegisterPageObjectInstance=new RegisterPageObjects();
		}
		return RegisterPageObjectInstance;
	}
	@FindBy(linkText="Profile")
	 private WebElement ProfileBtn;
	@FindBy(xpath="(//a[@class='f-left'])[2]")
	private WebElement SignInBtn;
	@FindBy(id="salutation")
	private WebElement SalutationDD;
	@FindBy(id="firstname")
	private WebElement fname; 
	@FindBy(id="lastname")
	private WebElement lname;
	@FindBy(id="email_address")
	private WebElement email;
	@FindBy(id="mobile")
	private WebElement mobile;
	@FindBy(id="password")
	private WebElement pwd;
	@FindBy(id="confirmation")
	private WebElement cfmpwd;
	@FindBy(css="button.button.customsave")
	private WebElement register;
	@FindBy(className="success-msg")
	private WebElement SuccessMsg;
	
	
	
	
	public void clkProfileBtn() {
		CommonUtils.getInstance().highLightElement(ProfileBtn);
		ProfileBtn.click();
	}
	public void clkSignInBtn() {
		CommonUtils.getInstance().highLightElement(SignInBtn);
		SignInBtn.click();
	}

	public WebElement getSalutationDD() {
		CommonUtils.getInstance().highLightElement(SalutationDD);
		return SalutationDD;
	}
	public void enterProfileFirstname(String firstName) {
		CommonUtils.getInstance().highLightElement(fname);
		fname.sendKeys(firstName);
	}
	public void enterProfileLastName(String LastName) {
		CommonUtils.getInstance().highLightElement(lname);
		lname.sendKeys(LastName);
	}
	public void enterProfileEmail(String emailID) {
		CommonUtils.getInstance().highLightElement(email);
		email.sendKeys(emailID);
	}
	public void enterProfileMobile(String Phno) {
		CommonUtils.getInstance().highLightElement(mobile);
		mobile.sendKeys(Phno);
	}
	public void enterProfilePwd(String Pass) {
		CommonUtils.getInstance().highLightElement(pwd);
		pwd.sendKeys(Pass);
	}
	public void enterProfileCfmPwd(String Pass1) {
		CommonUtils.getInstance().highLightElement(cfmpwd);
		cfmpwd.sendKeys(Pass1);
	}
	public void clkRegisterBtn() {
		CommonUtils.getInstance().highLightElement(register);
		register.click();
	}
	public String ProfileSuccessMsg() {
		CommonUtils.getInstance().highLightElement(SuccessMsg);
		return SuccessMsg.getText();
	}
}
























//id firstname
//
//id lastname
//
//id email_address
//id mobile
//
//id password
//id confirmation
//
//css button.button.customsave
/*
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

*/