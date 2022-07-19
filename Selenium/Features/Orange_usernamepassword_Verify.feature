Feature: Login orangeHrm


Background:

Given user enter the "https://opensource-demo.orangehrmlive.com/index.php/auth/login" url
When user enter the "Admin" and "admin123" 

Scenario: To get the username and password from orangehrm

And capture the username and password and print in the  console
Then verify the enter username and password 

Scenario:
And user click on the login button
Then verify the Home page 
And Logout from the application
