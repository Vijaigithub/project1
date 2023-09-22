package org.jvm;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JVM {
	
	public static void generateJVM(String json) {
		
		File f=new File("C:\\Users\\gopal\\OneDrive\\Desktop\\Cucumber\\Adactin_Booking_Application\\JVMReport");
		
		Configuration c=new Configuration(f, "Adactinhotel Booking");
		c.addClassifications("Platform", "Windows");
		c.addClassifications("Platform version", "Windows");
		c.addClassifications("Browser Name", "Chrome");
		c.addClassifications("Version", "97");
		c.addClassifications("Sprint No", "1");
		
		List<String> list = new ArrayList<String>();
		list.add(json);
		
		ReportBuilder report=new ReportBuilder(list, c);
		report.generateReports();
	}

}
