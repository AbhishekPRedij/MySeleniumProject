package com.test.validation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generic.listeners.TestListener;
import com.test.base.TestBase;
import com.web.pages.LoginPage;

import io.qameta.allure.Description;

/**
 * Unit test for simple App.
 */
@Listeners({TestListener.class})
@Test(groups={"all"})
public class AppTest extends TestBase
{
	WebDriver driver;
	LoginPage loginPage = new LoginPage();
	public AppTest() {
		System.out.println( "Executing Test Cases from AppTest" );
	}
	
	/**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
/*    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
    	System.out.println( "Hello World!" );
        driver = getWebDriver();
        driver.get("https://demoqa.com/buttons");
        assertTrue( true );
    }
*/    
    
    
	@Test(groups={"test1"}, description = "Verify User is able to login with authorised credentials")
    @Description("Test Description: Login test with corect username and password.")
	
	public void verifyLoginWithAuthCredentials() throws InterruptedException
    {
    	String userName, password;
    	userName= "user1";
    	password= "password";
    	loginPage.loginToApplication(userName, password);
    	loginPage.verifyUserLoginSuccess();
    }
    
    
/*
	@Test(groups={"test1"})
    public void testCase1_1() throws InterruptedException
    {
    	System.out.println( "Executing testCase 1.1" );
    }
    
    // test case 2
    @Test(groups={"test2"})
    public void testCase2() {
    	System.out.println( "Executing testCase 2" );
    }
    
    // test case 2
    //@Test(groups={"test3"}, retryAnalyzer = Retry.class)
    @Test(groups={"test3"})
    public void testCase3() {
    	System.out.println( "Executing testCase 3" );
    	assertTrue( true );
    }
*/    
}
