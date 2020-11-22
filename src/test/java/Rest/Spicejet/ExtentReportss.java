package Rest.Spicejet;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportss {
	
	public static ExtentReports initialize() {
		
		String path = System.getProperty("user.dir")+"\\reports\\index.html";
		
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Prerna");
		
		reporter.config().setDocumentTitle("Cool");
		
		ExtentReports reports = new ExtentReports();
		
		reports.attachReporter(reporter);
		
		return reports;
		
	}

}
