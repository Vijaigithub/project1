package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Verifydate extends BaseClass {
	Search_Hotel search;
	public String getcheckindate;
	@When("Enter and get check- indate {string}")
	public void enter_and_get_check_indate(String indate) {
		search= new Search_Hotel();
		WebElement locateinelement=search.getDrpdatein();
		jsFill(indate, locateinelement);
		getcheckindate=locateinelement.getAttribute("value");
	}
	public String getcheckoutdate;
	@When("Enter and get check- outdate {string}")
	public void enter_and_get_check_outdate(String outdate) {
		search= new Search_Hotel();
		WebElement locateoutelement=search.getDrpdateout();
		jsFill(outdate, locateoutelement);
		getcheckoutdate=locateoutelement.getAttribute("value"); 
	}
	@Then("Verify that check-in-date and check-out-dates are the same as selected in search hotel form.")
	public void verify_that_check_in_date_and_check_out_dates_are_the_same_as_selected_in_search_hotel_form() {
		 
		Select_Hotel_Next select=new Select_Hotel_Next();
		WebElement datein=select.getCheckindate();
		String printedcheckin=datein.getAttribute("value");
		System.out.println(datein.getAttribute("value"));
		
		select =new Select_Hotel_Next();
		WebElement dateout=select.getCheckoutdate();
		String printedcheckout=dateout.getAttribute("value");
		System.out.println(dateout.getAttribute("value"));
		
		Assert.assertEquals("Both are same", getcheckindate, printedcheckin);
		Assert.assertEquals("Both are same", getcheckoutdate, printedcheckout);
	}}


