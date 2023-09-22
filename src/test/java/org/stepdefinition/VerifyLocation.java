package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Search_Hotel;
import org.Pages.Select_Hotel_Next;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class VerifyLocation  extends BaseClass {
	Search_Hotel search;
	public String getlocation;
	@When("Select and get location {string}")
	public void select_and_get_location(String location) {
		search= new Search_Hotel();
		WebElement locateelement=search.getDrplocation();
		Select select=new Select(locateelement);
		select.selectByVisibleText(location);
		getlocation=locateelement.getAttribute("value");

	}
	
	@When("Enter check- indate {string}")
	public void Enter_check_indate(String indate) {
		search= new Search_Hotel();
		jsFill(indate,search.getDrpdatein());
	}

	@When("Enter check-outdate {string}")
	public void enter_check_outdate(String outdate) {
		search= new Search_Hotel();
		jsFill(outdate,search.getDrpdateout());
	}

	@When("Select No of-adults{string}")
	public void select_No_of_adults(String adults) {
		search= new Search_Hotel();
		ddStringVisibleText(search.getDrpadult(), "1 - One");
	  
	}

	@When("Select No of-children{string}")
	public void select_No_of_children(String children) {
		search= new Search_Hotel();
		ddStringVisibleText(search.getDrpchild(), "0 - None");
	}

	@Then("Verify locations in Select Hotel page and location selected in Search Hotel are same")
	public void verify_locations_in_Select_Hotel_page_and_location_selected_in_Search_Hotel_are_same() {
		Select_Hotel_Next select=new Select_Hotel_Next();
		WebElement locationsearch=select.getLocation();
		String printedlocation=locationsearch.getAttribute("value");
		Assert.assertEquals("Both are same", getlocation, printedlocation);
		
	}

}
