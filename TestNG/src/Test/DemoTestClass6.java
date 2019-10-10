package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoTestClass6 {
	
	
	@DataProvider // checing multipl data combinataion
	public Object[][] getData() {
		//1st combination - username password - good credit history
		//2nd - username password --bad credit history
		//3rd - username password - fraudlent 
		
		Object [][] data= new Object[3][2];
		//1st user data 
		data[0][0] = "First Useer name";
		data[0][1] = "Password";
		//2nd user data
		data[1][0] = "2nd Useer name";
		data[1][1] = "Password";
		
		//3rd user data
		data[2][0] = "3rd Useer name";
		data[2][1] = "Password";
		
		return data;
		
	}

	

	@Test
	public void dataPar1() {
		
		System.out.println("data para 1");
		
	}
	

	@Test(dataProvider = "getData")
	public void dataPar2(String username, String password) {
		System.out.println(username);
		System.out.println(password);
		
		
		
	}
}
