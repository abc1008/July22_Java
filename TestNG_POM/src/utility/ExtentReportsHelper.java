package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsHelper {

	public static void main(String[] args) {

		ExtentReports extentReports = new ExtentReports(); // main class
		
		String projectPath = System.getProperty("user.dir");
		String reportPath = projectPath + "TestResults";

		ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter(reportPath);
	}

}
