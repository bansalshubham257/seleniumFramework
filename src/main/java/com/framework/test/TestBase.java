package com.framework.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


import com.framework.configure.Configuration;

public class TestBase {

	public static WebDriver driver;
 
	public TestBase() {
		
		String browser = Configuration.getProperties("browser").toLowerCase();
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Files//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Files//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equals("internet explorer") || browser.equals("ie")) {
			driver = new InternetExplorerDriver();
		}
		
		driver.get(Configuration.getProperties("url"));
	}

	public static WebElement getElement(String username) {
		
		WebElement element = null;

		String locatorName = username.split(":")[0].toLowerCase();
		String locatorValue = username.split(":")[1];

		
		if(locatorName.equals("id")) {
			element = driver.findElement(By.id(locatorValue));
		}
		else if(locatorName.equals("name")) {
			element = driver.findElement(By.name(locatorValue));
		}
		else if(locatorName.equals("classname")) {
			element = driver.findElement(By.className(locatorValue));
		}
		else if(locatorName.equals("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		}
		else if(locatorName.equals("linktext")) {
			element = driver.findElement(By.linkText(locatorValue));
		}
		else if(locatorName.equals("partiallinktext")) {
			element = driver.findElement(By.partialLinkText(locatorValue));
		}
		
		return element;
	}
	
	
}
