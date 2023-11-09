package testcases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.commonpages.LoginPage;

import Base.BaseTest;
import utilities.Listener;
import utilities.ReadExcelData;

@Listeners(Listener.class)

public class LoginPageTest extends LoginPage implements ITestListener {
	@Test(priority = 1)
	public void TC_LoginFailWithEmailNull() {
		username.clear();
		username1.sendKeys("");;
		password.clear();
		password1.sendKeys("");;
		SignIn.click();
	}
	@Test(priority = 2)
	public void TC_LoginFailWithEmailDoesNotExist() {
		username.clear();
		username1.sendKeys("");;
		password.clear();
		password1.sendKeys("123456");;
		SignIn.click();
	}
	@Test(priority = 3)
	public void TC_LoginFailWithNullPassword() {
		username.clear();
		username1.sendKeys("abc@gmail.com");;
		password.clear();
		password1.sendKeys("");;
		SignIn.click();
	}
	@Test(priority = 4)
	public void TC_LoginFailWithIncorrectPassword() {
		username.clear();
		username1.sendKeys("admin@demo.com");
		password.clear();
		password1.sendKeys("riseDemoQ");;
		SignIn.click();
	}
	@Test(priority = 5)
	public void TC_LoginSuccessWithCustomerAccount() {
		username.clear();
		username1.sendKeys("admin@demo.com");
		password.clear();
		password1.sendKeys("riseDemo");;
		SignIn.click();
	}
	
	
//	@Test(dataProviderClass=ReadExcelData.class,dataProvider="SignIndata")
//	public void loginTest(String LoginId, String Password)  throws IOException, InterruptedException {
//
//		driver.findElement(By.xpath(locatorfile.getProperty("Username"))).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(locatorfile.getProperty("Username"))).sendKeys(LoginId);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(locatorfile.getProperty("Password"))).clear();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(locatorfile.getProperty("Password"))).sendKeys(Password);
//		Thread.sleep(1000);
//		driver.findElement(By.xpath(locatorfile.getProperty("SignInBtn"))).click();
//		Thread.sleep(1000);
//		String acturl = "https://rise.fairsketch.com/dashboard/index/1";
//		String Expurl = driver.getCurrentUrl();
//		Assert.assertEquals(acturl, Expurl);
//		}
	
	
	
	

}
