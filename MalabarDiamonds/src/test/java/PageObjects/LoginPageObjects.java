package PageObjects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import CommonUtils.CommonUtils;

public class LoginPageObjects {
	
	
private static LoginPageObjects LoginPageObjectInstance=null;
	
	private LoginPageObjects() {

	}
	
	public static LoginPageObjects getInstance() {
		if(LoginPageObjectInstance==null) {
			LoginPageObjectInstance=new LoginPageObjects();
		}
		return LoginPageObjectInstance;
	}
	@FindBy(xpath="(//a[@class='f-left'])[1]")
	 private WebElement LoginBtn;
	@FindBy(id="email")
	private WebElement loginemail;
	@FindBy(id="pass")
	private WebElement loginpwd;
	@FindBy(className="error-msg")
	private WebElement ErrorMsg;
	@FindBy(css="span.account_holder_name.hidden-xs")
	private WebElement grtMsg;
	@FindBy(id="send2")
	private WebElement logintocontinue;
	
	
	public void clkLoginBtn() {
		LoginBtn.click();
	}
	public void enterLoginEmail(String username) {
		CommonUtils.getInstance().highLightElement(loginemail);
		loginemail.sendKeys(username);
	}
	public void enterLoginPwd(String password) {
		CommonUtils.getInstance().highLightElement(loginpwd);
		loginpwd.sendKeys(password);
	}
	public String showLoginErrMsg() {
		CommonUtils.getInstance().highLightElement(ErrorMsg);
		return ErrorMsg.getText();
	}
	public String showLoginGrtMsg() {
		 CommonUtils.getInstance().highLightElement(grtMsg);
		 return grtMsg.getText();
	}
	public void clkLoginToCtnBtn() {
		CommonUtils.getInstance().highLightElement(logintocontinue);
		logintocontinue.click();
	}
}
