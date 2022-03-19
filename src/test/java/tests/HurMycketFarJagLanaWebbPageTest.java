package tests;

import elementsLocators.HurMycketFarJagLanaWebbPage;
import org.junit.jupiter.api.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import java.util.concurrent.TimeUnit;

import static base.AllTestsMethods.*;
import static base.ElementsInteractingMethods.*;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class HurMycketFarJagLanaWebbPageTest {

    public static WebDriver driver;

    static String url, view ="";
    String elementText, elementAttribute;

    HurMycketFarJagLanaWebbPage hurMycketLana = new HurMycketFarJagLanaWebbPage(driver);
    //ElementsInteractingMethods interactingMethods = new ElementsInteractingMethods();

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

        url = getURLFromProperties("src\\test\\java\\project.properties", "hur-mycket-far-jag-lana");
        driver.get(url);
    }

    /*---------------------------------------------------------------------
     * AfterAll() method executes before all methods
     *---------------------------------------------------------------------*/
    @AfterAll
    @Disabled
    public static void tearDown()  {

        //driver.quit();
    }
    //---------------------------- Tests ----------------------------------

    @DisplayName("1. WebPage url is right")
    @Order(1)
    @Test
    public void pageUrlIsRight() throws  InterruptedException {

        waitUntilVisibility(driver, hurMycketLana.cookiesButton);
        clickOnButton(driver, hurMycketLana.cookiesButton);

        Thread.sleep(2000);

        String currentURL = driver.getCurrentUrl();
        Assertions.assertTrue(url.equalsIgnoreCase(currentURL));
    }

    //---------------------------------------------------------------------------------------------

        @DisplayName("2. Logo and header elements are visible")
        //@Disabled
        @Order(2)
        @Test
        public void logoAndHeaderElementsAreVisible()  {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.logoICABanken));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.logInButton));

            if (view.equals("webb"))
            {
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.searchHeaderButton));
            }
            else
            {
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.gamburgerMenuButton));
            }
        }

        @DisplayName("3. Header elements are enable")
        //@Disabled
        @Order(3)
        @Test
        public void headerElementsAreEnabled()  {

            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.searchHeaderButton));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.logInButton));
        }

    //---------------------------------------------------------------------------------------------
        @DisplayName("4. Top menu elements are visible")
        //@DisabledIf
        @Order(4)
        @Test
        public void topMenuElementsAreVisible()  {

        if (view == "webb")
        {
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.lanaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.kortOchBetalaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.sparaTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.forsakraTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.varaTipsTopMenu));
            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.bliBankkundTopMenu));
        }
        if (view == "mobile")
        {
            Assertions.assertTrue(isElementInvisible(driver, hurMycketLana.lanaTopMenu));
            Assertions.assertTrue(isElementInvisible(driver, hurMycketLana.kortOchBetalaTopMenu));
            Assertions.assertTrue(isElementInvisible(driver, hurMycketLana.sparaTopMenu));
            Assertions.assertTrue(isElementInvisible(driver, hurMycketLana.forsakraTopMenu));
            Assertions.assertTrue(isElementInvisible(driver, hurMycketLana.varaTipsTopMenu));
            Assertions.assertTrue(isElementInvisible(driver, hurMycketLana.bliBankkundTopMenu));
        }
        }

        @DisplayName("5. Top menu elements are enable")
        //@Disabled
        @Order(5)
        @Test
        public void mainMenuElementsAreEnable()  {

            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.lanaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.kortOchBetalaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.sparaTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.forsakraTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.varaTipsTopMenu));
            Assertions.assertTrue(isElementEnable(driver, hurMycketLana.bliBankkundTopMenu));
        }

        @DisplayName("6. Try to hover over the element. Think how to test this.")
        @Disabled
        @Order(6)
        @Test
        public void hoverOverElements() throws  InterruptedException {

            //Creating object of an Actions class
            Actions action = new Actions(driver);

            //Performing the mouse hover action on the target element.
            action.moveToElement(hurMycketLana.lanaTopMenu).perform();

        }

    //---------------------------------------------------------------------------------------------
        @DisplayName("7. Basic heading elements are visible")
        //@Disabled
        @Order(7)
        @Test
        public void basicHeadingElementsAreVisible()  {
            //test should be here
        }


    //---------------------------------------------------------------------------------------------
        @DisplayName("8. BreadCrumb menu elements are visible")
        //@Disabled
        @Order(8)
        @Test
        public void breadCrumbMenuElementsAreVisible()  {

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            if (view == "webb")
            {
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(0)));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(1)));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(2)));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(3)));
            }

            else
            {
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(2)));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.breadCrumbMenu.get(3)));
            }

        }

        @DisplayName("9. BreadCrumb menu elements are enable")
        @Disabled
        @Order(9)
        @Test
        public void betalningsAnmarkning()  {

            //test should be here
        }

    //---------------------------------------------------------------------------------------------
        @DisplayName("10. Loan amount indication text elements are visible")
        @Disabled
        @Order(10)
        @Test
        public void loanAmountIndicationElemetsAreVisible()  {

            //test should be here
        }

        @DisplayName("11. Månadsinkomst element is visible and has a default value")
        //@Disabled
        @Order(11)
        @Test
        public void manadsInkomstHasDefaultValue()  {
           Assertions.assertTrue(isElementVisible(driver, hurMycketLana.manadsIncomstInput));

           elementAttribute = getAttributeOfElement(driver, "value", hurMycketLana.manadsIncomstInput);
           Assertions.assertTrue(elementAttribute.contains("0 kr/")); //Test data should be separated
        }

        @DisplayName("12. Total skuld element is visible and has a default value")
        //@Disabled
        @Order(12)
        @Test
        public void antalBarnHasDefaultValue()   {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.totalSkuldInput));
            elementAttribute = getAttributeOfElement(driver, "value", hurMycketLana.totalSkuldInput);
            Assertions.assertTrue(elementAttribute.equals("0 kr")); //Test data should be separated
        }

        @DisplayName("13. Antal barn element is visible and has a default value")
        //@Disabled
        @Order(13)
        @Test
        public void totalSkuldHasDefaultValue()  {

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.antalBarnCounter));
            elementText = getTextFromElement(driver, hurMycketLana.antalBarnCounter);
            Assertions.assertTrue(elementText.equals("0 st")); //Test data should be separated
        }

        @DisplayName("14. Inspect Nej button")
        //@Disabled
        @Order(14)
        @Test
        public void nejButtonInspection()  {

            driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.nejButton));
            elementText = getTextFromElement(driver, hurMycketLana.nejButton);
            Assertions.assertTrue(elementText.equals("Nej"));
        }

        @DisplayName("Inspect Ja button")
        //Bugg
        @Disabled
        @Order(14)
        @Test
        public void nejButtonIsChecked() throws InterruptedException {

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

            Assertions.assertTrue(elementText.equals("Har du en betalningsanmärkning så kan vi inte bevilja dig ett lån."));
            Assertions.assertTrue(!isElementEnable(driver, hurMycketLana.beraknaButton));

            }

        @DisplayName("15. Inspect drop down menu")
        //@Disabled
        @Order(15)
        @Test
        public void dropDownMenuInspect() throws InterruptedException {

            driver.navigate().refresh();
            Actions actions = new Actions(driver);
            if (view == "webb")
            {
                //driver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);
                actions.moveToElement(hurMycketLana.dropDownButtonWebb).click().build().perform();

                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.bostadsrattDropDownWebb));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.hyresrattDropDownWebb));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.villaDropDownWebb));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.annanDropDownWebb));

                clickOnButton(driver, hurMycketLana.hyresrattDropDownWebb);

                for (WebElement element : hurMycketLana.bostadkostnadenRadioButtons)
                {
                    actions.moveToElement(element).perform();
                    Assertions.assertTrue(isElementVisible(driver, element));
                    Assertions.assertTrue(isElementEnable(driver, element));
                }
            }

            else
            {
                actions.moveToElement(hurMycketLana.dropDownButtonMobile).click().build().perform();

                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.bostadsrattDropDownMobile));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.hyresrattDropDownMobile));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.villaDropDownMobile));
                Assertions.assertTrue(isElementVisible(driver, hurMycketLana.annanDropDownMobile));

                for (WebElement element : hurMycketLana.bostadkostnadenRadioButtons)
                {
                    actions.moveToElement(element).perform();
                    Assertions.assertTrue(isElementVisible(driver, element));
                    Assertions.assertTrue(isElementEnable(driver, element));
                }
            }

            Thread.sleep(3000);
        }


        @DisplayName("17. Drop down menu error message")
        //@Disabled
        @Order(17)
        @Test
        public void dropDownMenuErrorMessage() throws InterruptedException {

            driver.navigate().refresh();
            Actions actions = new Actions(driver);

            if (view == "webb")
            {
                actions.moveToElement(hurMycketLana.dropDownButtonWebb).click().build().perform();
            }
            if (view == "mobile")
            {
                actions.moveToElement(hurMycketLana.dropDownButtonMobile).click().build().perform();
            }

            clickOnButton(driver, hurMycketLana.plusButton);

            Assertions.assertTrue(isElementVisible(driver, hurMycketLana.hurSerDittBoendeUtErrorMessage));
            Thread.sleep(3000);
        }

        @DisplayName("18. Calculate loan and verify url according to loan")
        //@Disabled
        @Order(18)
        @Test
        public void clickOnBeraknaButtonAndVerifyURL() throws InterruptedException {

            driver.navigate().refresh();
            Actions actions = new Actions(driver);

            isElementVisible(driver, hurMycketLana.manadsIncomstInput);
            sendText(driver, hurMycketLana.manadsIncomstInput, "300000");
            Thread.sleep(1000);

            if (view == "webb")
            {
                actions.moveToElement(hurMycketLana.dropDownButtonWebb).click().build().perform();
                clickOnButton(driver, hurMycketLana.annanDropDownWebb);
            }

            else
            {
                actions.moveToElement(hurMycketLana.dropDownButtonMobile).click().build().perform();
                clickOnButton(driver, hurMycketLana.annanDropDownMobile);
            }
            Thread.sleep(1000);

            clickOnButton(driver, hurMycketLana.bostadkostnadenRadioButtons.get(1));
            Thread.sleep(1000);

            isElementVisible(driver, hurMycketLana.beraknaButton);
            clickOnButton(driver, hurMycketLana.beraknaButton);

            isElementVisible(driver, hurMycketLana.loanAmountText);
            int loanAmount = Integer.parseInt(extractDigits(getTextFromElement(driver, hurMycketLana.loanAmountText)));

            clickOnButton(driver, hurMycketLana.gaVidareTillAnsokanButton);
            Thread.sleep(1000);
            String currentURL = driver.getCurrentUrl();

            String[] tokens = currentURL.split("=");

            int loanAmountURL = Integer.parseInt(tokens[tokens.length-1]);

            Assertions.assertEquals(loanAmount, loanAmountURL);

        }


}//end class