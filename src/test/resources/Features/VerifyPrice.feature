Feature: To verify whether the total price (excl.GST ) is calculated as “price per night * no. of nights* no of rooms”.

Scenario:  To validate by select Room Type and verify
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
 	Then Verify the total price excl GST is being calculated as price-pernight*no-ofrooms*no-ofdays
