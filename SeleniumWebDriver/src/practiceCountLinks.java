import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceCountLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
	System.out.println(driver.findElements(By.tagName("a")).size());

	
	WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
	System.out.println(footerdriver.findElements(By.tagName("a")).size());
	
	WebElement coludriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(coludriver.findElements(By.tagName("a")).size());
	
	//click on each link and check if window opens up
	
	for(int i = 1; i < coludriver.findElements(By.tagName("a")).size(); i++){
		
	String clickOnLinkTab = Keys.chord(Keys.COMMAND , Keys.ENTER);
		coludriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
		Thread.sleep(5000L);
		
	}
		Set <String> ids = driver.getWindowHandles();
		Iterator <String> it = ids.iterator();
		
		while(it.hasNext()) {
			
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
	
	
	}

}
