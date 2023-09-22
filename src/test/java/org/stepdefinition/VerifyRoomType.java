package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyRoomType extends BaseClass {
	static Search_Hotel search;
	@When("Choose location {string}")
	public void choose_location(String location) {
		search= new Search_Hotel();
		ddStringVisibleText(search.getDrplocation(), location);
	}

	@When("Choose hotel {string}")
	public void choose_hotel(String hotel) {
		search=new Search_Hotel();
		ddStringVisibleText(search.getDrphotels(), hotel);
	    
	}
	public String roomgiven;
	@When("Choose roomtype{string}")
	public void choose_roomtype(String roomtype) {
		search=new Search_Hotel();
		WebElement roominput=search.getDrproomtype();
		Select select=new Select(search.getDrproomtype());
		select.selectByVisibleText(roomtype);
		roomgiven=roominput.getAttribute("value");

	}
	
	@When("Choose no-ofrooms {string}")
	public void choose_no_ofrooms(String rooms) {
		search=new Search_Hotel();
		ddStringVisibleText(search.getDrproomnos(), rooms);
	    
	}

	@When("click Search button")
	public void click_Search_button() {
		search=new Search_Hotel();
		btnClick(search.getBtnsubmit());
	}
	@When("click Continue button")
	public void click_Continue_button() {
		Select_Hotel_Next select=new Select_Hotel_Next();
		btnClick(select.getBtnradio());
		btnClick(select.getBtncontinue());
	}
	@Then("Verify that room type reflected is the same as selected in search hotel page")
	public void verify_that_room_type_reflected_is_the_same_as_selected_in_search_hotel_page() {
		Book_A_Hotel book=new Book_A_Hotel();
		WebElement roomdisplayed=book.getRoomtype();
		String roomprint=roomdisplayed.getAttribute("value");
		System.out.println(roomprint);
		Assert.assertEquals("Both are same", roomgiven, roomprint);
	}

}
