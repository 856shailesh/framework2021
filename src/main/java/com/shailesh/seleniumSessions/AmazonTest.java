package com.shailesh.seleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver(browserName); // keep it like this for now
		br.launchURL("https://amazon.in");
		
		System.out.println(br.doGetPageSource());
		
		String title = br.doGetTitle();
		System.out.println("Title is " + title);
		
		br.closeBrowser();
	}

}
