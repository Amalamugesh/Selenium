package com.pageobjectes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.Base;

public class HeroKuapp extends Base {
	
	public HeroKuapp() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="dropdown")
	private WebElement dropdown;
	
	@FindBy(xpath="//button[text()='Add Element']")
    private WebElement addelement;
	
	@FindBy(id="column-a")
	private WebElement A;
	
	@FindBy(id="column-b")
	private WebElement B;
	
	
	public WebElement getA() {
		return A;
	}


	public WebElement getB() {
		return B;
	}


	public WebElement getAddelement() {
		return addelement;
	}


	public WebElement getDropdown() {
		return dropdown;
	}


	

}
