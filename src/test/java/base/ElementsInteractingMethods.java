package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Driver;

//import static tests.OpenWebSiteTest.driver;

public class ElementsInteractingMethods  {

   //public static WebDriver driver;

    /*---------------------------------------------------------------------
     * Method waitUntilVisibility() to wait the visibility of the element
     *---------------------------------------------------------------------*/
    public static void waitUntilVisibility(WebDriver driver, WebElement element)
    {

        Actions actions = new Actions(driver);
        actions.moveToElement(element);

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    /*---------------------------------------------------------------------
     * Method isElementVisible() to verify that element is displayed
     *---------------------------------------------------------------------*/
    public static boolean isElementVisible(WebDriver driver, WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        waitUntilVisibility(driver, element);
        return element.isDisplayed();
    }

    /*---------------------------------------------------------------------
     * Method isElementEnable() to verify that element is enabled
     *---------------------------------------------------------------------*/
    public static boolean isElementEnable(WebDriver driver, WebElement element)
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        return element.isEnabled();
    }

    /*---------------------------------------------------------------------
     * Method isElementSelected() to verify that element is selected
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
     * Method getTextFromElement() to get text from the element
     *---------------------------------------------------------------------*/
    public static String getTextFromElement(WebDriver driver, WebElement element) {

            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            String text = element.getText();
            return text;
    }

    /*---------------------------------------------------------------------
     * Method getAttributeOfElement() to get attribute of the element
     *---------------------------------------------------------------------*/
    public static String getAttributeOfElement(WebDriver driver, String attribute, WebElement element) {

        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        String attributeValue = element.getAttribute(attribute);
        return attributeValue;
    }


}//end class
