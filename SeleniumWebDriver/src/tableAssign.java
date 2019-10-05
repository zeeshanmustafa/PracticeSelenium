import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		
		
	WebElement table =	driver.findElement(By.id("product"));
	
	int rowCount = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		
		System.out.println(rowCount);
		
		int colCount = table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		
		System.out.println(colCount);
		
		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());
		
		
		
		
		
		
		
		
		
		/*
		WebElement table= driver.findElement(By.xpath("//table[@id='product']"));

		int rowcount = table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();

		System.out.println(rowcount);

		int columncount = table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();

		System.out.println(columncount);

		System.out.println(table.findElement(By.xpath("//table[@id='product']/tbody/tr[3]")).getText());

		
		
	/*WebElement table=	driver.findElement(By.id("product"));
System.out.println(table.findElements(By.tagName("tr")).size());
System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
	
List<WebElement> secondRow=driver.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
	
System.out.println("First col  "+secondRow.get(0).getText());
System.out.println("Second col  "+secondRow.get(1).getText());
System.out.println("Third col   "+secondRow.get(2).getText());*/
	
	}
	

}
