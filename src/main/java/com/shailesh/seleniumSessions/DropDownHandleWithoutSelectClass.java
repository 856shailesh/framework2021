package com.shailesh.seleniumSessions;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithoutSelectClass {

	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By indus = By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		
		List<WebElement> optionsList = driver.findElements(By.id("Form_submitForm_Country"));
		 for (WebElement e : optionsList) {
			 if(e.getText().equals("India")){
				 e.click();
				 break;
			 }
		 }

	}
	
	public static void selectDropdownValue(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(By.id("Form_submitForm_Country"));
		 for (WebElement e : optionsList) {
			 if(e.getText().equals("India")){
				 e.click();
				 break;
			 }
		 }

	}

}
