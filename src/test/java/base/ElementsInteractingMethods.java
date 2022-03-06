package base;

import basic.SetUp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

//import static tests.OpenWebSiteTest.driver;

public class ElementsInteractingMethods extends SetUp {

   //public static WebDriver driver;

    /*---------------------------------------------------------------------
     * Method waitUntilVisibility() to wait the visibility of the element
     *---------------------------------------------------------------------*/
    public static void waitUntilVisibility(WebDriver driver, WebElement element)
    {
        //driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /*---------------------------------------------------------------------
     * Method isVisible() to verify that element is displayed
     *---------------------------------------------------------------------*/
    public static boolean isElementVisible(WebDriver driver, WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        waitUntilVisibility(driver, element);
        return element.isDisplayed();
    }

    /*---------------------------------------------------------------------
     * Method isVisible() to verify that element is enabled
     *---------------------------------------------------------------------*/
    public static boolean isElementEnable(WebDriver driver, WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        return element.isEnabled();
    }

    /*---------------------------------------------------------------------
     * Method isVisible() to verify that element is selected
     *---------------------------------------------------------------------*/
    public static boolean isElementSelected(WebDriver driver, WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        return element.isSelected();
    }

    /*---------------------------------------------------------------------
     * Method clickOnButton() to click on element
     *---------------------------------------------------------------------*/
    public static void clickOnButton(WebDriver driver, WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        element.click();
    }

    /*---------------------------------------------------------------------
     * Method sendKeys() to get text from the element
     *---------------------------------------------------------------------*/
    public static String getTextFromElement(WebDriver driver, WebElement element) {

            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            String text = element.getText();
            return text;
    }




}//end class
