package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {

	WebDriver driver;

	/**
	 * This method is used to initialize the driver on the basis of browser name.
	 * 
	 * @param browserName
	 * @return WebDriver
	 */

	public WebDriver initDriver(String browserName) {

		System.out.println("Browser name is :" + browserName);

		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Please pass the right browser :" + browserName);
			break;
		}
		return driver;
	}
	
	/**
	 * This method is used to launch the url
	 * @param url
	 */
	public void launchURL(String url) {
		if(url.isEmpty()) {
			System.out.println("URL is empty");
		}
		if (url.contains("http")|| url.contains("https")) {
			driver.get(url);
		}
	}
	
	/**
	 * This method is used to get the page title
	 * 
	 */
	public String doGetTitle() {
		return driver.getTitle();
	}
	
	public String getPageCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
	public String doGetPageSource() {
		return driver.getPageSource();
	}
	
	public void closeBrowser() {
		driver.close();
	}
	
	public void quitBrowser() {
		driver.quit();
	}
	

}







