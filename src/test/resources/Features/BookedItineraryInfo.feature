Feature: To check whether the booked itinerary reflects the correct information in line with the booking
Scenario: To validate enter details and verify the details
	When Login to the application username"bharathkanna" and password"12345678"
	And Choose location "Sydney"
	And Choose hotel "Hotel Creek"
	And Choose roomtype"Standard"
	And Choose no-ofrooms "2 - Two"
	And Enter check- indate "26/01/2022"  
	And Enter check-outdate "27/01/2022"
  And Select No of-adults"1 - One"
 	And Select No of-children"0 - None" 
	And click Search button
  And click Continue button
	Then fill the details and click on Book now button
			|Bk|kanna|Riga|1234567891236547|American Express|January|2022|123|
 	Then Click on My itinerary button
 	And verify that the details "8EOOGN71MT" are reflected correctly as per the booking
