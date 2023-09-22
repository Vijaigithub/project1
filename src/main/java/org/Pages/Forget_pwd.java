package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forget_pwd extends BaseClass {
	private Forget_pwd() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="emailadd_recovery")
	private WebElement rcvrymailtxt;
	
	@FindBy(id="Submit")
	private WebElement btnfrgtmailpwd;
	
	@FindBy(id="Reset")
	private WebElement btnfrgtrst;
	
	@FindBy(xpath="//a[text()='Go back to Login page']")
	private WebElement bcktologin;
}

