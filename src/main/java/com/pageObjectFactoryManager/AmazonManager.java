package com.pageObjectFactoryManager;

import org.openqa.selenium.WebDriver;

import com.pageObjectFactory.AddToBag;
import com.pageObjectFactory.Phonecase;
import com.pageObjectFactory.Search;

public class AmazonManager {
	public static WebDriver driver;
	public Search s;
	public AddToBag a;
	public Phonecase p;


	public AmazonManager(WebDriver driver2) {
AmazonManager.driver=driver2;
	}

	public Search log() {
		if(s==null) {
		 s =new Search(driver);
		}
		return s;
	}
	public AddToBag  add() {
		if(a==null) {
		 a =new AddToBag(driver);
		}
		return a;
	}
	public Phonecase  phonecase() {
		if(p==null) {
		 p =new Phonecase(driver);
		}
		return p;
	}
}
