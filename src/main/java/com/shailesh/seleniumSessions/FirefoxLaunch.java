package com.shailesh.seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "F:\\Selenium Libs\\geckodriver-v0.29.1-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://amazon.in");
		
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();

	}

}
