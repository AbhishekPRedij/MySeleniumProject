package MySampleProject.SeleniumProject;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.test.base.TestBase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestBase
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
    	System.out.println( "Hello World!" );
    	System.out.println( "environment => " + System.getProperty("environment"));
    	System.out.println( "browser => " + System.getProperty("browser"));
    	WebDriver driver;
        driver = getWebDriver();
        driver.get("https://demoqa.com/buttons");
        assertTrue( true );
    }
 /*   
    @Test
    public void shouldAnswerWithTrue1() throws InterruptedException
    {
    	System.out.println( "Hello World! 2" );
    	WebDriver driver;
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        assertTrue( true );
        driver.close();
    }
  */  
}
