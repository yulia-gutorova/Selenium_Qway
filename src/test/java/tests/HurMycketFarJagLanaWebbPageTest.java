package tests;

import elementsLocators.HurMycketFarJagLanaWebbPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static base.allTestsMethods.getURLFromProperties;
import static base.ElementsInteractingMethods.*;
import static elementsLocators.HurMycketFarJagLanaWebbPage.*;


public class HurMycketFarJagLanaWebbPageTest {

    public static WebDriver driver;

    static String url;

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

    /*---------------------------------------------------------------------
     * AfterAll() method executes before all methods
     *---------------------------------------------------------------------*/
    @AfterAll
    @Disabled
    public static void tearDown() throws IOException {

        //driver.quit();
    }

    //---------------------------- Tests ----------------------------------

    @Nested
    @Order(1)
    @DisplayName("Header elements")
    class headerElements {

        @DisplayName("WebPage url is right")
        @Order(1)
        @Test
        public void test1_testPageUrlIsRight() throws IOException {

            System.out.println("Method name is: " + "Test 1");
            waitUntilVisibility(driver, hurMycketLana.cookiesButton);
            clickOnButton(driver, hurMycketLana.cookiesButton);

            String currentURL = driver.getCurrentUrl();
            Assertions.assertTrue(url.equalsIgnoreCase(currentURL));
        }

        @DisplayName("Logo and header elements are visible")
        @Disabled
        @Order(2)
        @Test
        public void test2_LogoAndHeaderElementsAreVisible() throws IOException {

            Boolean logoICABankenStatus = isElementVisible(driver, hurMycketLana.logoICABanken);

            Boolean searchHeaderButtonStatus = isElementVisible(driver, hurMycketLana.searchHeaderButton);
            Boolean logInButtonStatus = isElementVisible(driver, hurMycketLana.logInButton);

            Assertions.assertTrue(logoICABankenStatus, "Element is not visible");
            Assertions.assertTrue(searchHeaderButtonStatus, "Element is not visible");
            Assertions.assertTrue(logInButtonStatus, "Element is not visible");
        }

        @DisplayName("Header elements are enable")
        @Disabled
        @Order(3)
        @Test
        public void test3_HeaderElementsAreEnabled() throws IOException {

            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.searchHeaderButton));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.logInButton));
        }
    }

    @Nested
    @Order(2)
    @Disabled
    @DisplayName("Top menu elements")
    class topMenuElements {

        @DisplayName("Top menu elements are visible")
        //@Disabled
        @Order(1)
        @Test
        public void test4_mainMenuElementsAreVisible() throws IOException {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.lanaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.kortOchBetalaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.sparaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.forsakraTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.varaTipsTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.bliBankkundTopMenu));
        }

        @DisplayName("Top menu elements are visible")
        //@Disabled
        @Order(2)
        @Test
        public void test5_mainMenuElementsAreEnable() throws IOException {

            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.lanaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.kortOchBetalaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.sparaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.forsakraTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.varaTipsTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.bliBankkundTopMenu));
        }

        @DisplayName("Try to hover over the element. Think how to test this.")
        @Disabled
        @Order(3)
        @Test
        public void test6_hoverOverElements() throws IOException, InterruptedException {

            //Creating object of an Actions class
            Actions action = new Actions(driver);

            //Performing the mouse hover action on the target element.
            action.moveToElement(hurMycketLana.lanaTopMenu).perform();
            Thread.sleep(3000);
        }
    }

    @Nested
    @Order(3)
    @DisplayName("Basic heading elements")
    class basicHeadingElements {

        @DisplayName("Basic heading elements are visible")
        //@Disabled
        @Order(1)
        @Test
        public void basicHeadingElementsAreVisible() throws IOException {
            //test should be here
        }
    }


    @Nested
    @Order(4)
    @DisplayName("BreadCrumb menu elements")
    class breadCrumbMenuElements {

        @DisplayName("BreadCrumb menu elements are visible")
        //@Disabled
        @Order(1)
        @Test
        public void test7_breadCrumbMenuElementsAreVisible() throws IOException {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(0)));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(1)));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(2)));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(3)));
        }

        @DisplayName("BreadCrumb menu elements are visible")
        //@Disabled
        @Order(2)
        @Test
        public void test8_betalningsAnmarkning() throws IOException {
        }
    }




}//end class