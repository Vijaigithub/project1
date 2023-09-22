Feature:  To verify whether Room Type in Select Hotel page is same as Room type selected in search hotel page
  
  Scenario:  To validate by select Room Type and verify
	When Login to the application username"bharathkanna" and password"12345678"
	And Choose location "Sydney"
	And Choose hotel "Hotel Creek"
	And Choose roomtype"Standard"
	And Choose no-ofrooms "1 - One"
	And click Search button
  And click Continue button
 	Then Verify that room type reflected is the same as selected in search hotel page
	
	