package basic;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileNotFoundException;

public class SetUp {

    public static WebDriver driver;

    /*---------------------------------------------------------------------
     * BeforeAll() method executes before all methods
     *---------------------------------------------------------------------*/
    @BeforeAll
    public static void setUpp() throws FileNotFoundException {

        System.out.println("Method name is: " + "Setup method - BeforeAll");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    /*---------------------------------------------------------------------
     * @AfterAll method executes after all methods
     *---------------------------------------------------------------------*/
    @AfterAll
    public static void tearDown()
    {
        //driver.quit();
    }
}
