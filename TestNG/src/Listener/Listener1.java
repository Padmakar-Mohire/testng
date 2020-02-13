package Listener;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class Listener1 extends TestListenerAdapter {
	
	public void onTestSuccess(ITestResult tr) {
		System.out.println("Testcase passed");
		
	}
	
	public void onTestFailure(ITestResult tr) {
		System.out.println("testcase failed");
	}

}
