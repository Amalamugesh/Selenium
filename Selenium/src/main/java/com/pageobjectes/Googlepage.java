package com.pageobjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class Googlepage extends Base {
	
	
	public Googlepage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Sign in'] //parent::div//a[@role='button']")
	private WebElement applanchbtn;
	
	@FindBy(xpath="//span[text()='Gmail']//parent::a")
	private WebElement Gmail;
	
	@FindBy(xpath="//input[@title='Search']")
	private WebElement Searchbtn;
	

	public WebElement getSearchbtn() {
		return Searchbtn;
	}

	public WebElement getApplanchbtn() {
		return applanchbtn;
	}

	public WebElement getGmail() {
		return Gmail;
	}

}
