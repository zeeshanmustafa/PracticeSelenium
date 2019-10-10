package QaClickAcademy;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class AppiumTest {

@Test
public void AndroidApp() {
	
	System.out.println("I am Android App");
}
@Test
public void IOSApp() {
	System.out.println("I am IOS Test");
	
}


  @Test (groups = {"Smoke"})
  public void AnotherSomke() {
	  System.out.println("I am Smoke Test Method");
  }
}
