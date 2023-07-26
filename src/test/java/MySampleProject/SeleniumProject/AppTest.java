package MySampleProject.SeleniumProject;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     * @throws InterruptedException 
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException
    {
    	System.out.println( "Hello World!" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        assertTrue( true );
        driver.close();
    }
}
