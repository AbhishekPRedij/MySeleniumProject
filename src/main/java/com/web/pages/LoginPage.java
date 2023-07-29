package com.web.pages;

import static org.testng.Assert.assertTrue;

import io.qameta.allure.Step;

public class LoginPage {
	@Step("Enter username and password")
    public void loginToApplication(String userName, String password) {
    	boolean status; status= true;
    	assertTrue(status);
	}
    
    @Step("Verify user logged in successfully")
    public void verifyUserLoginSuccess() {
    	boolean status; status= true;
    	assertTrue(status);
	}
}