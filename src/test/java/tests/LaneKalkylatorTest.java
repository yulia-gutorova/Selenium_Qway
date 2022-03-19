package tests;

import static base.AllTestsMethods.*;
import  elementsLocators.HurMycketFarJagLanaWebbPage;
import  elementsLocators.LaneKalkylatorWebbPage;

import org.junit.jupiter.api.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static base.AllTestsMethods.*;
import static base.ElementsInteractingMethods.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class LaneKalkylatorTest {

    public static WebDriver driver;
    Actions action = new Actions(driver);

    static String url, view ="";
    String elementText, elementAttribute;


    HurMycketFarJagLanaWebbPage hurMycketLana = new HurMycketFarJagLanaWebbPage(driver);
    LaneKalkylatorWebbPage lanaKalkylator = new LaneKalkylatorWebbPage(driver);

    /*---------------------------------------------------------------------
     * BeforeAll() method executes before all methods
     *---------------------------------------------------------------------*/
    @BeforeAll
    public static void setUpp() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

//      mvn test -Dviewmode="webb"
//      mvn test -Dviewmode="mobile"

        //view = System.getProperty("viewmode");

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

        url = getURLFromProperties("src\\test\\java\\project.properties", "lane-kalkylator");
        driver.get(url);

    }

    @DisplayName("WebPage url is right")
    @Order(1)
    @Test
    public void testPageUrlIsRight() throws  InterruptedException {

        waitUntilVisibility(driver, hurMycketLana.cookiesButton);
        clickOnButton(driver, hurMycketLana.cookiesButton);
        String currentURL = driver.getCurrentUrl();
        Assertions.assertTrue(url.equalsIgnoreCase(currentURL));
    }


    @DisplayName("WebPage url is right")
    @Order(1)
    @Test
    public void testgoslider() throws  InterruptedException {

        // Verify URL with given loan amount and years

        int givenLoanAmount  = Integer.parseInt(getAttributeOfElement(driver, "value", lanaKalkylator.sliders.get(0)));
        int givenLoanYears  = Integer.parseInt(getAttributeOfElement(driver, "value", lanaKalkylator.sliders.get(1)));

        clickOnButton(driver, lanaKalkylator.tillAnsokanButton);
        String currentURL = driver.getCurrentUrl();

        String[] tokens = currentURL.split("=");
        int loanAmountURL = Integer.parseInt(extractDigits(tokens[1]));
        int loanYearsURL = Integer.parseInt(tokens[2]);

        Assertions.assertEquals(givenLoanAmount, loanAmountURL);
        Assertions.assertEquals(givenLoanYears, loanYearsURL);

        driver.navigate().back();

        // Change loan amount and years and verify URL with new values

        lanaKalkylator.sliders.get(0).sendKeys(Keys.ARROW_RIGHT);;
        action.clickAndHold(lanaKalkylator.sliders.get(1));
        lanaKalkylator.sliders.get(1).sendKeys(Keys.ARROW_RIGHT);

        givenLoanAmount  = Integer.parseInt(getAttributeOfElement(driver, "value", lanaKalkylator.sliders.get(0)));
        givenLoanYears  = Integer.parseInt(getAttributeOfElement(driver, "value", lanaKalkylator.sliders.get(1)));

        clickOnButton(driver, lanaKalkylator.tillAnsokanButton);
        currentURL = driver.getCurrentUrl();

        tokens = currentURL.split("=");
        loanAmountURL = Integer.parseInt(extractDigits(tokens[1]));
        loanYearsURL = Integer.parseInt(tokens[2]);

        Assertions.assertEquals(givenLoanAmount, loanAmountURL);
        Assertions.assertEquals(givenLoanYears, loanYearsURL);

        Thread.sleep(3000);
    }



}
