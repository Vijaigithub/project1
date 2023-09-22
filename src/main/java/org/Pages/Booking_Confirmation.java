package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Confirmation extends BaseClass {

	public Booking_Confirmation() {
		PageFactory.initElements(driver, this);
			}
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookItinery;

	@FindBy(id="search_hotel")
	private WebElement btncnfmsrchhotel;

	
	@FindBy(id="my_itinerary")
	private WebElement btnmyitinery;
	
	@FindBy(id="logout")
	private WebElement btnmyitinerylogout;
	
	@FindBy(id="order_no")
	private WebElement orderno;
	

	public WebElement getOrderno() {
		return orderno;
	}

	public WebElement getBtncnfmsrchhotel() {
		return btncnfmsrchhotel;
	}

	public WebElement getBtnmyitinery() {
		return btnmyitinery;
	}

	public WebElement getBtnmyitinerylogout() {
		return btnmyitinerylogout;
	}
	public WebElement getBookItinery() {
		return bookItinery;
		}
}