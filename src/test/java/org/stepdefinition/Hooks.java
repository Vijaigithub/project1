package org.stepdefinition;

import org.BaseClass.BaseClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass{

	@Before(order=1)
	public void chromeExecution() {
		launchChrome();

	}
	@Before(order=2)
	public void maximizeWindow() {
		winMax();
	}
	@Before(order=3)
	public void Urllaunch() {
		loadUrl("http://adactinhotelapp.com/");
		
	}
	@After
	public void afterExecution() {
		closeChrome();
	}
}