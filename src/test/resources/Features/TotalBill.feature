Feature: To check correct Final billed price is Total Price + 10% Total price in Book a Hotel page
  
  Scenario: Verify final billed price and Total price
	When Login to the application username"bharathkanna" and password"12345678"
	And Choose location "Melbourne"
	And Choose hotel "Hotel Creek"
	And Choose roomtype"Standard"
	And Choose no-ofrooms "2 - Two"
	And Enter check- indate "26/01/2022"  
	And Enter check-outdate "27/01/2022"
  And Select No of-adults"1 - One"
 	And Select No of-children"0 - None" 
	And click Search button
  And click Continue button
 	Then Verify the total price excl GST is being calculated as price-pernight*no-ofrooms*no-ofdays
 	Then Takescreenshot