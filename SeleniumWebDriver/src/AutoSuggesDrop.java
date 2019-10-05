import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.makemytrip.com");
	driver.getCurrentUrl();
	driver.getTitle();
	WebElement source = driver.findElement(By.id("fromCity"));
	source.click();
	
WebElement source2 = driver.findElement(By.xpath("//input[@placeholder='From']"));
source2.sendKeys("DEL");
	Thread.sleep(2000L);
	source2.sendKeys(Keys.ENTER);
	
	driver.findElement(By.id("toCity")).click();
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("Pun");
	Thread.sleep(2000L);
	
	for(int x = 0; x < 5; x++) {
		driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);
		
	}
	driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
	
	
	
	
	
	}

}
