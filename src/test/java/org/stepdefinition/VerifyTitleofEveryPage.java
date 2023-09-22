package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyTitleofEveryPage extends BaseClass{
	
	@Then("Verify that title of each page is the same as the page objective")
	public void verify_that_title_of_each_page_is_the_same_as_the_page_objective() {
		String s=driver.getTitle();
		Assert.assertTrue(s.contains("Adactin.com - Search Hotel"));
		
	 	 }

	@When("Click on Search hotel option and verify whether application directs to search hotel form")
	public void click_on_Search_hotel_option_and_verify_whether_application_directs_to_search_hotel_form() {
		Search_Hotel s;
		s= new Search_Hotel();
		 ddStringVisibleText(s.getDrplocation(), "Sydney");
		 ddStringVisibleText(s.getDrphotels(), "Hotel Creek");
		 ddStringVisibleText(s.getDrproomtype(), "Standard");
		 ddStringValue(s.getDrproomnos(), "2");
		 jsFill("25/01/2022",s.getDrpdatein());
		 jsFill("26/01/2022",s.getDrpdateout());
		 btnClick(s.getBtnsubmit());
		 
		 String SelectTitle=driver.getTitle();
		 Assert.assertTrue(SelectTitle.contains("Adactin.com - Select Hotel"));
		 	    
	}

	@Then("Click on booked itinerary button and verify that application directs to booked itinerary form")
	public void click_on_booked_itinerary_button_and_verify_that_application_directs_to_booked_itinerary_form() {
	    Select_Hotel_Next shn= new Select_Hotel_Next();
	    btnClick(shn.getBtnradio());
	    btnClick(shn.getBtncontinue());
	    
	    String BookTitle=driver.getTitle();
		Assert.assertTrue(BookTitle.contains("Adactin.com - Book A Hotel"));
		
	}

}
