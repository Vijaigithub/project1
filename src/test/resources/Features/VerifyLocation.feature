Feature: To verify whether locations in Select Hotel page are displayed according to the location selected in Search Hotel
  
  Scenario: Verify locations in Select Hotel page and location selected in Search Hotel are same
		When Login to the application username"bharathkanna" and password"12345678"
		And Select and get location "Sydney"
		And Choose hotel "Hotel Creek"
		And Choose roomtype"Standard"
		And Choose no-ofrooms "1 - One"
   	And Enter check- indate "25/01/2022"  
	  And Enter check-outdate "26/01/2022"
 		And Select No of-adults"1 - One"
 		And Select No of-children"0 - None" 
 		And click Search button
 		Then Verify locations in Select Hotel page and location selected in Search Hotel are same