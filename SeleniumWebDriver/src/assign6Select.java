import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assign6Select {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
	String a = "Option3";
		driver.findElement(By.id("checkBoxOption3")).click();
		//String a = driver.findElement(By.id("checkBoxOption3")).getText();
		System.out.println(a);
		driver.findElement(By.id("dropdown-class-example")).click();
		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(a);
		
		driver.findElement(By.id("name")).click();
		driver.findElement(By.id("name")).sendKeys(a);
		
		driver.findElement(By.id("alertbtn")).click();
		//Thread.sleep(2000);
		String text = driver.switchTo().alert().getText();
		//driver.switchTo().alert().accept();
		//System.out.println(driver.switchTo().alert().getText());
		if(text.contains(text)) {
			System.out.println("Success");
		}
		else {
			System.out.println("failed");
		}
		
		driver.switchTo().alert().accept();

	}

}
