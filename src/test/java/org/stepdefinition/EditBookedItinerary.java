package org.stepdefinition;

import java.io.IOException;
import java.util.List;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Booked_Itinery;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class EditBookedItinerary extends BaseClass {

	@Then("fill the details and click on Book now button")
	public void fill_the_details_and_click_on_Book_now_button(DataTable data) {
		List<String>list=data.asList();
		String firstname=list.get(0);
		String lastname=list.get(1);
		String Address=list.get(2);
		String creditcard=list.get(3);
		String cardtype=list.get(4);
		String expirymonth=list.get(5);
		String expiryyear=list.get(6);
		String cvv=list.get(7);

		Book_A_Hotel b=new Book_A_Hotel();
		fill(b.getFrstnametxt(), firstname);
		fill(b.getLastnametxt(), lastname);
		fill(b.getAdrstxt(), Address);
		fill(b.getCcnotxt(), creditcard);
		ddStringVisibleText(b.getDrpcctype(), cardtype);
		ddStringVisibleText(b.getDrpccxpmnth(), expirymonth);
		ddStringVisibleText(b.getDrpccxpyr(), expiryyear);
		fill(b.getCvvtxt(), cvv);
		btnClick(b.getBtnbooknw());
		waitimplicit(1000);
	}
	@Then("Verify that the details {string} are not editable")
	public void verify_that_the_details_are_not_editable(String detail)  throws IOException {
		Booked_Itinery itinerary= new Booked_Itinery();
		WebElement orderid=itinerary.getOrderId();
		orderid.clear();
		fill(orderid, detail);
		screenshot("Orderid");
	}

}
