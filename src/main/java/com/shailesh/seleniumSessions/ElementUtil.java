package com.shailesh.seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	WebDriver driver;

	ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	/*
	 * Drop Down util These are for select tags where tag = select
	 * 
	 */

	public void doSelectDropDownByIndex(By locator, int index) {
		Select sel = new Select(getElement(locator));
		sel.selectByIndex(index);
	}

	public void doSelectDropDownByVisibleText(By locator, String text) {
		Select sel = new Select(getElement(locator));
		sel.selectByVisibleText(text);
	}

	public void doSelectDropDownByValue(By locator, String value) {
		Select sel = new Select(getElement(locator));
		sel.selectByValue(value);
	}

	public List<String> doGetAllDropDownOptions(By locator) {
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

	public void doSelectValue(By locator, String value) {
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

	/*
	 * without using select class
	 */

	public void selectDropdownValue(By locator, String value) {
		List<WebElement> optionsList = driver.findElements(locator);
		for (WebElement e : optionsList) {
			if (e.getText().equals(value)) {
				e.click();
				break;
			}
		}
	}
}
