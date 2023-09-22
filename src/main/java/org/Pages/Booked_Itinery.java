package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinery extends BaseClass {
	
	public Booked_Itinery() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="order_id_text")
	private WebElement odridsrch;
	
	
	@FindBy(id="search_hotel_id")
	private WebElement btngo;
	
	@FindBy(name="ids[]")
	private WebElement idschcheckbox;
	
	@FindBy(name="cancelall")
	private WebElement btncancelall;
	
	@FindBy(id="search_hotel")
	private WebElement btnhtlsearch;
	
	@FindBy(id="logout")
	private WebElement btnitinerylogout;
	
	@FindBy(id="order_id_518117")
	private WebElement orderId;
	
	@FindBy(id="search_result_error")
	private WebElement searchresult;

	public WebElement getOrderId() {
		return orderId;
	}

	public WebElement getOdridsrch() {
		return odridsrch;
	}

	public WebElement getBtngo() {
		return btngo;
	}

	public WebElement getIdschcheckbox() {
		return idschcheckbox;
	}

	public WebElement getBtncancelall() {
		return btncancelall;
	}

	public WebElement getBtnhtlsearch() {
		return btnhtlsearch;
	}

	public WebElement getBtnitinerylogout() {
		return btnitinerylogout;
	}

	public WebElement getSearchresult() {
		return searchresult;
	}
	

	}

