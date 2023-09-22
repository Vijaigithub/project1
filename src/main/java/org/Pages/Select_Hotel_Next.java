package org.Pages;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel_Next extends BaseClass {

	public Select_Hotel_Next() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id="continue")
	private WebElement btncontinue;
	
	@FindBy(id="cancel")
	private WebElement btncancel;
	
	@FindBy(id="location_0")
	private WebElement location;
	
	@FindBy(id="radiobutton_0")
	private WebElement btnradio;
	
	@FindBy(id="hotel_name_0")
	private WebElement hotelname;
	
	@FindBy(id="rooms_0")
	private WebElement norooms;
		
	@FindBy(id="arr_date_0")
	private WebElement checkindate;
	
	
	@FindBy(id="dep_date_0")
	private WebElement checkoutdate;
	
	
	@FindBy(id="no_days_0")
	private WebElement nofdays;
	

	@FindBy(id="room_type_0")
	private WebElement roomtype;
	
	
	@FindBy(id="price_night_0")
	private WebElement pricepernight;
	

	@FindBy(id="total_price_0")
	private WebElement totalprice;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getBtnradio() {
		return btnradio;
	}

	public WebElement getHotelname() {
		return hotelname;
	}

	public WebElement getNorooms() {
		return norooms;
	}

	public WebElement getCheckindate() {
		return checkindate;
	}

	public WebElement getCheckoutdate() {
		return checkoutdate;
	}

	public WebElement getNofdays() {
		return nofdays;
	}

	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getPricepernight() {
		return pricepernight;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}
	

	public WebElement getRadiobutton() {
		return radiobutton;
	}

	public WebElement getBtncontinue() {
		return btncontinue;
	}

	public WebElement getBtncancel() {
		return btncancel;
	}
}