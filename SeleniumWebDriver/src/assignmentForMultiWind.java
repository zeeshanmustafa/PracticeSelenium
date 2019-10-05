import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class assignmentForMultiWind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		WebDriverWait  w = new WebDriverWait(driver, 5);
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Multiple Windows")).click();
		driver.findElement(By.linkText("Click Here")).click();
		
		Set <String> ids= driver.getWindowHandles();
		
		Iterator <String> it = ids.iterator();
		
		String parentId = it.next();
		String childtId = it.next();
		
		
		driver.switchTo().window(childtId);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".example")));
		System.out.println(driver.findElement(By.cssSelector(".example")).getText());
		
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.xpath("//h3[contains(text(),'Opening a new window')]")).getText());
		

	}

}
