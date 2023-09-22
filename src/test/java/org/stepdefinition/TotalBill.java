package org.stepdefinition;

import java.io.IOException;

import org.BaseClass.BaseClass;

import io.cucumber.java.en.Then;

public class TotalBill extends BaseClass {
	

@Then("Takescreenshot")
public void takescreenshot() throws IOException {
	screenshot("Price_Calculated");
}
}
