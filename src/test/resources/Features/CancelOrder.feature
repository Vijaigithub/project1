Feature: To verify that the order gets cancelled after click on Cancel order number link

  Scenario: Cancel order and verify
  	When Login to the application username"bharathkanna" and password"12345678"
	  When fill the details and book the Hotel and note generated order no 
 		Then Click on Booked Itinerary
 	  Then Search for order number booked
 	  When Click on Cancel Order Number
 		Then Click Yes on pop-up which asks where to cancel order or not
 		Then Verify that order number is cancelled and now longer exists in Booked Itinerary page

