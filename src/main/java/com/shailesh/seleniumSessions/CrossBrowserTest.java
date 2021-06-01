package com.shailesh.seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "Chrome";

		switch (browser.toLowerCase()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver",
					"F:\\Selenium Libs\\geckodriver-v0.29.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.edge.driver", "F:\\Selenium Libs\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Please pass the correct browser name ....");
			break;
		}

		driver.get("https://amazon.in");

		String title = driver.getTitle();
		System.out.println("Page title is : " + title);

		System.out.println(driver.getCurrentUrl());

		driver.quit();

	}

}
