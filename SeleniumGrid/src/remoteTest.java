import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
/*Steps 
1.	Download Selenium server jar
2.	Started the hub
java -jar selenium-server-standalone-3.8.1.jar -role hub

3.	Login to another machine and register it as node for Hub 
4.	Download the selenium server jar in node machine as well/ Check java-
5.	java -jar selenium-server-standalone-3.8.1.jar -role webdriver -hub >ipaddress>/grid/register -port 5566
( Check if java is configured in system variables)

6.Chrome driver.exe file  geckodriver- 
*/
public class remoteTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.MAC);
		
		//for remote running test case
		WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),dc);

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/");
	}

}
