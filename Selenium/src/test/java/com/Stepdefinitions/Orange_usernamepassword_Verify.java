package com.Stepdefinitions;

import com.automation.base.Base;
import com.pageobjectes.OrangehrmLoginpage;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Orange_usernamepassword_Verify extends Base{
	
	@Given("user enter the {string} url")
	public void user_enter_the_url(String url) {
		// testing added
		//second line
		lanchbrower();
		geturl(url);
		
	}

	@When("user enter the {string} and {string}")
	public void user_enter_the_and(String username, String password) {
		
		// Enter the user name and password
	
		OrangehrmLoginpage lg = new OrangehrmLoginpage();
		sendkeys(lg.getUsername(), username);
		
		sendkeys(lg.getPassword(), password);
			
	}

	@When("capture the username and password and print in the  console")
	public void capture_the_username_and_password_and_print_in_the_console() {
		
		//Capture the user name and password and print the same on console
	    
		OrangehrmLoginpage lg = new OrangehrmLoginpage();
		String username = togetattribute(lg.getUsername());
		System.out.println("The User name is "+username);
		
		String password = togetattribute(lg.getPassword());
		System.out.println("The password is "+password);
	}

	@Then("verify the enter username and password")
	public void verify_the_enter_username_and_password() {
	    
		OrangehrmLoginpage lg = new OrangehrmLoginpage();
		
	  	verifyAttribute("Admin",  lg.getUsername());
	}
	
	@When("user click on the login button")
	public void user_click_on_the_login_button() {
		// Click on the login button
		OrangehrmLoginpage lg = new OrangehrmLoginpage();
		click(lg.getLoginBtn());
		
	}

	@Then("verify the Home page")
	public void verify_the_Home_page() {
		// Verify the Home page
		
		verifyTitle(driver.getTitle());
		
	}

	@Then("Logout from the application")
	public void logout_from_the_application() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
		OrangehrmLoginpage lg = new OrangehrmLoginpage();
		click(lg.getWelcomeBtn());

        Thread.sleep(5000);
        
        click(lg.getLogout());
        
        
	}
	
	
	@After
	
	private void quit() {
		quitBrowser();
		togetEndTime();

	}


	

}
