package utilities;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends ScreenshotCapture implements ITestListener {
	
	public void onTestFailure(ITestResult result) {  
		 
		System.out.println("Failure of test cases and its details are : "+result.getName() );  
		try {
			getScreenshot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}  
	

}
