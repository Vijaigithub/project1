package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel extends BaseClass {

	public Search_Hotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement searchtxtlink;
	
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookeditinerylink;
	
	@FindBy(xpath="//a[text()='Change Password']	")
	private WebElement changepwdlink;
	
	@FindBy(xpath="//a[text()='Logout']	")
	private WebElement logoutlink;

	@FindBy(id="location")
	private WebElement drplocation;

	@FindBy(id="hotels")
	private WebElement drphotels;
	
	@FindBy(id="room_type")
	private WebElement drproomtype;
	
	@FindBy(id="room_nos")
	private WebElement drproomnos;
	
	@FindBy(name="datepick_in")
	private WebElement drpdatein;
	
	@FindBy(name="datepick_out")
	private WebElement drpdateout;
	
	@FindBy(id="adult_room")
	private WebElement drpadult;
	
	@FindBy(xpath="//td[@class='login_title']")
	private WebElement searchTitle;
	
	

	public WebElement getSearchTitle() {
		return searchTitle;
	}

	public WebElement getSearchtxtlink() {
		return searchtxtlink;
		
	}

	public WebElement getBookeditinerylink() {
		return bookeditinerylink;
	}

	public WebElement getChangepwdlink() {
		return changepwdlink;
	}

	public WebElement getLogoutlink() {
		return logoutlink;
	}

	public WebElement getDrplocation() {
		return drplocation;
	}

	public WebElement getDrphotels() {
		return drphotels;
	}

	public WebElement getDrproomtype() {
		return drproomtype;
	}

	public WebElement getDrproomnos() {
		return drproomnos;
	}

	public WebElement getDrpdatein() {
		return drpdatein;
	}

	public WebElement getDrpdateout() {
		return drpdateout;
	}

	public WebElement getDrpadult() {
		return drpadult;
	}

	public WebElement getDrpchild() {
		return drpchild;
	}

	public WebElement getBtnsubmit() {
		return btnsubmit;
	}

	public WebElement getBtnreset() {
		return btnreset;
	}

	public WebElement getMobapplink() {
		return mobapplink;
	}

	public WebElement getTestcaselink() {
		return testcaselink;
	}

	public WebElement getDefectlink() {
		return defectlink;
	}

	public WebElement getAbtlink() {
		return abtlink;
	}

	public WebElement getIntlink() {
		return intlink;
	}

	@FindBy(id="child_room")
	private WebElement drpchild;
	
	@FindBy(id="Submit")
	private WebElement btnsubmit;
	
	@FindBy(id="Reset")
	private WebElement btnreset;
	
	@FindBy(xpath="(//a[@target='_blank' and text()='DOWNLOAD'])[1]")
	private WebElement mobapplink;

	@FindBy(xpath="((//a[text()='DOWNLOAD'])[2]")
	private WebElement testcaselink;
	
	@FindBy(xpath="(//a[text()='DOWNLOAD'])[3]")
	private WebElement defectlink;
	
	@FindBy(xpath="//a[text()='www.adactin.com']")
	private WebElement abtlink;
	
	@FindBy(xpath="(//a[text()='Click'])[3]")
	private WebElement intlink;
}