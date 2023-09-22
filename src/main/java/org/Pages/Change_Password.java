package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Change_Password extends BaseClass {

	private Change_Password() {
	PageFactory.initElements(driver, this);
}

@FindBy(id="current_pass")
private WebElement cntpwdtxt;

@FindBy(id="new_password")
private WebElement nwpwdtxt;

@FindBy(id="re_password")
private WebElement cnfmpwdtxt;

@FindBy(id="Submit")
private WebElement chngpwdsbmt;

public WebElement getCntpwdtxt() {
	return cntpwdtxt;
}

public WebElement getNwpwdtxt() {
	return nwpwdtxt;
}

public WebElement getCnfmpwdtxt() {
	return cnfmpwdtxt;
}

public WebElement getChngpwdsbmt() {
	return chngpwdsbmt;
}

}