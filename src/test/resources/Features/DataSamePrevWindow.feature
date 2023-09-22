Feature: To check Hotel name, Location, room type, Total Day, price per
  
  Scenario: Data should be same as selected in previous screen
  When Login to the application username"bharathkanna" and password"12345678"
	And Select location "Sydney"
	And Select hotel "Hotel Creek"
	And Select roomtype "Standard"
	And select no-ofrooms "2 - Two"
	And Enter check- indate "26/01/2022"  
	And Enter check-outdate "27/01/2022"
  And Select No of-adults"1 - One"
 	And Select No of-children"0 - None" 
	And click Search button
  And click Continue button
 	Then Verify the total price excl GST is being calculated as price-pernight*no-ofrooms*no-ofdays
 	Then Data should be same as selected in previous screen