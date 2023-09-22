package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page extends BaseClass {
	
	
	public Login_Page() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement textuser;
	
	@FindBy(id="password")
	private WebElement textpass;
	
	@FindBy(id="login")
	private WebElement loginbutton;
	
	@FindBy(linkText="Forgot Password?")
	private WebElement forgetpassbutton;
	
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement createaccount;
	
	@FindBy(partialLinkText="info@adactin.com")
	private WebElement emaillink;
	
	public WebElement getTextuser() {
		return textuser;
	}

	public WebElement getCreateaccount() {
		return createaccount;
	}

	public WebElement getEmaillink() {
		return emaillink;
	}

	public WebElement getTextpass() {
		return textpass;
	}

	public WebElement getLoginbutton() {
		return loginbutton;
	}

	public WebElement getForgetpassbutton() {
		return forgetpassbutton;
	}
	
}

