package testcases;

import org.openqa.selenium.By;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Base.BaseTest;
import utilities.Listener;

@Listeners(Listener.class)
@Test
public class HomePageTest extends BaseTest implements ITestListener {
	
	public void AboutusTest() throws InterruptedException {
		driver.findElement(By.xpath(locatorfile.getProperty("AboutusLink"))).click();
		Thread.sleep(1000);
		String expurl = "https://parabank.parasoft.com/parabank/about.htm";
		String acturl = driver.getCurrentUrl();
//		WebElement info = driver.findElement(By.xpath("//h1[@class='title']"));
//		info.getText();
		Assert.assertEquals(acturl, expurl, "About us page Test Passed ");
			
	}
	
	public void servicesTest() throws InterruptedException {
		driver.findElement(By.xpath(locatorfile.getProperty("ServicesLink"))).click();
		Thread.sleep(1000);
		String expurl = "https://parabank.parasoft.com/parabank/services.htm";
		String acturl = driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl, "Services page Test Passed ");
			
	}
	
	public void productsTest() throws InterruptedException {
		driver.findElement(By.xpath(locatorfile.getProperty("ProductsLink"))).click();
		Thread.sleep(1000);
		driver.navigate().back();
		String expurl = "https://www.parasoft.com/products/";
		String acturl = driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl, "Products page Test Passed ");
	}
	
	public void LocationTest() throws InterruptedException {
		driver.findElement(By.xpath(locatorfile.getProperty("LocationsLink"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		String expurl = "https://www.parasoft.com/solutions/";
		String acturl = driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl, "Locations page Test ");
	}
	
	public void adminpageTest() throws InterruptedException {
		driver.findElement(By.xpath(locatorfile.getProperty("AdminPagelink"))).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		String expurl = "https://parabank.parasoft.com/parabank/admin.htm";
		String acturl = driver.getCurrentUrl();
		Assert.assertEquals(acturl, expurl, "Admin page Test ");
	}


}
