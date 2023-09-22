package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectHotelisdisplayed extends BaseClass {

	Search_Hotel search;
	public String gethotel;

	@When("Enter hotel {string}")
	public void enter_hotel(String hotel) {
		search= new Search_Hotel();
		WebElement locateelement=search.getDrphotels();
		Select select=new Select(locateelement);
		select.selectByVisibleText(hotel);
		gethotel=locateelement.getAttribute("value");
	}

	@Then("Verify that hotel displayed is the same as selected in search Hotel form")
	public void verify_that_hotel_displayed_is_the_same_as_selected_in_search_Hotel_form() {
		Select_Hotel_Next select=new Select_Hotel_Next();
		WebElement hotel=select.getHotelname();
		String hoteldisplayed=hotel.getAttribute("value");
		Assert.assertEquals(gethotel, hoteldisplayed);


	}
}
