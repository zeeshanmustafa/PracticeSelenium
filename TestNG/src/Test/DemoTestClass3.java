package Test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class DemoTestClass3 {
	@Test
	public void HomeLoanWebLogin()
	{
		System.out.println("Home loan Web Login");
		
	}
	
	
	@Test
	public void HomeLoanMobileLogin() {
		System.out.println("Home Loan Loging Mobile");
		
	}
	
	@BeforeSuite
	public void bfSuite() {
		
		System.out.println("I am Number 1 priority");
	}
	@Test
	public void HomeLoanAPILogin() {
		
		System.out.println("Home loan login API");
	}
}
