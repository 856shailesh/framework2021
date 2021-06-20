package testngSessions;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterAccount extends BaseTest {
	
	//Parametrization of Test
	@DataProvider
	public Object[][] registerData() {
		return new Object[][]  {
			{"rohit", "shetty","rohitshetty23231@gmail.com", "2323232312", "232323"},
			{"tom", "sharma","tomsharma2334@gmail.com", "2289898989", "232323"},
			{"John", "Sisiliano","Johnsisi7789@gmail.com", "2323232312", "232323"},
			{"Puja", "verma","pujaverma5656@gmail.com", "2289898989", "232323"},
			{"rohit", "gupta","rohitgupta2311@gmail.com", "1010101010", "232323"}
					};	
	}
	
	@Test(dataProvider = "registerData")
	public void register(String firstname, String lastname, String email, String telephone ,String passowrd ) {
		driver.findElement(By.id("input-firstname")).sendKeys(firstname);
		driver.findElement(By.id("input-lastname")).sendKeys(lastname);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		
		driver.findElement(By.id("input-password")).sendKeys(passowrd);
		driver.findElement(By.id("input-confirm")).sendKeys(passowrd);
		
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
		
		
	}

}
