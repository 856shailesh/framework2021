package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitandClose {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium Libs\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in");
		
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
		//driver.close(); //close the browser
		
		System.out.println(driver.getTitle());

	}

}
