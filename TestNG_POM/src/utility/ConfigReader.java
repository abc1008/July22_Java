package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	public static String getData(String propertyName) throws IOException
	{
		String projectPath = System.getProperty("user.dir");  // to get the path of project
		String path = "\\src\\config.properties";
		
		String filePath = projectPath + path;
		FileInputStream file = new FileInputStream(filePath); // to let java know which file to read
		
		Properties prop = new Properties();  	  // object of Properties class
		prop.load(file);  						  //open the file
		String propertyValue = prop.getProperty(propertyName); // get the data using propertyName
		
		return propertyValue;
	}
	

}
