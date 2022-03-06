package elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.OpenWebPageTest;

public class HurMycketFarJagLanaWebbPage {

    WebDriver driver;

    public HurMycketFarJagLanaWebbPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath=("//button[text()='Godkänn alla cookies']"))
    public  WebElement cookiesButton;
}
