import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlinMultiWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");

		driver.findElement(By.linkText("Help")).click();
		System.out.println(driver.getTitle());

		Set<String> ids = driver.getWindowHandles();

		Iterator<String> it = ids.iterator();

		String parentid = it.next();
		String childid = it.next();

		driver.switchTo().window(childid);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

}
