package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Booked_Itinery;
import org.Pages.Booking_Confirmation;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CancelOrder extends BaseClass {
	public String orderno;
	@Then("fill the details and book the Hotel and note generated order no")
	public void fill_the_details_and_book_the_Hotel_and_note_generated_order_no() {
		//Search hotel
		Search_Hotel s= new Search_Hotel();
		ddStringVisibleText(s.getDrplocation(), "Sydney");
		ddStringVisibleText(s.getDrphotels(), "Hotel Creek");
		ddStringVisibleText(s.getDrproomtype(), "Standard");
		ddStringValue(s.getDrproomnos(), "2");
		jsFill("20/01/2022",s.getDrpdatein());
		jsFill("21/01/2022",s.getDrpdateout());
		ddStringVisibleText(s.getDrpadult(), "1 - One");
		ddStringVisibleText(s.getDrpchild(), "0 - None");
		btnClick(s.getBtnsubmit());

		Select_Hotel_Next sn=new Select_Hotel_Next();
		btnClick(sn.getBtnradio());
		btnClick(sn.getBtncontinue()); 

		//Book A hotel
		Book_A_Hotel b=new Book_A_Hotel();
		fill(b.getFrstnametxt(), "Bk");
		fill(b.getLastnametxt(), "kanna");
		fill(b.getAdrstxt(), "Riga");
		fill(b.getCcnotxt(), "1234567891236547");
		ddStringVisibleText(b.getDrpcctype(), "American Express");
		ddStringVisibleText(b.getDrpccxpmnth(), "January");
		ddStringVisibleText(b.getDrpccxpyr(), "2022");
		fill(b.getCvvtxt(), "123");
		btnClick(b.getBtnbooknw());
		waitimplicit(1000);

		Booking_Confirmation bc = new Booking_Confirmation();
		WebElement order=jsScrollTop(bc.getOrderno());
		orderno=order.getAttribute("value");
		System.out.println(orderno);
	}



	@When("Click on Booked Itinerary")
	public void click_on_Booked_Itinerary() {
		Booking_Confirmation bc = new Booking_Confirmation();
		btnClick(bc.getBookItinery());

	}

	@Then("Search for order number booked")
	public void search_for_order_number_booked() {
		Booked_Itinery bi= new Booked_Itinery();
		fill(bi.getOdridsrch(), orderno);
		btnClick(bi.getBtngo());
	}

	@When("Click on Cancel Order Number")
	public void click_on_Cancel_Order_Number() {
		Booked_Itinery bi= new Booked_Itinery();
		btnClick(bi.getIdschcheckbox());
		btnClick(bi.getBtncancelall());

	}

	@Then("Click Yes on pop-up which asks where to cancel order or not")
	public void click_Yes_on_pop_up_which_asks_where_to_cancel_order_or_not() {
		alertOK();
	}

	@Then("Verify that order number is cancelled and now longer exists in Booked Itinerary page")
	public void verify_that_order_number_is_cancelled_and_now_longer_exists_in_Booked_Itinerary_page() {
		Booked_Itinery bi= new Booked_Itinery();
		fill(bi.getOdridsrch(), orderno);
		btnClick(bi.getBtngo());
		String s=bi.getSearchresult().getText();
		Assert.assertTrue(s.contains("0 result(s) found. "));

	}}