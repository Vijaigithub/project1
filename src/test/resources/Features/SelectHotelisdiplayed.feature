
Feature: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel

  Scenario:  To validate by select location and verify
		When Login to the application username"bharathkanna" and password"12345678"
		And Select and get location "Sydney"
		And Enter hotel "Hotel Creek"
		And Choose roomtype"Standard"
		And Choose no-ofrooms "1 - One"
		And Enter and get check- indate "26/01/2022"  
	  And Enter and get check- outdate "27/01/2022"
 		And Select No of-adults"1 - One"
 		And Select No of-children"0 - None" 
 		Then click Search button
 		Then Verify that hotel displayed is the same as selected in search Hotel form