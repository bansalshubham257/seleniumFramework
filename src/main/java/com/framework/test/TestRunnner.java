package com.framework.test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.pageAction.LoginPage;

public class TestRunnner extends TestBase{
	
	
	@BeforeTest
	public void createDriver() {
		TestBase testbase = new TestBase();
		//driver = testbase.getDriver();
	}
	
	@Test
	public void functionalTest() {
		String title1 = driver.getCurrentUrl();
		LoginPage loginPage = new LoginPage();
		loginPage.setUsername("");
		loginPage.setPassword("");
		loginPage.clickLogin();
		try {
			driver.wait(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String title2 = driver.getCurrentUrl();
		
	}

}
