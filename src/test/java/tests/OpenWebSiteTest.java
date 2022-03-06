package tests;

import elementsLocators.HurMycketFarJagLanaWebbPage;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static base.ElementsInteractingMethods.*;
import static base.allTestsMethods.getURLFromProperties;
//import static elementsLocators.HurMycketFarJagLanaWebbPage.cookiesButton;


@TestMethodOrder(MethodOrderer.MethodName.class)

public class OpenWebSiteTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static String url;
    HurMycketFarJagLanaWebbPage hurMycketLana = new HurMycketFarJagLanaWebbPage(driver);

    /*---------------------------------------------------------------------
     * BeforeAll() method executes before all methods
     *---------------------------------------------------------------------*/
    @BeforeAll
    public static void setUpp() throws IOException {

        System.out.println("Method name is: " + "Setup method - BeforeAll");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        url = getURLFromProperties("src\\test\\java\\pageURL.properties", "hur-mycket-far-jag-lana");
        driver.get(url);

    }

    @DisplayName("Open a page")
    @Test
    public void test1_openPage() throws IOException {

/*        System.out.println("Method name is: " + "Test to open a webpage");
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
        String url = getURLFromProperties("src\\test\\java\\pageURL.properties", "hur-mycket-far-jag-lana");

        driver = new ChromeDriver();*/

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //WebElement cookiesButton = driver.findElement(By.xpath("//button[text()='Godkänn alla cookies']"));
        //wait.until(ExpectedConditions.visibilityOf(cookiesButton));


        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        waitUntilVisibility(driver, hurMycketLana.cookiesButton);
        Assertions.assertTrue(hurMycketLana.cookiesButton.isDisplayed());


        String currentURL = driver.getCurrentUrl();
        Assertions.assertTrue(url.equalsIgnoreCase(currentURL));

    }

    @DisplayName("Second method")
    @Test
    public void test2() throws IOException {

        System.out.println("Method name is: " + "Second method");

    }

}
