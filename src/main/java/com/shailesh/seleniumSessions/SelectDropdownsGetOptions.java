package com.shailesh.seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdownsGetOptions {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By indus = By.id("Form_submitForm_Industry");
		By emp = By.id("Form_submitForm_NoOfEmployees");
		By country = By.id("Form_submitForm_Country");

//		Select sel = new Select (driver.findElement(indus));
//		List <WebElement> indusList = sel.getOptions();
//		System.out.println("Size is " + indusList.size());
//		
//		for (WebElement e : indusList) {
//			String text = e.getText();
//			System.out.println(text);
//		}

		//List<String> countryList = doGetAllDropDownOptions(country);
		
		doSelectValue(country, "India");
		//doGetAllDropDownOptions(indus);
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<String> doGetAllDropDownOptions(By locator) {
		List<String> optionsTextList = new ArrayList<String>();
		Select sel = new Select(getElement(locator));

		List<WebElement> options = sel.getOptions();
		System.out.println("Size is " + options.size());

		for (WebElement e : options) {
			String text = e.getText();
			optionsTextList.add(text);
		}
		return optionsTextList;
	}
	
	public static void doSelectValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		
		List<WebElement> options = sel.getOptions();
		System.out.println("Size is " + options.size());

		for (WebElement e : options) {
			String text = e.getText();
			if (text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}

}









