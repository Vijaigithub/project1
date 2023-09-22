package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Booked_Itinery;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class OrderidQuery extends BaseClass {
	String order;
	@Then("Enter the orderid{string}")
	public void enter_the_orderid(String orderid) {
		 Booked_Itinery Itinerary= new Booked_Itinery();
		 WebElement sendorder=driver.findElement(By.id("order_id_text"));;
		 sendorder.sendKeys(orderid);
		 order=sendorder.getAttribute("value");
		 btnClick(Itinerary.getBtngo());
	
	}
	    

	@Then("Verify that the relevant details are displayed")
	public void verify_that_the_relevant_details_are_displayed() {
		String order_id=driver.findElement(By.xpath("//input[@type='text']/parent::td//preceding-sibling::td//input[@value='1T6HBM06YF']")).getAttribute("value");
		Assert.assertEquals(order, order_id);
		
}
}