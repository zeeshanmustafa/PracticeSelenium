import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoDropBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://ksrtc.in");
		driver.findElement(By.id("fromPlaceName")).sendKeys("BENG");
		Thread.sleep(2000);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		String script = "return document.getElementById(\"fromPlaceName\").value;";
	
	String text = (String) js.executeScript(script);
	System.out.println(text);
	
	while(!text.equalsIgnoreCase("BENGALURU AIRPORT")) {
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		
		text = (String) js.executeScript(script);
		System.out.println(text);
		
	}
	
	
	}

}
