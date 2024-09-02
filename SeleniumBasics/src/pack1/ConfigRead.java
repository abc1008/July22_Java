package pack1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {
	
	
	public static void main(String[] args) throws IOException {
		
		
		String projectPath = System.getProperty("user.dir");  // 
		String path = "\\src\\config.properties";
		
		String filePath = projectPath + path;
		FileInputStream file = new FileInputStream(filePath); // to let java know which file to read
		
		Properties prop = new Properties();  	  // object of Properties class
		prop.load(file);  						  //open the file
		String data = prop.getProperty("UserId"); // get the data using propertyName
		System.out.println(data);
		
		
	}
	
	
	
	

}
