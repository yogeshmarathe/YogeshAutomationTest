package testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import utilities.Listener;
import utilities.ReadExcelData;

@Listeners(Listener.class)

public class LoginPageTest extends BaseTest implements ITestListener {
	
	@Test(dataProviderClass=ReadExcelData.class,dataProvider="SignIndata")
	public void loginTest(String LoginId, String Password)  throws IOException, InterruptedException {
//		Reporter.log("Report for the Login test");
		driver.findElement(By.xpath(locatorfile.getProperty("Username"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Username"))).sendKeys(LoginId);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Password"))).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Password"))).sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("SignInBtn"))).click();
		Thread.sleep(1000);
		String acturl = "https://rise.fairsketch.com/dashboard/index/1";
		String Expurl = driver.getCurrentUrl();
		Assert.assertEquals(acturl, Expurl);
		}
	
	
	
	

}
