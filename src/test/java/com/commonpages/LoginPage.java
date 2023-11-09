package com.commonpages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import Base.BaseTest;

public class LoginPage extends BaseTest{
	public static WebElement username;
	public static WebElement username1;
	public static WebElement password;
	public static WebElement password1;
	public static WebElement SignIn;
	
	public void loginTest(String LoginId, String Password)  throws IOException, InterruptedException {

		username = driver.findElement(By.xpath(locatorfile.getProperty("Username")));
		Thread.sleep(1000);
		username1 = driver.findElement(By.xpath(locatorfile.getProperty("Username")));
		Thread.sleep(1000);
		password = driver.findElement(By.xpath(locatorfile.getProperty("Password")));
		Thread.sleep(1000);
		password1 = driver.findElement(By.xpath(locatorfile.getProperty("Password")));
		Thread.sleep(1000);
		SignIn = driver.findElement(By.xpath(locatorfile.getProperty("SignInBtn")));
		Thread.sleep(1000);
	}
}
