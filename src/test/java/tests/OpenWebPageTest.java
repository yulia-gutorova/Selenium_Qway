package tests;


import elementsLocators.HurMycketFarJagLanaWebbPage;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

import static base.allTestsMethods.getURLFromProperties;
import static base.ElementsInteractingMethods.*;
import static elementsLocators.HurMycketFarJagLanaWebbPage.*;


@TestMethodOrder(MethodOrderer.MethodName.class)

public class OpenWebPageTest {

    public static WebDriver driver;
    public static WebDriverWait wait;
    static String url;
    Boolean statusOfElement;
    HurMycketFarJagLanaWebbPage hurMycketLana = new HurMycketFarJagLanaWebbPage(driver);
    //ElementsInteractingMethods interactingMethods = new ElementsInteractingMethods();

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

    @DisplayName("WebPage url is right")
    @Test
    public void test1_testPageUrlIsRight() throws IOException {

        //WebDriverWait wait = new WebDriverWait(driver, 10);
        //wait.until(ExpectedConditions.visibilityOf(cookiesButton));

       waitUntilVisibility(driver, hurMycketLana.cookiesButton);
       statusOfElement = isElementVisible(hurMycketLana.cookiesButton);
       clickOnButton(driver, hurMycketLana.cookiesButton);

        String currentURL = driver.getCurrentUrl();
        Assertions.assertTrue(url.equalsIgnoreCase(currentURL));

    }

    @DisplayName("Second method")
    @Test
    public void test2() throws IOException {

        System.out.println("Method name is: " + "Second method");

    }

}