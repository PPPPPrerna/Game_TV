package Rest.Spicejet;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Listeners implements ITestListener {
	
	ExtentReports reports =ExtentReportss.initialize();
	
	ExtentTest test;
	
	ThreadLocal<ExtentTest> local = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		local.get().log(Status.PASS, "PASS");
		
		
	}
 
	public void onTestSuccess(ITestResult result) {
		//local.get().log(Status.PASS, null);
		
		local.get().pass("PASSED");
		
	}
 
	public void onTestFailure(ITestResult result) {
		
	}
 
	public void onTestSkipped(ITestResult result) {
		
	}
 
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
 
	public void onStart(ITestContext context) {
		
		test=reports.createTest(context.getName());
		
		local.set(test);
		
	}
 
	public void onFinish(ITestContext context) {
		
		reports.flush();
		
	}
	
	
}
