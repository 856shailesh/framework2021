package com.shailesh.seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://classic.freecrm.com/");
		driver.findElement(By.name("username")).sendKeys("groupautomation");
		driver.findElement(By.name("password")).sendKeys("Test@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();

//		driver.findElement(By
//				.xpath("//a[@context='contact' and text()='Shailesh Kumar']//parent::td//preceding-sibling::td/input"))
//				.click();
//		
		//selectContact("Aliss Jeyhun");
		
		List<String> details = contactDetails("Shailesh Kumar");
		details.stream().forEach(e -> System.out.print(e + " "));
	}

	public static void selectContact(String contactName) {
		driver.findElement(By
				.xpath("//a[@context='contact' and text()='"+ contactName +"']//parent::td//preceding-sibling::td/input"))
					.click();
	}
	
	public static List<String> contactDetails (String contactName) {
		List<WebElement> details =  driver.findElements(By.xpath("//a[@context='contact' and text()='"+ contactName +"']//parent::td//parent::tr/td"));
		List<String> detailsString = new ArrayList<String>();
		
		for (int i =1 ; i< details.size() ; i++) {
			String text = details.get(i).getText();
			if (!text.contains("|")) {
				detailsString.add(text);
			}
			
		}
		return detailsString;
	}

}







