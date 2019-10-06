import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class sauceLab {

	// https://wiki.saucelabs.com/display/DOCS/Getting+Started+with+Selenium+for+Automated+Website+Testing
	// Above link fro next 3 lines
	public static final String USERNAME = "Username";// your account user
	public static final String ACCESS_KEY = "userkey";// your key
	public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/Zeeshan/Documents/chromedriver");

		//https://wiki.saucelabs.com/display/DOCS/Platform+Configurator#/
		//Above link will give auto code to connet to sauce lab 
		//next 7 lines
		
		MutableCapabilities sauceOptions = new MutableCapabilities();

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setExperimentalOption("w3c", true);
		browserOptions.setCapability("platformName", "macOS 10.14");
		browserOptions.setCapability("browserVersion", "77.0");
		browserOptions.setCapability("sauce:options", sauceOptions);
		WebDriver driver = new RemoteWebDriver(new URL(URL), browserOptions);

		driver.get("http://www.Google.com");
		System.out.println(driver.getTitle());

	}

}