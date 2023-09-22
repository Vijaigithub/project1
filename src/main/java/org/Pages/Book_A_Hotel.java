package org.Pages;

import org.BaseClass.BaseClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_A_Hotel extends BaseClass {
	
		public Book_A_Hotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement frstnametxt;
	
	@FindBy(id="last_name")
	private WebElement lastnametxt;
	
	@FindBy(id="address")
	private WebElement adrstxt;
	
	@FindBy(id="cc_num")
	private WebElement ccnotxt;

	@FindBy(id="cc_type")
	private WebElement drpcctype;

	@FindBy(id="cc_exp_month")
	private WebElement drpccxpmnth;
	
	@FindBy(id="cc_exp_year")
	private WebElement drpccxpyr;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvtxt;
	
	@FindBy(id="book_now")
	private WebElement btnbooknw;
	
	@FindBy(id="cancel")
	private WebElement btnbookcancel;
	
	@FindBy(id="room_num_dis")
	private WebElement noofrooms;
	
	@FindBy(id="total_days_dis")
	private WebElement totaldays;
	
	@FindBy(id="price_night_dis")
	private WebElement pricepernight;
	
	@FindBy(id="total_price_dis")
	private WebElement totalprice;
	
	@FindBy(id="gst_dis")
	private WebElement gst;
	
	@FindBy(id="final_price_dis")
	private WebElement fianalprice;
	
	@FindBy(id="hotel_name_dis")
	private WebElement hotelName;
	
	@FindBy(id="location_dis")
	private WebElement location;
	
	@FindBy(id="room_type_dis")
	private WebElement roomtype;
	
	public WebElement getRoomtype() {
		return roomtype;
	}

	public WebElement getHotelName() {
	return hotelName;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getGst() {
	return gst;
		}

	public WebElement getFianalprice() {
		return fianalprice;
	}

	public WebElement getNoofrooms() {
		return noofrooms;
	}

	public WebElement getTotaldays() {
		return totaldays;
	}

	public WebElement getPricepernight() {
		return pricepernight;
	}

	public WebElement getTotalprice() {
		return totalprice;
	}

	public WebElement getFrstnametxt() {
		return frstnametxt;
	}

	public WebElement getLastnametxt() {
		return lastnametxt;
	}

	public WebElement getAdrstxt() {
		return adrstxt;
	}

	public WebElement getCcnotxt() {
		return ccnotxt;
	}

	public WebElement getDrpcctype() {
		return drpcctype;
	}

	public WebElement getDrpccxpmnth() {
		return drpccxpmnth;
	}

	public WebElement getDrpccxpyr() {
		return drpccxpyr;
	}

	public WebElement getCvvtxt() {
		return cvvtxt;
	}

	public WebElement getBtnbooknw() {
		return btnbooknw;
	}

	public WebElement getBtnbookcancel() {
		return btnbookcancel;
	}
}