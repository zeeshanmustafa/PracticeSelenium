import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assigmnet2EndtoEnd {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.get("https://www.cleartrip.com");
		
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		
		Thread.sleep(2000);
		
Select s = new Select(driver.findElement(By.id("Adults")));

  s.selectByValue("4");
  
  Select x = new Select(driver.findElement(By.id("Childrens")));
  
  x.selectByValue("2");
  
  driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
   driver.findElement(By.id("AirlineAutocomplete")).click();
   driver.findElement(By.id("AirlineAutocomplete")).sendKeys("AirIndia");
   Thread.sleep(2000);
   
   driver.findElement(By.id("SearchBtn")).click();
   
  System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
  
	}

}
