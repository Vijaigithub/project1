Feature: To verify date and Check Outdate are being displayed in Select Hotel Page according to the dates selected in search Hotel
 
  Scenario:  Verify date in Select Hotel page and location selected in Search Hotel are same
		When Login to the application username"bharathkanna" and password"12345678"
		And Select and get location "Sydney"
		And Choose hotel "Hotel Creek"
		And Choose roomtype"Standard"
		And Choose no-ofrooms "1 - One"
		And Enter and get check- indate "26/01/2022"  
	  And Enter and get check- outdate "27/01/2022"
 		And Select No of-adults"1 - One"
 		And Select No of-children"0 - None" 
 		And click Search button
 		Then Verify that check-in-date and check-out-dates are the same as selected in search hotel form.