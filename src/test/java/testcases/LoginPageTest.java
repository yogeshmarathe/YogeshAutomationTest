package testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import utilities.Listener;

@Listeners(Listener.class)

public class LoginPageTest extends BaseTest implements ITestListener {
	
	@Test
	public void loginTest()  throws IOException, InterruptedException {
		
		driver.findElement(By.xpath(locatorfile.getProperty("Username"))).sendKeys("MaratheYogesh");
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Password"))).sendKeys("Yogesh@123");
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("LoginBtn"))).click();
		Thread.sleep(1000);
		String acturl = "https://parabank.parasoft.com/parabank/overview.htm";
		String Expurl = driver.getCurrentUrl();
		Assert.assertEquals(acturl, Expurl);
		}
	
	
	
	

}
