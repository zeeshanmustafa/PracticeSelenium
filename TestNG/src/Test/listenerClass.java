package Test;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//ITestListener its a interface which implements Test Listener
public class listenerClass implements ITestListener{

	@Override
	public void onFinish(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		// Screenshot code when test fails
		//response if API failed
		
		System.out.println("Failed Test " + result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
		System.out.println("All test casee passed and i m the listener class");
	}

}
