import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoDropAssign {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		
		
		String inputText = "Uni";

		String requiredContry = "United States";

		String xpathString = "//div[text()='" + requiredContry + "']";



		driver.findElement(By.id("autocomplete")).sendKeys(inputText);

		Thread.sleep(2000L);

		driver.findElement(By.xpath(xpathString)).click();



		// Use JScript Executor to get the text

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value";

		String text = (String) js.executeScript(script);



		if (text.equalsIgnoreCase(requiredContry)) {

		System.out.println("Test Passed");

		} else {

		System.out.println("Test Failed");

		}

		



		
		
		/*driver.findElement(By.cssSelector("#autocomplete")).sendKeys("UNI");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);
		
		System.out.println(driver.findElement(By.cssSelector("#autocomplete")).getText());
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
	String script =	"return document.getElementById(\"autocomplete\").value;";
	String text = (String) js.executeScript(script);
	
	System.out.println(text);
	
	while(!text.equalsIgnoreCase("United States")) {
		
		driver.findElement(By.cssSelector("#autocomplete")).sendKeys(Keys.DOWN);

		text = (String) js.executeScript(script);
		System.out.println(text);
		
	
	}*/
	
	
	

	}

}
