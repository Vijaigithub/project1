package com.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class AddToBag {
	public static WebDriver driver;

	public AddToBag(WebDriver driver) {
		AddToBag.driver=driver;
		PageFactory.initElements(Base.driver, this);

	}

	public WebElement getProtection_plan() {
		return protection_plan;
	}

	public void setProtection_plan(WebElement protection_plan) {
		this.protection_plan = protection_plan;
	}
	

	public WebElement getAddbag() {
		return addbag;
	}

	public void setAddbag(WebElement addbag) {
		this.addbag = addbag;
	}
	@FindBy(xpath = "(//input[@type=\"checkbox\"])[1]")
	public WebElement protection_plan;
	
	@FindBy(xpath = "//select[@id=\"quantity\"]")
	public WebElement quantity;

	public WebElement getQuantity() {
		return quantity;
	}

	public void setQuantity(WebElement quantity) {
		this.quantity = quantity;
	}
	@FindBy(xpath = "//input[@name=\"submit.addToCart\"]")
	public WebElement addbag;
	
	@FindBy(xpath = "//a[@data-csa-c-content-id=\"sw-gtc_CONTENT\"]")
	public WebElement gocart;

	
	public WebElement getGocart() {
		return gocart;
	}

	public void setGocart(WebElement gocart) {
		this.gocart = gocart;
	}
}
