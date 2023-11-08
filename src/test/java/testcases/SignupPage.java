package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import utilities.Listener;
import utilities.ReadExcelData;

@Listeners(Listener.class)

public class SignupPage extends BaseTest {
	
	@Test(dataProviderClass=ReadExcelData.class,dataProvider="Signupdata")
	public void SignupTest(String FirstName,String LastName, String Address, String City, String State, String ZipCode, String Phone, String SSN, String UsernameSignup, String PasswordSignup, String ConfirmPassword  ) throws InterruptedException {
		driver.findElement(By.xpath(locatorfile.getProperty("registerbtn1"))).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("FirstNametab"))).sendKeys(FirstName);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("LastNametab"))).sendKeys(LastName);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Addresstab"))).sendKeys(Address);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Citytab"))).sendKeys(City);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Statetab"))).sendKeys(State);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("ZipCodetab"))).sendKeys(ZipCode);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Phonetab"))).sendKeys(Phone);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("SSNtab"))).sendKeys(SSN);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("UsernameSignuptab"))).sendKeys(UsernameSignup);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("PasswordSignuptab"))).sendKeys(PasswordSignup);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("ConfirmPasswordtab"))).sendKeys(ConfirmPassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Registerbtn2"))).click();
		Thread.sleep(1000);
	}

}
