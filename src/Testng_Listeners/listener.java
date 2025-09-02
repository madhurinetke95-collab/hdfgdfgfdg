package Testng_Listeners;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class listener implements ITestListener {
	
	
	  ExtentReports extent;
	    ExtentTest test;

	    @Override
	    public void onStart(ITestContext context) {
	        // Create unique report name using timestamp
	        String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	        String reportName = "Test-Report-" + timeStamp + ".html";
	        String reportPath = "C:\\Users\\DELL\\Desktop\\Automation\\report\\myreport.html" + reportName;

	        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
	        spark.config().setDocumentTitle("Automation Test Report");
	        spark.config().setReportName("Functional Test Report");
	        spark.config().setTheme(Theme.DARK);

	        extent = new ExtentReports();
	        extent.attachReporter(spark);

	        // System Info
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("OS", "Windows 10");
	        extent.setSystemInfo("Tester", "Madhuri");
	        extent.setSystemInfo("Browser", "Chrome");
	    }

	    @Override
	    public void onTestStart(ITestResult result) {
	        test = extent.createTest(result.getName());
	    }

	    @Override
	    public void onTestSuccess(ITestResult result) {
	        test.log(Status.PASS, "Test case PASSED is: " + result.getName());
	    }

	    @Override
	    public void onTestFailure(ITestResult result) {
	        test.log(Status.FAIL, "Test case FAILED is: " + result.getName());
	        test.log(Status.FAIL, "Cause of failure: " + result.getThrowable());
	    }

	    @Override
	    public void onTestSkipped(ITestResult result) {
	        test.log(Status.SKIP, "Test case SKIPPED is: " + result.getName());
	    }

	    @Override
	    public void onFinish(ITestContext context) {
	        extent.flush(); // Write everything to the report
	    }

}
