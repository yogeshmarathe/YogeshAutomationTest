# parabankautomation
Project Setup - 
Go to selenium 
create new project 
select maven project and click on create simple project.
Select a folder where you want complete your work. 
After making project provide artifact ID and Group IG. 
Create different packages under src/test - base, testcases, utilities
Create diffrent packages under src/test/resources - config files, reports, logs and testdata

Open POM.xml - Add dependencies - WebDriverManager, Apache POI Commom, TestNG, Selenium, log4J, 
Save POM.xml

create BaseTest Class in Base package without main method
Add Setup and teardown methods 
Create object for WebDriver, FileReader and Properties 
Add configfile and locator file under config file package with .properties extension. 

Test basic set up by creating sample test class 

Test File reader by File Read code 

In base class use @BeforeTest for the setup methods 
add basic functionalities under the base class such as initiating chrome, reading config file and reading browser value and testurl value. 
Use @ After Test annotation for the teardow and use  driver.close to close the browser. 

Write test cases use @Test annotation. 
For maintaning xpaths use locators.properties file.. 
read the value in the properties file by driver.get(locator.getProperty("username"));

Run the test case as the TestNG Test
use Assert to verify the condition. 
