package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Search_Hotel;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VerifyNoofRooms extends BaseClass {
	public int roomselected;
	@When("Enter no-ofrooms {string}")
	public void enter_no_ofrooms(String room) {
		Search_Hotel search=new Search_Hotel();
		WebElement roominput=search.getDrproomnos();
		Select select=new Select(roominput);
		select.selectByVisibleText(room);
		String input=roominput.getAttribute("value");
		roomselected=Integer.parseInt(String.valueOf(input.charAt(0)));
	
	}
	
	@Then("Verify that no. of rooms reflected according to the no. of rooms selected in search hotel page")
	public void verify_that_no_of_rooms_reflected_according_to_the_no_of_rooms_selected_in_search_hotel_page() {
	
		
		Book_A_Hotel bookhotel= new Book_A_Hotel();
		WebElement roombook=bookhotel.getNoofrooms();
		String roombooked=roombook.getAttribute("value");
		int output=Integer.parseInt(String.valueOf(roombooked.charAt(0)));
		Assert.assertSame(roomselected, output);

	}

}
