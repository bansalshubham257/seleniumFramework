package com.framework.test;

import com.framework.configure.Configuration;
import com.framework.pageAction.LoginPage;

public class Checkfunction {
	
	
	public static void main(String[] args) {
		
		Configuration configuration = new Configuration();
		System.out.println(configuration.getProperties("browser"));
		
		TestBase test = new TestBase();
		//String tile1 = 
		LoginPage loginPage = new LoginPage();
		loginPage.setUsername("bansalshubham257@gmail.com");
		loginPage.setPassword("facebook123@");
		loginPage.clickLogin();
	}
}
