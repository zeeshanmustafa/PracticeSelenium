import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyOwnPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.bankofamerica.com/?page_msg=signoff&request_locale=en_us");
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		
	WebElement	footerDriver=driver.findElement(By.xpath("//div[@class='footer-bottom clearfix']"));
		
		for(int x = 0; x < 11; x++) {
			
	String	clickToOpenSepa =Keys.chord(Keys.COMMAND, Keys.ENTER);
	
	footerDriver.findElements(By.tagName("a")).get(x).sendKeys(clickToOpenSepa);
			
			
			
		}
		
		Set <String> ids = driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
				
				while(it.hasNext()) {
					
					driver.switchTo().window(it.next());
					
				}
		
		
		
		
		
		
		
		
	/*WebElement footerDriver=driver.findElement(By.xpath("//div[@class='footer-bottom clearfix']"));
		
	for(int i = 0; i < 12; i++) {
		
	String clickOnTabLink =	Keys.chord(Keys.COMMAND, Keys.ENTER);
		
		footerDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnTabLink);
		
	}
	
	Set <String> ids = driver.getWindowHandles();
	
Iterator<String> it  =	ids.iterator();
	
	while(it.hasNext()) {
		
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	}
	
	
		/*List<WebElement> items=driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		String[] vegeName= {"Mango","Water Melon","Walnuts","Grapes","Brocolli","Nuts Mixture","Musk Melon"};
		
		for(int i = 0; i < items.size(); i++) {
			
		String[]	splittedName=items.get(i).getText().split("-");
	String	formattedName = splittedName[0].trim();
	
	List itemsNeeded = Arrays.asList(vegeName);
	
	
	if(itemsNeeded.contains(formattedName)) {
		j++;
		
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
		if(j == vegeName.length ) {
			break;
		}
		
		
	}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	/*WebElement footerDriver =	driver.findElement(By.id("gf-BIG"));
	System.out.println(footerDriver.findElements(By.tagName("a")).size());
	
	WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
	System.out.println(columnDriver.findElements(By.tagName("a")).size());
	
	for(int i = 1; i < columnDriver.findElements(By.tagName("a")).size(); i++) {
		
		String clickAbleLinks = Keys.chord(Keys.COMMAND, Keys.ENTER);
		
		columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickAbleLinks);
		
		
	}
	
	Set <String> ids = driver.getWindowHandles();
	Iterator <String> it = ids.iterator();
	
	while(it.hasNext()) {
		
		driver.switchTo().window(it.next());
		
		System.out.println(driver.getTitle());
		
	}
	
	
	
	
	
	
		

		// Set<String> ids = driver.getWindowHandles();

		// Iterator <String>it = ids.iterator();

		/*
		 * driver.get(
		 * "https://www.bankofamerica.com/?page_msg=signoff&request_locale=en_us");
		 * 
		 * Actions a = new Actions(driver);
		 * 
		 * driver.findElement(By.xpath("//input[@placeholder='How can we help you?']")).
		 * click(); Thread.sleep(3000); a.moveToElement(driver.findElement(By.
		 * xpath("//input[@placeholder='How can we help you?']")))
		 * .keyDown(Keys.SHIFT).sendKeys("carrot").build().perform();
		 * 
		 * 
		 * // a.moveToElement(driver.findElement(By.xpath("//li[@class='nav-item'] //
		 * //a[contains(text(),'Subscribe')]"))).build().perform();
		 * 
		 * /* driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
		 * driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 * 
		 * String[] itemsNeeded = { "Cauliflower", "Beans", "Beetroot", "Brinjal",
		 * "Carrot" };
		 * 
		 * List<WebElement> products =
		 * driver.findElements(By.cssSelector("h4.product-name")); int j = 0; for(int i
		 * = 0; i < products.size(); i++) {
		 * 
		 * String[] splittedName = products.get(i).getText().split("-"); String
		 * formattedName = splittedName[0].trim();
		 * 
		 * List itemsNeededToList = Arrays.asList(itemsNeeded);
		 * 
		 * if(itemsNeededToList.contains(formattedName)) { j++;
		 * driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i)
		 * .click();
		 * 
		 * if(j == itemsNeeded.length) { break; } }
		 * 
		 * 
		 * }
		 */

	}
}