package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.BaseTest;

public class ScreenshotCapture extends BaseTest{
	
	public void getScreenshot() throws IOException {
		Date currentDate = new  Date();
		String screenshotfilename = currentDate.toString().replace(" ", "_").replace(":", "_");
		System.out.println(screenshotfilename);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scrfile =  ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrfile, new File("C:\\Users\\YogeshMarathe\\parabankautomation\\screenshot\\" + screenshotfilename + ".png"));
//		FileUtils.copyFile(scrfile, new File("./screenshot/")+ screenshotfilename + ".png");
	}

}
