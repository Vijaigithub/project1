Feature: To check whether search order id” query is working and displaying the relevant details
  
  	Scenario: To check search functionality enter order query and verify the details
		When Login to the application username"bharathkanna" and password"12345678"
	  Then Click on Booked Itinerary
	  And Enter the orderid"1T6HBM06YF"
	  Then Verify that the relevant details are displayed