package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Booked_Itinery;
import org.Pages.Booking_Confirmation;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class BookedItineraryInfo extends BaseClass{
	@Then("Click on My itinerary button")
	public void Click_on_My_itinerary_button() {
		Booking_Confirmation bc = new Booking_Confirmation();
		WebElement myitinerary=jsScrollTop(bc.getBtnmyitinery());
		btnClick(myitinerary);
		}

	@Then("verify that the details {string} are reflected correctly as per the booking")
	public void verify_that_the_details_are_reflected_correctly_as_per_the_booking(String details) {
		Booked_Itinery itinerary= new Booked_Itinery();
		fill(itinerary.getOdridsrch(), details);
		btnClick(itinerary.getBtngo());
		
		String order_id=driver.findElement(By.xpath("//input[@type='text']/parent::td//preceding-sibling::td//input[@value='8EOOGN71MT']")).getAttribute("value");
		Assert.assertEquals(details, order_id);
}
	}
