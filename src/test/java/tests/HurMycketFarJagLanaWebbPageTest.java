package tests;

import elementsLocators.HurMycketFarJagLanaWebbPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static base.allTestsMethods.getURLFromProperties;
import static base.ElementsInteractingMethods.*;
import static elementsLocators.HurMycketFarJagLanaWebbPage.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class HurMycketFarJagLanaWebbPageTest {

    public static WebDriver driver;

    static String url, view;
    String elementText, elementAttribute;


    HurMycketFarJagLanaWebbPage hurMycketLana = new HurMycketFarJagLanaWebbPage(driver);
    //ElementsInteractingMethods interactingMethods = new ElementsInteractingMethods();

    /*---------------------------------------------------------------------
     * BeforeAll() method executes before all methods
     *---------------------------------------------------------------------*/
    @BeforeAll
    public static void setUpp() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

        view = "webb";
        switch (view)
        {
            case "webb":

                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case "mobile":
                Map<String, String> mobileEmulation = new HashMap<>();
                mobileEmulation.put("deviceName", "Nexus 5");
                System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
                driver = new ChromeDriver(chromeOptions);
                break;
        }

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

    @DisplayName("WebPage url is right")
    @Order(1)
    @Test
    public void testPageUrlIsRight() throws IOException, InterruptedException {

        waitUntilVisibility(driver, hurMycketLana.cookiesButton);
        clickOnButton(driver, hurMycketLana.cookiesButton);

        Thread.sleep(2000);

        String currentURL = driver.getCurrentUrl();
        Assertions.assertTrue(url.equalsIgnoreCase(currentURL));
    }

    //---------------------------------------------------------------------------------------------
    @Nested
    @Order(1)
    //@Disabled
    @DisplayName("Header elements")
    class headerElements {

        @DisplayName("Logo and header elements are visible")
        //@Disabled
        @Order(1)
        @Test
        public void logoAndHeaderElementsAreVisible() throws IOException {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.logoICABanken));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.searchHeaderButton));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.logInButton));
        }

        @DisplayName("Header elements are enable")
        //@Disabled
        @Order(2)
        @Test
        public void headerElementsAreEnabled() throws IOException {

            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.searchHeaderButton));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.logInButton));
        }
    }

    //---------------------------------------------------------------------------------------------
    @Nested
    @Order(2)
    //@Disabled
    @DisplayName("Top menu elements")
    class topMenuElements {

        @DisplayName("Top menu elements are visible")
       // @Disabled
        @Order(1)
        @Test
        public void mainMenuElementsAreVisible() throws IOException {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.lanaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.kortOchBetalaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.sparaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.forsakraTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.varaTipsTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.bliBankkundTopMenu));
        }

        @DisplayName("Top menu elements are enable")
       // @Disabled
        @Order(2)
        @Test
        public void mainMenuElementsAreEnable() throws IOException {

            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.lanaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.kortOchBetalaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.sparaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.forsakraTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.varaTipsTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.bliBankkundTopMenu));
        }

        @DisplayName("Try to hover over the element. Think how to test this.")
        //@Disabled
        @Order(3)
        @Test
        public void hoverOverElements() throws IOException, InterruptedException {

            //Creating object of an Actions class
            Actions action = new Actions(driver);

            //Performing the mouse hover action on the target element.
            action.moveToElement(hurMycketLana.lanaTopMenu).perform();
            Thread.sleep(3000);
        }
    }

    //---------------------------------------------------------------------------------------------
    @Nested
    @Order(3)
    @DisplayName("Basic heading elements")
    class basicHeadingElements {

        @DisplayName("Basic heading elements are visible")
        @Disabled
        @Order(1)
        @Test
        public void basicHeadingElementsAreVisible() throws IOException {
            //test should be here
        }
    }

    //---------------------------------------------------------------------------------------------
    @Nested
    @Order(4)
    //@Disabled
    @DisplayName("BreadCrumb menu elements")
    class breadCrumbMenuElements {

        @DisplayName("BreadCrumb menu elements are visible")
        //@Disabled
        @Order(1)
        @Test
        public void breadCrumbMenuElementsAreVisible() throws IOException {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(0)));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(1)));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(2)));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(3)));
        }

        @DisplayName("BreadCrumb menu elements are enable")
        //@Disabled
        @Order(2)
        @Test
        public void betalningsAnmarkning() throws IOException {

            //test should be here
        }
    }

    //---------------------------------------------------------------------------------------------
    @Nested
    @Order(5)
    @DisplayName("Loan amount indication elements")
    class loanAmountIndicationElements {

        @DisplayName("Loan amount indication text elements are visible")
        //@Disabled
        @Order(1)
        @Test
        public void loanAmountIndicationElemetsAreVisible() throws IOException {

            //test should be here
        }

        @DisplayName("Månadsinkomst element is visible and has a default value")
        //@Disabled
        @Order(2)
        @Test
        public void manadsInkomstHasDefaultValue() throws IOException {

           Assertions.assertTrue(isElementVisible(driver, hurMycketLana.manadsIncomstInput));

           elementAttribute = getAttributeOfElement(driver, "value", hurMycketLana.manadsIncomstInput);
           //System.out.println("Manadsinkomst: " + elementAttribute);
           Assertions.assertTrue(elementAttribute.contains("0 kr/")); //Test data should be separated

        }

        @DisplayName("Total skuld element is visible and has a default value")
       // @Disabled
        @Order(3)
        @Test
        public void antalBarnHasDefaultValue() throws IOException {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.totalSkuldInput));
            elementAttribute = getAttributeOfElement(driver, "value", hurMycketLana.totalSkuldInput);
            System.out.println("Total skuld: " + elementAttribute);
            Assertions.assertTrue(elementAttribute.equals("0 kr")); //Test data should be separated
        }

        @DisplayName("Antal barn element is visible and has a default value")
       // @Disabled
        @Order(4)
        @Test
        public void totalSkuldHasDefaultValue() throws IOException {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.antalBarnCounter));
            elementText = getTextFromElement(driver, hurMycketLana.antalBarnCounter);
            System.out.println("Antal barn: " + elementText);
            Assertions.assertTrue(elementText.equals("0 st")); //Test data should be separated
        }

        @DisplayName("Inspect Nej button")
        //@Disabled
        @Order(5)
        @Test
        public void nejButtonInspection() throws IOException {

            driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.comboButtons.get(1)));
            elementText = getTextFromElement(driver, hurMycketLana.comboButtons.get(1));
            Assertions.assertTrue(elementText.equals("Nej"));


        }

        @DisplayName("Inspect Ja button") //bugg
        @Disabled
        @Order(6)
        @Test
        public void nejButtonIsChecked() throws IOException, InterruptedException {

            driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.comboButtons.get(0)));

            elementText = getTextFromElement(driver, hurMycketLana.comboButtons.get(0));
            Assertions.assertTrue(elementText.equals("Ja"));

            Thread.sleep(3000);
            clickOnButton(driver, hurMycketLana.comboButtons.get(0));
            clickOnButton(driver, hurMycketLana.comboButtons.get(0));
            Thread.sleep(3000);

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.jaButtonErrorMessage));
            elementText = getTextFromElement(driver, hurMycketLana.jaButtonErrorMessage);
            System.out.println("Felmeddelande: "+ elementText);
            Assertions.assertTrue(elementText.equals("Har du en betalningsanmärkning så kan vi inte bevilja dig ett lån."));

            Assertions.assertTrue(!isElementEnable(driver, hurMycketLana.beraknaButton));

        }
    }

}//end class