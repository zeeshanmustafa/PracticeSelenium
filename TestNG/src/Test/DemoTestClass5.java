package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DemoTestClass5 {
	
	@Test
	public void Method1() {
		System.out.println("Method 1");
	}
    @Parameters ({"URL", "APIKEY/Username"})
	@Test //(dependsOnMethods={"Method3"}) attribute 
	public void Method2(String urlname, String apiKey) {
		System.out.println("Method 2");
		System.out.println(urlname);
		System.out.println(apiKey);
	}
    

	@Test(enabled=false)//Attribute turn off this specific test
	public void Method3() {
		System.out.println("Method 3");
	}

	@Test//(timeOut=4000) Attribute  test will not fail until 40 seconds
	public void Method4() {
		System.out.println("Method 4");
	}

	@AfterClass
	public void afClass()
	{
		System.out.println("Ater class execution");
		
	}
	
	
	@BeforeMethod
	public void bfMehod() {
		System.out.println("I am b4 every method");
		
	}
	
	@BeforeClass
	public void bfClass() {
		
		System.out.println("Before class execution");
	}
	
	
	@AfterMethod
	public void afMethod() {
		
		System.out.println("I am b4 After every method");
	}
	
	@BeforeSuite
	public void bfAnyThing() {
		System.out.println("I am on top # 1 to print at any cost");
	}
	

}
