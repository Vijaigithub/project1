package org.stepdefinition;

import org.BaseClass.BaseClass;
import org.Pages.Book_A_Hotel;
import org.Pages.Booked_Itinery;
import org.junit.Assert;
import io.cucumber.java.en.Then;




public class VerifyLogout extends BaseClass  {


	@Then("enter the details and click on book now")
	public void enter_the_details_and_click_on_book_now() throws InterruptedException {
		 Book_A_Hotel book=new Book_A_Hotel();
		 fill(book.getFrstnametxt(), "Bk");
		 fill(book.getLastnametxt(), "kanna");
		 fill(book.getAdrstxt(), "Riga");
		 fill(book.getCcnotxt(), "1234567891236547");
		 ddStringVisibleText(book.getDrpcctype(), "American Express");
		 ddStringVisibleText(book.getDrpccxpmnth(), "January");
		 ddStringVisibleText(book.getDrpccxpyr(), "2022");
		 fill(book.getCvvtxt(), "123");
		 btnClick(book.getBtnbooknw());
		 waitimplicit(1000);
	}
	
	@Then("check the details, click on logout and verify if we have logged out from the application")
	public void check_the_details_click_on_logout_and_verify_if_we_have_logged_out_from_the_application() {
		Booked_Itinery bookitinerary=new Booked_Itinery();
		jsClick(bookitinerary.getBtnitinerylogout());
		 
		String logout=driver.getTitle();
		Assert.assertTrue(logout.contains("Adactin.com - Logout"));
	}
}
