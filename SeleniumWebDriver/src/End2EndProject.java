import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class End2EndProject {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_0")).click();
	Assert.assertTrue(true);
		
	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();

	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'])")).click();
	
	driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
	Thread.sleep(2000L);
	
	driver.findElement(By.cssSelector("#divpaxinfo")).click();
	Thread.sleep(2000);
	int i = 1;
	while(i < 4) {
		driver.findElement(By.id("hrefIncAdt")).click();
	i++;
		
	}
	
	Thread.sleep(2000L);
	for(int x=1; x<5; x++) {
		driver.findElement(By.id("hrefIncChd")).click();
		
 	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	System.out.println(driver.findElement(By.cssSelector("#divpaxinfo")).getText());
	
	Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));

	s.selectByValue("USD");
	Thread.sleep(1000);
	Assert.assertFalse(false);
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
	Assert.assertTrue(true);
	Thread.sleep(2000);
	driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
