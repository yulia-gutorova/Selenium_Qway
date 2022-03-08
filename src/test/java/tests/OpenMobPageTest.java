package tests;

import elementsLocators.HurMycketFarJagLanaWebbPage;

import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static base.ElementsInteractingMethods.*;
import static base.allTestsMethods.getURLFromProperties;
//import static elementsLocators.HurMycketFarJagLanaWebbPage.cookiesButton;


@TestMethodOrder(MethodOrderer.MethodName.class)

public class OpenMobPageTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static String url;
    HurMycketFarJagLanaWebbPage hurMycketLana = new HurMycketFarJagLanaWebbPage(driver);
    String view;

    /*---------------------------------------------------------------------
     * BeforeAll() method executes before all methods
     *---------------------------------------------------------------------*/
    @BeforeAll
    public static void setUpp() throws IOException {

        Map<String, String> mobileEmulation = new HashMap<>();

        mobileEmulation.put("deviceName", "Nexus 5");

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

        ChromeOptions chromeOptions = new ChromeOptions();

        chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        driver = new ChromeDriver(chromeOptions);



        url = getURLFromProperties("src\\test\\java\\pageURL.properties", "hur-mycket-far-jag-lana");
        driver.get(url);


    }

    @DisplayName("Open a page")
    @Test
    public void test1_openPage() throws IOException, InterruptedException {

        waitUntilVisibility(driver, hurMycketLana.cookiesButton);
        clickOnButton(driver, hurMycketLana.cookiesButton);
        Thread.sleep(2000);

        String currentURL = driver.getCurrentUrl();
        Assertions.assertTrue(url.equalsIgnoreCase(currentURL));


    }

    @DisplayName("Second method")
    @Test
    public void test2() throws IOException {

        System.out.println("Test 2");

    }

}
