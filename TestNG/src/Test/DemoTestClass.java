package Test;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class DemoTestClass {
	
	@AfterTest
	public void LastExcecution() {
		
		System.out.println("Last Exe eventhough written in first class and first method");
	}
	
	@Test(groups= {"Smoke"})
	public void test1() {
		
		System.out.println("Test1 Printing");
		
	
	}
		
		@Test(groups= {"Smoke"})
		public void test2() {
			
			System.out.println("Prining/Runing test2");
		}
	@AfterSuite
	public void afSuite() {
		
		System.out.println("I m the last from number 1 ");
	}
		@Test
		public void test3() {
			System.out.println("test3 Running");
			
			Assert.assertTrue(false);
		}

}
