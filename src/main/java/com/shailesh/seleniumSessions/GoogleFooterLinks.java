package com.shailesh.seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleFooterLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.co.in/");

		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='o3j99 c93Gbe']"));

		for (int i = 0; i < footerLinks.size(); i++) {
			String text = footerLinks.get(i).getText();
			System.out.println(text);
			
			
		}

	}

}
