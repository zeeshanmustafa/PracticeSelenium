import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create driver Object base of browser you choose
		
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		//driver.get("http://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.findElement(By.cssSelector("#email")).sendKeys("By selecctor");
		//driver.findElement(By.xpath("//*[@id=\'pass\']")).sendKeys("123456");
		//driver.findElement(By.xpath("//*[@id=\'login_form\']/table/tbody/tr[3]/td[2]/div/a")).click();
		
		
		
		driver.findElement(By.id("username")).sendKeys("My own tried");
		driver.findElement(By.name("pw")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id='Login']")).click();
		System.out.println(driver.findElement(By.cssSelector("#error")).getText());
		//driver.findElement(By.id("email")).sendKeys("My first test");
		//driver.findElement(By.name("pass")).sendKeys("123565");
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		
		//System.out.println(driver.getPageSource());
		//driver.get("http://www.yahoo.com");
		//driver.navigate().back();
		//driver.close();
		driver.quit();
	}

}
