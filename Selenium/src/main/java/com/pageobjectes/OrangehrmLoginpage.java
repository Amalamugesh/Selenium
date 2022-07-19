package com.pageobjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class OrangehrmLoginpage extends Base{
	
	public OrangehrmLoginpage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[text()='Username']//preceding-sibling::input[@id='txtUsername']")
    private WebElement username;
	
	@FindBy(xpath="//span[text()='Password']//preceding-sibling::input[@id='txtPassword']")
	  private WebElement password;
	
	@FindBy(id= "btnLogin")
	private WebElement loginBtn;
	
	@FindBy(id="welcome")
	private WebElement welcomeBtn;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getWelcomeBtn() {
		return welcomeBtn;
	}

	public WebElement getLogout() {
		return Logout;
	}
	
	

}
