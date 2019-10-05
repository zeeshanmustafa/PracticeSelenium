import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");

WebDriver driver = new ChromeDriver();
driver.get("http://www.echoecho.com/htmlforms10.htm");
//driver.get("https://www.facebook.com");

//driver.findElement(By.xpath("//input[@id='u_0_8']")).click();
int count = driver.findElements(By.xpath("//input[@value='Milk']")).size();

for (int x = 0; x < count; x++) {
	
	//driver.findElements(By.xpath("//input[@name='group1']")).get(x).click();
	System.out.println(driver.findElements(By.xpath("//input[@name='group1']")).get(x).getAttribute("value"));
}
	}

}
