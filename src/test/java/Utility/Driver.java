package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public WebDriver driver;
	
	public Driver(WebDriver driver) {
		System.setProperty("webdriver.chrome.driver", "F:/Java-Workspace/art/chromedriver.chromedriver.exe");
		driver = new ChromeDriver();
	}

}
