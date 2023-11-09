package Base;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public static WebDriver driver;
	public static Properties configfile = new Properties();
	public static FileReader config;
	public static Properties locatorfile = new Properties();
	public static FileReader loc;
	public static Properties datafile = new Properties();
	public static FileReader data;
		
	@BeforeTest
	public void setup() throws IOException {
		
		config = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\configuration.properties");
		configfile.load(config);
		loc = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\locators.properties");
		locatorfile.load(loc);
		data = new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\configfiles\\data.properties");
		datafile.load(data);
		
		System.out.println(configfile.getProperty("browser"));
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(configfile.getProperty("URL_CRM"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
		
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
		System.out.println("Teardown Successful");
	}
	
}
