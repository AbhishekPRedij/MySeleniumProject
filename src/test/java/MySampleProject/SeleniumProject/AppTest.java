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
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	System.out.println( "Hello World!" );
        //System.out.println(System.getProperty("user.dir"));
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
        
        //ChromeDriverService service = new ChromeDriverService.Builder().build();
        //service.setExecutable(System.getProperty("user.dir") + "/src/main/resources/drivers/chromedriver.exe");
        
        //driver = new ChromeDriver(service);
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/buttons");
        //driver.wait(5000);
        //driver.close();
    	assertTrue( true );
    }
}
