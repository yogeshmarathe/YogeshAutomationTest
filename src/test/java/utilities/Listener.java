package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends ScreenshotCapture implements ITestListener {
	
	public void onTestFailure(ITestResult result) { 
		
		Reporter.log("Test failed for the methhod : " +result.getName());
		Reporter.log("Test failed for the methhod : " +result.getTestContext());
		System.out.println("Failure of test cases and its details are : "+result.getName() );  
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}  
	

}
