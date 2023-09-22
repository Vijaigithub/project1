package org.stepdefinition;

import java.util.List;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Booking_Confirmation;
import org.openqa.selenium.WebElement;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class OrdernoGenerated extends BaseClass {
	@Then("fill the details and verify orderno. is generated")
	public void fill_the_details_and_verify_orderno_is_generated(DataTable data) {
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
		
		Booking_Confirmation bc = new Booking_Confirmation();
		WebElement orderid=jsScrollTop(bc.getOrderno());
	    String val1=orderid.getAttribute("value");
	    System.out.println("Order no. is " +val1);
	   
	}
}
