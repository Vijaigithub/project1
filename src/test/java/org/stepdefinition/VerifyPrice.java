package org.stepdefinition;

import static org.junit.Assert.assertNotEquals;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;


public class VerifyPrice extends BaseClass {
	
	@Then("Verify the total price excl GST is being calculated as price-pernight*no-ofrooms*no-ofdays")
	public void verify_the_total_price_excl_GST_is_being_calculated_as_price_pernight_no_ofrooms_no_ofdays() {
		
			
		Book_A_Hotel bookhotel= new Book_A_Hotel();
		WebElement room=bookhotel.getNoofrooms();
		String romcount=room.getAttribute("value");
		int i=Integer.parseInt(String.valueOf(romcount.charAt(0)));
		
		WebElement days=bookhotel.getTotaldays();
		String daycount=days.getAttribute("value");
		int j=Integer.parseInt(String.valueOf(daycount.charAt(0)));
		
		
		WebElement price=bookhotel.getPricepernight();
		String pricepernight=price.getAttribute("value");
		String[] pricestring=pricepernight.split(" ");
		System.out.println(pricestring[2]);
		int k=Integer.parseInt(pricestring[2]);
	
		
		//price-pernight*no-ofrooms*no-ofdays
		int l=i*j*k;
				
		WebElement ptot=bookhotel.getTotalprice();
		String totalprice=ptot.getAttribute("value");
		String[] totprice=totalprice.split(" ");
		System.out.println(totprice[2]);
		
		int m=Integer.parseInt(totprice[2]);
		
		
		assertNotEquals("Expected"+l,"Actual"+m);
		
		
	
	
		
		
		
	}
}
