package testcases;

import org.openqa.selenium.By;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import utilities.Listener;
import utilities.ReadExcelData;

@Listeners(Listener.class)

public class SignupPage extends BaseTest implements ITestListener{
	
//	@Test(dataProviderClass=ReadExcelData.class,dataProvider="Signupdata")
	@Test(dataProviderClass=ReadExcelData.class,dataProvider="Signupdata")
	public void SignupTest(String FirstName,String LastName, String ComapanyName, String email, String Password, String RetypePassword  ) throws InterruptedException {
		

//	public void SignupTest(String FirstName,String LastName) throws InterruptedException {
		
		driver.findElement(By.xpath(locatorfile.getProperty("Signupbtn1"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(locatorfile.getProperty("FirstNametab"))).sendKeys(FirstName);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("LastNametab"))).sendKeys(LastName);
		Thread.sleep(1000);
//		driver.findElement(By.xpath(locatorfile.getProperty("Typeradiobtn"))).click();
//		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("CompanyNameTab"))).sendKeys(ComapanyName);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("emailTab"))).sendKeys(email);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Passwordtab"))).sendKeys(Password);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("RetypePasswordtab"))).sendKeys(RetypePassword);
		Thread.sleep(1000);
		driver.findElement(By.xpath(locatorfile.getProperty("Signupbtn2"))).click();
		Thread.sleep(1000);
//		
	}

}
