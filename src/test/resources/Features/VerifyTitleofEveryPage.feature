Feature: To verify Title of every Page reflects what the page objective is. For example Title of Search Hotel page should have “Search Hotel”

Scenario: To verify get Every page Title
 When Login to the application username"bharathkanna" and password"12345678"
 And Verify that title of each page is the same as the page objective
 Then Click on Search hotel option and verify whether application directs to search hotel form
 Then Click on booked itinerary button and verify that application directs to booked itinerary form
 