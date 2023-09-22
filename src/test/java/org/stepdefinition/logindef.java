package org.stepdefinition;


import org.BaseClass.BaseClass;
import org.Pages.Login_Page;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class logindef extends BaseClass{
	Login_Page login;
	@When("To pass the data in {string}username txtbox")
	public void to_pass_the_data_in_username_txtbox(String username) {
		login=new Login_Page();
		fill(login.getTextuser(),username);
	}

	@When("To pass the data in {string}password field")
	public void to_pass_the_data_in_password_field(String password) {
		login= new Login_Page();
		fill(login.getTextpass(), password);
	}


	@When("Clicks the login button")
	public void clicks_the_login_button() {
		login= new Login_Page();
		btnClick(login.getLoginbutton());

	}

	@Then("User should be in Search hotel page")
	public void user_should_be_in_Search_hotel_page() {
		String title=driver.getTitle();
		if(title.contains("Adactin.com - Search Hotel")) {
		}

		else {
			System.out.println("Invalid credentials");
		}
	}
}