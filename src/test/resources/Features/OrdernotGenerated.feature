Feature: Verify Order number is generated in booking confirmation page

  Scenario: Verify ORDER no should be generated
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
	Then fill the details and verify orderno. is generated
			|Bk|kanna|Riga|1234567891236547|American Express|January|2022|123|