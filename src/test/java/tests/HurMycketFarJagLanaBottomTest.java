package tests;

import elementsLocators.HurMycketFarJagLanaWebbPage;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import static base.ElementsInteractingMethods.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class HurMycketFarJagLanaBottomTest extends SetUp{


    String elementText, elementAttribute;
    JavascriptExecutor js = (JavascriptExecutor) driver;
    Actions actions = new Actions(driver);

    HurMycketFarJagLanaWebbPage hurMycketLana = new HurMycketFarJagLanaWebbPage(driver);


    @DisplayName("1. WebPage url is right")
    @Order(1)
    @Test
    public void pageUrlIsRight() throws InterruptedException, IOException {

        waitUntilVisibility(driver, hurMycketLana.cookiesButton);
        clickOnButton(driver, hurMycketLana.cookiesButton);

        Thread.sleep(2000);

        String currentURL = driver.getCurrentUrl();
        Assertions.assertTrue(url.equalsIgnoreCase(currentURL));

        System.out.println("URL: "  + url);
        System.out.println("Current URL: "  + currentURL);

        //how to take screenshots

        //File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src, new File("c://Screenshots//test1.png"));

    }

    @DisplayName("2. Våra tjänster")
    @Order(2)
    @Test
    public void varaTjanster() throws InterruptedException, IOException {

        js.executeScript("window.scrollBy(0,1000)");
        Thread.sleep(3000);

        System.out.println("Size of links array: " + hurMycketLana.allBottomLinks.size());

        SoftAssert a = new SoftAssert();

        for ( WebElement bottomLink : hurMycketLana.allBottomLinks)
        {

            System.out.println("Link text: " + getTextFromElement(driver, bottomLink));
            String url = getAttributeOfElement(driver, "href", bottomLink);
            System.out.println("Href: " + url);
            //Thread.sleep(3000);

            //open url connection
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            connection.setRequestMethod("HEAD");
            connection.connect();
            int respCode = connection.getResponseCode();
            System.out.println("Response code: " + respCode  + "\n");

           a.assertTrue(respCode<400,"Link is broken " + "<" +getTextFromElement(driver, bottomLink)  + ">" + "with response code " + respCode);

           a.assertAll();
        }
        
    }


}
