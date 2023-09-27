package com.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Search {
	public static WebDriver driver;

	public Search(WebDriver driver2) {
		Search.driver=driver2;
		PageFactory.initElements(Base.driver, this);
		
	}
	public WebElement getSearch() {
		return search;
	}

	public void setSearch(WebElement search) {
		this.search = search;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}


	@FindBy(xpath = "//a[@href=\"/mobile-phones/b/?ie=UTF8&node=1389401031&ref_=nav_cs_mobiles\"]")
	private WebElement search;
	

	@FindBy(xpath = "//img[@src=\"https://m.media-amazon.com/images/G/31/img23/Wireless/CatPage/AugART23/WTS/06._SS360_QL85_.jpg\"]")
	private WebElement mobile ;//premium store
	
	@FindBy(xpath = "//img[@src=\"https://images-eu.ssl-images-amazon.com/images/G/31/img23/Wireless/Samsung/TheUltraPremiumStore/Revamp/1Lac/D70828039_1242_Tile_02.jpg\"]")
	private WebElement samsung;

	public static WebDriver getDriver() {
		return driver;
	}
	public static void setDriver(WebDriver driver) {
		Search.driver = driver;
	}
	public WebElement getSamsung() {
		return samsung;
	}
	public void setSamsung(WebElement samsung) {
		this.samsung = samsung;
}
}