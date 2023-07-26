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
	WebDriver driver;
	/**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
    	System.out.println( "Hello World!" );
        driver = getWebDriver();
        driver.get("https://demoqa.com/buttons");
        assertTrue( true );
    }
}
