package com.pageObjectFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class Phonecase {
	public static WebDriver driver;
	
	
	public Phonecase(WebDriver driver2) {
		Phonecase.driver=driver2;
		PageFactory.initElements(Base.driver, this);
	}

	@FindBy(id = "twotabsearchtextbox")
	public WebElement textArea;

	public WebElement getTextArea() {
		return textArea;
	}

	public void setTextArea(WebElement textArea) {
		this.textArea = textArea;
	}
	
	@FindBy(xpath = "//span[text()='Customer Reviews']")
	private WebElement crating;
	
	public WebElement getcrating() {
		return crating;
	}

	public void setcrating(WebElement crating) {
		this.crating = crating;
	}

	@FindBy(xpath = "(//a[@class=\"a-link-normal s-navigation-item\"])[7]")
	public WebElement rating;



	public WebElement getRating() {
		return rating;
	}

	public void setRating(WebElement rating) {
		this.rating = rating;
	}
	
	@FindBy(xpath = "//span[text()='Finish Type']")
	public WebElement title;
	
	public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}

	@FindBy(xpath = "(//div[@class=\"colorsprite aok-float-left\"])[2]")
	public WebElement color;


	public WebElement getColor() {
		return color;
	}

	public void setColor(WebElement color) {
		this.color = color;
	}
	
	
}
