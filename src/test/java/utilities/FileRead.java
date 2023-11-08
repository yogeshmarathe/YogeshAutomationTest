package utilities;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class FileRead {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\Users\\YogeshMarathe\\parabank\\src\\test\\resources\\configfiles\\configuration.properties");
		Properties prop = new Properties();
		prop.load(fr);
		System.out.println(prop.getProperty("browser"));
		
	}

}
