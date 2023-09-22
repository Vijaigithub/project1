package org.Pages;


import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create_Accont  extends BaseClass{
	private Create_Accont() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Go back to Login page']")
	private WebElement backloginlink;
		
	@FindBy(id="username")
	private WebElement usernametxt;
	
	@FindBy(id="password")
	private WebElement passwordtxt;
	
	@FindBy(id="re_password")
	private WebElement repwdtxt;
	
	@FindBy(id="full_name")
	private WebElement fullnametxt;
		
	@FindBy(id="email_add")
	private WebElement emailtxt;
	
	@FindBy(id="captcha-form")
	private WebElement captchatxt;
	
	@FindBy(id="tnc_box")
	private WebElement chkbox;
	
	@FindBy(id="Reset")
	private WebElement btnreset;
	
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	private WebElement termlink;
}