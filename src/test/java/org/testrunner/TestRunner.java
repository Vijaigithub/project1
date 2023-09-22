package org.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.jvm.JVM;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="\\src\\test\\resources\\Features",
				 glue="org.stepdefinition",
				 dryRun=false,
				 plugin= {"pretty","html:target/Report","junit:target\\junit.xml","json:JsonReport\\json.rep.json"}
)

public class TestRunner {
	
	@BeforeClass
	
	

	@AfterClass
	public static void generateJVMReport() {
	JVM.generateJVM("C:\\Users\\gopal\\OneDrive\\Desktop\\Cucumber\\Adactin_Booking_Application\\JsonReport\\json.rep.json");
	}
}
	