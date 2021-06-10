package com.shailesh.seleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CricinfoScore {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get(
				"https://www.espncricinfo.com/series/new-zealand-in-england-2021-1249202/england-vs-new-zealand-2nd-test-1249211/live-cricket-score");

		doBowlerFigure("Trent Boult").stream().forEach(e -> System.out.print(e + "   "));
		System.out.println();
		doBowlerFigure("Matt Henry").stream().forEach(e -> System.out.print(e + "   "));

	}

	public static List<String> doBowlerFigure(String name) {
		List<WebElement> stats = driver
				.findElements(By.xpath("//a[text()= '"+name+"']//parent:: td//parent::tr/td"));
		List<String> bowler = new ArrayList<String>();

		for (int i = 0; i < stats.size(); i++) {
			String text = stats.get(i).getText();
			bowler.add(text);
		}
		return bowler;
	}

}
