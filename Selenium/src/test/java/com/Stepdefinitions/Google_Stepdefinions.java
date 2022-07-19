package com.Stepdefinitions;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.automation.base.Base;
import com.pageobjectes.Googlepage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Google_Stepdefinions extends Base {

	@Before

	private void Beforetest() {
		lanchbrower();
		togetDate();

	}

	@When("user enter the google {string} url")
	public void user_enter_the_google_url(String url) {


		geturl(url);


	}

	@When("user find the links avaible in the page and print the links")
	public void user_find_the_links_avaible_in_the_page_and_print_the_links() {

		List<WebElement> alllinks = ByTagname("a");

		for (WebElement link : alllinks) {

			String attribute = link.getAttribute("href");
			String text = link.getText();
			System.out.println("Links"+ text);
			System.out.println("URL"+attribute);
		}



	}

	@When("user click on the app lancher on the top right corener")
	public void user_click_on_the_app_lancher_on_the_top_right_corener() {
		Googlepage gp = new Googlepage();
		click(gp.getApplanchbtn());
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(5000));

	}

	@When("user Click on Gmail")
	public void user_Click_on_Gmail() {

		driver.switchTo().frame(1);
		Googlepage gp = new Googlepage();
		click(gp.getGmail());
	}

	@When("user search for selenium")
	public void user_search_for_selenium() {

		Googlepage gp = new Googlepage();
		WebElement searchbtn = gp.getSearchbtn();
		searchbtn.sendKeys("Selenium");
		searchbtn.sendKeys(Keys.ENTER);

	}

	@Then("user print the count of the links  in the results")
	public void user_print_the_count_of_the_links_in_the_results() {

		int Count = 0;

		List<WebElement> alllinks = ByTagname("a");

		for (WebElement link : alllinks) {

			String attribute = link.getAttribute("href");
			Count++;
			String text = link.getText();

			System.out.println("Number of Links"+Count);

		}


	}

	@After

	private void quit() {

		quitBrowser();
		togetDate();
		togetEndTime();

	}







}
