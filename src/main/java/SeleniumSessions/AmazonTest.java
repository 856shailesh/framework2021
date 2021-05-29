package SeleniumSessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {
		String browserName = "chrome";
		BrowserUtil br = new BrowserUtil();
		
		WebDriver driver = br.initDriver(browserName);
		br.launchURL("https://amazon.in");
		
		String title = br.doGetTitle();
		System.out.println("Title is " + title);
		
		br.closeBrowser();
	}

}
