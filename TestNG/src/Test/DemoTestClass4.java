package Test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoTestClass4 {
	
	@AfterMethod
	public void afEveMethod() {
		
		System.out.println("I will be calling after everymethod as I m decalred AfterMethod");
	}
	
	@Test
	public void CarLoanWebLogin() {
		System.out.println("Car loan Web Login");

	}

	@Test
	public void MobileCarLoanLogin1() {
		System.out.println("Car Loan Loging Mobile 1");

	}

	@AfterSuite
	public void afSuite() {
		System.out.println("Iam declared as After suite there fore will print in last ");
	}

	@BeforeSuite
	public void bfSuite() {

		System.out.println("I am declared as beofresuite test therefore I m on top");
	}

	@Test(groups= {"Smoke"})
	public void MobileCarLoanLogin2() {
		System.out.println("Car Loan Loging Mobile 2");

	}

	@Test
	public void MobileCarLoanLogin3() {
		System.out.println("Car Loan Loging Mobile 3");

	}

	@Test
	public void MobileCarLoanLogin4() {
		System.out.println("Car Loan Loging Mobile 4");

	}

	@Test
	public void MobileCarLoanLogin5() {
		System.out.println("Car Loan Loging Mobile 5 this method will run first");

	}

	@Test
	public void CarLoanAPILogin() {

		System.out.println("Car loan login API");

	}

	@BeforeMethod
	public void beforeEveMethod() {

		System.out.println("I will be executing before every method in the class where I am declared");
	}
}
