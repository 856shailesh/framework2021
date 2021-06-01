package com.shailesh.seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetLinksAtrribute {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		for (int i=0 ; i<linkslist.size(); i++ ) {
			//System.out.println(linkslist.get(i).getText());
			//String hreflist = linkslist.get(i).getAttribute("href");
			
			System.out.println(linkslist.get(i).getAttribute("href"));
		}

	}

}
