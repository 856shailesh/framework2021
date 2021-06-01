package com.shailesh.seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassDropdowns {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
//		WebElement emp = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));
//		WebElement indus = driver.findElement(By.id("Form_submitForm_Industry"));
//		
//		Select sel = new Select(emp);
//		sel.selectByIndex(4);
//		
//		Select selIndus = new Select(indus);
//		selIndus.selectByVisibleText("Education");
//		selIndus.selectByValue(value);
		
		By indus = By.id("Form_submitForm_Industry");
		By emp = By.id("Form_submitForm_NoOfEmployees");
		By country = By.id("Form_submitForm_Country");
		
		doSelectDropDownByIndex(emp, 5);
		doSelectDropDownByVisibleText(country, "Antigua and Barbuda");
		doSelectDropDownByValue(indus, "Government-Local");
		
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String text) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}
	
	public static void doSelectDropDownByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}
}
