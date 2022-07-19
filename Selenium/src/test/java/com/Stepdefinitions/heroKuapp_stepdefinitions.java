package com.Stepdefinitions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automation.base.Base;
import com.pageobjectes.HeroKuapp;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class heroKuapp_stepdefinitions extends Base {
	
	@Before

	private void Beforetest() {
		lanchbrower();
		togetDate();

	}


	@Given("user enter the {string}")
	public void user_enter_the(String url) {

		
		geturl(url);
	}

	@When("user Select option{int} by index")
	public void user_Select_option_by_index(Integer int1) {
		
		
		HeroKuapp hp = new HeroKuapp();
		dropDownByIndex(hp.getDropdown(), 0);
	}

	@When("Select option{int} by value")
	public void select_option_by_value(Integer int1) {
		HeroKuapp hp = new HeroKuapp();
		dropDownByValue(hp.getDropdown(), "2");
		
	}

	@When("Select option{int} by visible text")
	public void select_option_by_visible_text(Integer int1) {
		HeroKuapp hp = new HeroKuapp();
		dropDownByVisibletext(hp.getDropdown(), "Option 2");
	}

	@Given("enter the {string}")
	public void enter_the(String string) {
		
		geturl(string);
		
	    
		
	}

	@Given("cpture all the status code and print in console")
	public void cpture_all_the_status_code_and_print_in_console() throws IOException {
		List<WebElement> alllinks = ByTagname("a");

		for (WebElement link : alllinks) {

			String attribute = link.getAttribute("href");
			
			URL url = new URL(attribute);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			int code = con.getResponseCode();
			System.out.println("URL"+attribute+"status code "+code);

			

		}
		
		
		
	}
	
	@Given("user enter the url {string}")
	public void user_enter_the_url(String string) {

        geturl(string);
	}

	@When("user add the Element and Remove the element")
	public void user_add_the_Element_and_Remove_the_element() {
		HeroKuapp hp = new HeroKuapp();
		click(hp.getAddelement());
		
		// to remove 
		
		List<WebElement> findElements = driver.findElements(By.xpath("(//div[@id='elements']//button)"));
		
		for (WebElement webElement : findElements) {
			
			webElement.click();
			
			
			
		}
	}
	
	@Given("user enter {string} url")
	public void user_enter_url(String url) {
	     
		geturl(url);
		
	}

	@When("user drag and drop the elements A into B and B into A")
	public void user_drag_and_drop_the_elements_A_into_B_and_B_into_A() {
	    
		HeroKuapp hp = new HeroKuapp();
		
		dragAndDrop(hp.getA(), hp.getB());
		dragAndDrop(hp.getA(), hp.getB());
	}




	

	@After

	private void quit() {

		quitBrowser();
		togetDate();
		togetEndTime();

	}
}
