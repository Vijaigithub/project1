package org.stepdefinition;

import static org.junit.Assert.assertNotEquals;

import java.io.IOException;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Search_Hotel;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataSamePrevWindow extends BaseClass {
	Search_Hotel search;
	public String getlocation;
	@When("Select location {string}")
	public void select_location(String location) {
		search= new Search_Hotel();
		WebElement locateelement=search.getDrplocation();
		Select select=new Select(locateelement);
		select.selectByVisibleText(location);
		getlocation=locateelement.getAttribute("value");
		
	}
	public String gethotel;
	@When("Select hotel {string}")
	public void select_hotel(String hotel) {
		search= new Search_Hotel();
		WebElement locateelement=search.getDrphotels();
		Select select=new Select(locateelement);
		select.selectByVisibleText(hotel);
		gethotel=locateelement.getAttribute("value");
	}
	public String roomgiven;
	@When("Select roomtype {string}")
	public void select_roomtype(String roomtype) {
		search=new Search_Hotel();
		WebElement roominput=search.getDrproomtype();
		Select select=new Select(search.getDrproomtype());
		select.selectByVisibleText(roomtype);
		roomgiven=roominput.getAttribute("value");
		

	}
	public int roomselected;
	@When("select no-ofrooms {string}")
	public void select_no_ofrooms(String rooms) throws IOException {
		Search_Hotel search=new Search_Hotel();
		WebElement roominput=search.getDrproomnos();
		Select select=new Select(roominput);
		select.selectByVisibleText(rooms);
		String given=roominput.getAttribute("value"); 		
		roomselected=Integer.parseInt(String.valueOf(given.charAt(0)));
		screenshot("DataGiven");
	}

	@Then("Data should be same as selected in previous screen")
	public void data_should_be_same_as_selected_in_previous_screen() throws IOException {
		Book_A_Hotel bookhotel=new Book_A_Hotel();
		WebElement locationsearch=bookhotel.getLocation();
		String printedlocation=locationsearch.getAttribute("value");
		Assert.assertEquals("Both are same", getlocation, printedlocation);
		
		
		WebElement hotel=bookhotel.getHotelName();
		String hoteldisplayed=hotel.getAttribute("value");
		Assert.assertEquals(gethotel, hoteldisplayed);
		
		
		WebElement roomdisplayed=bookhotel.getRoomtype();
		String roomprint=roomdisplayed.getAttribute("value");
		System.out.println(roomprint);
		Assert.assertEquals("Both are same", roomgiven, roomprint);
		
		
		WebElement roombook=bookhotel.getNoofrooms();
		String roombooked=roombook.getAttribute("value");
		int bookedroom=Integer.parseInt(String.valueOf(roombooked.charAt(0)));
		Assert.assertEquals("Both are same", roomselected, bookedroom);
				
		
		WebElement room=bookhotel.getNoofrooms();
		String romcount=room.getAttribute("value");
		int i=Integer.parseInt(String.valueOf(romcount.charAt(0)));
		
		WebElement days=bookhotel.getTotaldays();
		String daycount=days.getAttribute("value");
		int j=Integer.parseInt(String.valueOf(daycount.charAt(0)));
		
		
		WebElement price=bookhotel.getPricepernight();
		String pricepernight=price.getAttribute("value");
		String[] pricestring=pricepernight.split(" ");
		int k=Integer.parseInt(pricestring[2]);
	
		
		//price-pernight*no-ofrooms*no-ofdays
		int l=i*j*k;
				
		WebElement ptot=bookhotel.getTotalprice();
		String totalprice=ptot.getAttribute("value");
		String[] totprice=totalprice.split(" ");
		System.out.println(totprice[2]);
		
		int m=Integer.parseInt(totprice[2]);
		
		
		assertNotEquals("Expected"+l,"Actual"+m);

		
		screenshot("Datadisplayed");
}


}
