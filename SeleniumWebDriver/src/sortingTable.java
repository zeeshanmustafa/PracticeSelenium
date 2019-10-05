import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sortingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
	//	driver.findElement(By.cssSelector("tr th:nth-child(2)")).click();
		
  List<WebElement> columnName= driver.findElements(By.cssSelector("tr td:nth-child(2)"));
	
	
	ArrayList <String> originalList = new ArrayList<String>();
	
	for(int i=0; i<columnName.size(); i++) {
		
		
		originalList.add(columnName.get(i).getText());
	}
	ArrayList <String> copiedList = new ArrayList <String>();
	
	for(int i=0; i<originalList.size(); i++) {
		
		copiedList.add(originalList.get(i));
	}
	
	Collections.sort(copiedList);
	Collections.reverse(copiedList);
	
	System.out.println("********copiedList********");
	for(String s: copiedList) {
		System.out.println(s);
		
	}
	
	System.out.println("*******OriginalList********");
	for(String s: originalList) {
		System.out.println(s);
		
	
	}
	
	Assert.assertTrue(originalList.equals(copiedList));
	
	}
	
	
	

}
