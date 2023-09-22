Feature: To verify when pressed, logout button logs out from the application.

Scenario:  To validate by details and logout
	When Login to the application username"bharathkanna" and password"12345678"
	And Choose location "Sydney"
	And Choose hotel "Hotel Creek"
	And Choose roomtype"Standard"
	And Choose no-ofrooms "1 - One"
	And Enter check- indate "25/01/2022"  
	And Enter check-outdate "26/01/2022"
  And Select No of-adults"1 - One"
 	And Select No of-children"0 - None" 
	And click Search button
  And click Continue button
 	Then enter the details and click on book now
 	Then check the details, click on logout and verify if we have logged out from the application
 		
 		