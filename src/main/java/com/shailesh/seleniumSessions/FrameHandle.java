package com.shailesh.seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://londonfreelance.org/courses/frames/index.html");

		driver.switchTo().frame(2);
		
		String text = driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println("Text is "+ text);
	}

}
