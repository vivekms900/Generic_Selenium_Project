
package com.selenium.sample;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser {

	public static WebDriver driver = null;
	
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "\\Java-Workspace\\art\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		
		if(title.equalsIgnoreCase("Amazon.in")) {
			System.out.println("Title Matches");
		}
	
		
	}
}
