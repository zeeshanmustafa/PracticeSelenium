import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver" , "/Users/Zeeshan/Documents/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//driver.get("http://www.facebook.com");
		//driver.get("http://www.rediff.com");
		//driver.get("http://www.yahoo.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.cssSelector("#uh-signin")).click();
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("kkkk");
		//driver.findElement(By.xpath("//*[@id=\'login-signin\']")).click();
		
		//System.out.println(driver.findElement(By.xpath("//p[@id='username-error']")).getText());
		//driver.findElement(By.xpath("//input[@id='uh-search-box']")).sendKeys("priceline");
		
		//driver.findElement(By.cssSelector("button#uh-search-button")).click();
		//driver.findElement(By.cssSelector("a[title*='Sign in']")).click();
	    //driver.findElement(By.xpath("//*[@href='https://mail.google.com/mail/?']")).click();;
		//driver.findElement(By.cssSelector("input#password")).sendKeys("1234");
		//driver.findElement(By.cssSelector("input[value='Go']")).click();
		//driver.findElement(By.xpath("//input[@type='email']")).sendKeys("hello");
		//driver.findElement(By.cssSelector("input[type='password']")).sendKeys("manual css path");
		//driver.findElement(By.cssSelector("input[value='Log In']")).click();
        //driver.findElement(By.linkText("Gmail")).click();
		//driver.findElement(By.linkText("SIGN IN")).click();
		//driver.findElement(By.name("email")).sendKeys("hello_brother2002@hotmail.com");
		//driver.findElement(By.name("password")).sendKeys("122333");
		//driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath(".//html[1]/body[1]/div[1]/div[5]/form[1]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("hello");
		//driver.quit();
		
		
	}

}
