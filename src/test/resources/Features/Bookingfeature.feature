Feature: To verify whether the check-out date field accepts a later date than check-in date.

	Scenario: To validate by sending invalid date in check-in and valid check-out date
	When Login to the application username"bharathkanna" and password"12345678"
	And Choose location "Sydney"
	And Choose hotel "Hotel Creek"
	And Choose roomtype"Standard"
	And Choose no-ofrooms "1 - One"
  And Enter check-indate"27/01/2022" later than the check-outdate"25/01/2022" field as today + seven date and checkout today+five date and click search
  Then Verify that system gives an error saying check-indate should not be later than checkout-date
	
	