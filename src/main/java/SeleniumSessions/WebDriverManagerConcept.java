package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class WebDriverManagerConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		//driver.close(); //close the browser
		
		//System.out.println(driver.getTitle());

	}

}
