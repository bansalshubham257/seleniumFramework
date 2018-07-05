package com.framework.pageAction;


import com.framework.test.TestBase;

public class LoginPage {
	
	public void setUsername(String username) {
	
		TestBase.getElement(new com.framework.pageElement.LoginPage().username).sendKeys(username);;
	}
	
	public void setPassword(String password) {
		TestBase.getElement(new com.framework.pageElement.LoginPage().password).sendKeys(password);
	}
	
	public void clickLogin() {
		TestBase.getElement(new com.framework.pageElement.LoginPage().loginButton).click();
	}

}
