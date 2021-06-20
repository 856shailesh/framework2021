package testngSessions;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchProducts extends BaseTest {

	@DataProvider
	public Object[][] registerData() {
		return new Object[][] { { "mac" }, { "modem" }, { "Monitors" } };
	}

	@BeforeTest
	public void loginToApp() {
		System.out.println("BM -- Login to app");
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		driver.findElement(By.id("input-email")).sendKeys("naveenanimation20@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	}

	@Test(dataProvider = "registerData")
	public void register(String productName) {

		driver.findElement(By.xpath("//input[@name= 'search']")).clear();
		driver.findElement(By.xpath("//input[@name= 'search']")).sendKeys(productName);
		driver.findElement(By.xpath("//div[@id= 'search']/span/button")).click();
	}

}
