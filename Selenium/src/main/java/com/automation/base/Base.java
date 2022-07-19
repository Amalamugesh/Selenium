package com.automation.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;
import java.util.List;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	protected static WebDriver driver;
	public static void lanchbrower() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();
	}

	public static void geturl(String url) { // 3
		driver.get(url);
		driver.manage().window().maximize();
	}


	public static WebElement getTextByxpath(String webElement) { // 4

		WebElement Element = driver.findElement(By.xpath(webElement));
		return Element;

	}



	public static WebElement Byclassname(String locator) { // 5
		WebElement Element = driver.findElement(By.className(locator));
		return Element;


	}

	public static WebElement Byname(String locator) { // 5
		WebElement Element = driver.findElement(By.name(locator));
		return Element;
	}

	public static WebElement ByID(String locator) { // 5
		WebElement Element = driver.findElement(By.id(locator));
		return Element;
	}
	
	public static WebElement Byxpath(String locator) { // 5
		WebElement Element = driver.findElement(By.xpath(locator));
		return Element;
	}
	public static List<WebElement> ByTagname(String locator) {
		
		List<WebElement> Element = driver.findElements(By.tagName(locator));
		return Element;
		
	    
		

	}

	public static void sendkeys(WebElement element, String data) {

		element.sendKeys(data);
	}

	public static void click(WebElement element) {
		element.click();

	}

	public static String togetText(WebElement element) {



		String text = element.getText();
		return text;


	}
	public static String togetattribute(WebElement element) {

		String attribute = element.getAttribute("value");
		return attribute;

	}

	public static boolean  verifyTitle(String title) {

		boolean bReturn = false;
		try {

			if (driver.getTitle().equalsIgnoreCase(title)) {

				bReturn=true;

				System.out.println("Title Matched "+ title);

			} else {


				System.out.println("Title did not matched"+ title);
			}

		} catch (Exception e) {

			e.getStackTrace();

		}
		return bReturn;


	}

	public static boolean  verifyAttribute(String attribute, WebElement element) {

		boolean bReturn =false;

		try {



			if (togetattribute(element).equalsIgnoreCase(attribute)) {

				bReturn =true;
				System.out.println("Attribute value matched");

			}else {

				System.out.println("Attribute Value not matched");
			}
		} catch (Exception e) {

			e.getStackTrace();

		}
		return bReturn;

	}

	public static void quitBrowser() {


		driver.quit();


	}

	public static Date togetDate() {
		Date d =new Date();
		System.out.println("StartDate :"+ d);
		return d;



	}
	
	public static long togetStarttime() {

		long StartTime = System.currentTimeMillis();
		System.out.println("StartTime: "+StartTime);
		return StartTime;

	}
	public static long togetEndTime() {
     try {
		
	
		long endtym = System.currentTimeMillis();
		System.out.println("EndTime: "+endtym);
		return endtym;
     } catch (Exception e) {
 		e.printStackTrace();
 	}
	return 0;

	}
	
	
	public static void dropDownByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);

	}

	public static void dropDownByValue(WebElement element, String Value) {
		Select select = new Select(element);
		select.selectByValue(Value);


	}

	public static void dropDownByVisibletext(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);

	}
	
	public static void dragAndDrop(WebElement src , WebElement des) {
		
		Actions action =new Actions(driver);
		action.dragAndDrop(src, des);
		

	}
}