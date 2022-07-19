Feature: Testing the Herokuapp 

Scenario: Testing the DropDown keys

Given user enter the "http://the-internet.herokuapp.com/dropdown"
When user Select option1 by index
And Select option2 by value
And Select option2 by visible text

	Scenario:Test the Status Code 

	Given enter the "http://the-internet.herokuapp.com/checkboxes"
	And cpture all the status code and print in console
	
	Scenario: Test the Add and remove elements
  Given user enter the url "http://the-internet.herokuapp.com/add_remove_elements/"
  When user add the Element and Remove the element
  
  Scenario: Test Drag and Drop 
  
  Given user enter "http://the-internet.herokuapp.com/drag_and_drop" url
  When user drag and drop the elements A into B and B into A