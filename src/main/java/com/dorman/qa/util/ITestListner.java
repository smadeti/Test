package main.java.com.dorman.qa.util;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;

public class ITestListner extends TestUtil implements ITestNGListener{
	
	public void onTestStart(ITestResult result)

	{
		
	}
	   
	  public void onTestSuccess(ITestResult result){
		  
	  }

	
	  public void onTestFailure(ITestResult result) throws IOException {
		  takeScreenshotAtEndOfTest(result.getTestName());
	  }

	 
	  public void onTestSkipped(ITestResult result){}

	  
	  public void onTestFailedButWithinSuccessPercentage(ITestResult result){
		  
	  }

	  
	  public void onStart(ITestContext context) {
		  
	  }

	
	  public void onFinish(ITestContext context) {
		  
	  }


}
