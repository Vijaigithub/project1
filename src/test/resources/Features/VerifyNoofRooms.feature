Feature:  To verify whether no. of rooms entry in Select Hotel page is same as the Number of rooms selected in search hotel page
  
  Scenario:  To validate by select no.of tooms and verify
	When Login to the application username"bharathkanna" and password"12345678"
	And Choose location "Sydney"
	And Choose hotel "Hotel Creek"
	And Choose roomtype"Standard"
	And Enter no-ofrooms "1 - One"
	And click Search button
  And click Continue button
 	Then Verify that no. of rooms reflected according to the no. of rooms selected in search hotel page