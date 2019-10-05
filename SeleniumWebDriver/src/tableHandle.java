import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22688/stz-vs-gaw-22nd-match-caribbean-premier-league-2019");
		int sum = 0;
	WebElement table =	driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
	
	 int rowCounts =  table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
	  
	int count = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
	
	for(int i = 0; i <  count-2; i++) {
		
		String value = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
	int valueInt  =  Integer.parseInt(value);
	sum+=valueInt;
	
	}
	
	
	String extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
	int extrasValues = Integer.parseInt(extras);
	int total = sum+extrasValues;
	System.out.println(total);
	System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
driver.close();
driver.quit();
	}

}
