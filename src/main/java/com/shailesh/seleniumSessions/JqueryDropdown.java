package com.shailesh.seleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropdown {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.findElement(By.id("justAnInputBox")).click();
//		List<WebElement> dropdown = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));
//		
//		for (int i = 0 ; i < dropdown.size() ; i++) {
//			String text = dropdown.get(i).getText();
//			System.out.println(text);
//			
//			if(text.equalsIgnoreCase("choice 6")) {
//				dropdown.get(i).click();
//				break;
//			}
//			
//		}

		By choices = By.cssSelector("span.comboTreeItemTitle");
		//selectChoice(choices, "choice 1");
		//selectChoice(choices, "choice 7");
	}

//	public static void selectChoice(By locator, String value) {
//		List<WebElement> dropdown = driver.findElements(locator);
//
//		for (int i = 0; i < dropdown.size(); i++) {
//			String text = dropdown.get(i).getText();
//			System.out.println(text);
//
//			if (text.equalsIgnoreCase(value)) {
//				dropdown.get(i).click();
//				break;
//			}
//
//		}
//	}

	public static void selectChoice(By locator, String[] value) {
		List<WebElement> dropdown = driver.findElements(locator);

		for (int i = 0; i < dropdown.size(); i++) {
			String text = dropdown.get(i).getText();
			System.out.println(text);

			for (int j = 0; j < value.length; j++) {
				if (text.equals(value[j])) {
					dropdown.get(i).click();
					break;
				}
			}
		}
	}
}
