import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.asserts.*;


public class dropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.spicejet.com");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			
			Assert.assertTrue(true);
		
		}
		else {
			Assert.assertTrue(false);
		}
		
		
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
	//	System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		
		
		driver.findElement(By.id("ctl00_mainContent_chk_IndArm")).click();
		//System.out.println(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='chk_IndArm']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='IXG']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='VTZ'])")).click();
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		Thread.sleep(2000L);
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i = 1;
		while(i < 4) {
			driver.findElement(By.id("hrefIncAdt")).click();
		i++;
			
		}
		
		Thread.sleep(2000L);
    	for(int x=1; x<5; x++) {
			driver.findElement(By.id("hrefIncChd")).click();
			//i++;
	 	}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText() , "4 Adult, 4 Child");
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		
		//Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		
		//s.selectByValue("AED");
		//s.selectByIndex(3);
		//s.selectByVisibleText("AED");
		

	}

}
