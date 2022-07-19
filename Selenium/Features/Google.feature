Feature: Testing the Google Site

Background:
Given user enter the google "https://www.google.com/" url

Scenario: Test the Urls
And user find the links avaible in the page and print the links

Scenario: Test Gmail

When user click on the app lancher on the top right corener 
And user Click on Gmail

Scenario: test count of the links

When user search for selenium 
Then user print the count of the links  in the results
