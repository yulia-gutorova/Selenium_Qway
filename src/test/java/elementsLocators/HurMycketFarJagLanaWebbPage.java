package elementsLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tests.OpenWebPageTest;

import java.util.List;

public class HurMycketFarJagLanaWebbPage {

    WebDriver driver;

    public HurMycketFarJagLanaWebbPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath=("//button[text()='Godkänn alla cookies']"))
    public  WebElement cookiesButton;

    // ------------- Logo and header --------------------------

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement logoICABanken;

    @FindBy(id = "searchHeaderButton")
    public WebElement searchHeaderButton;

    @FindBy(xpath = "//button[text()='Logga in']")
    public WebElement logInButton;


    // ------------- Top menu  --------------------------

    @FindBy(xpath = "//a[@href='/lana/'][contains(@class,'top-menu')]")
    public WebElement lanaButton;

    @FindBy(xpath = "//a[@href='/kort-och-betala/'][contains(@class,'top-menu')]")
    public WebElement kortOchBetalaButton;

    @FindBy(xpath = "//a[@href='/spara/'][contains(@class,'top-menu')]")
    public WebElement sparaButton;

    @FindBy(xpath = "//a[@href='/forsakra/'][contains(@class,'top-menu')]")
    public WebElement forsakraButton;

    @FindBy(xpath = "//a[@href='/vara-tips/'][contains(@class,'top-menu')]")
    public WebElement varaTipsButton;

    @FindBy(xpath = "//a[@href='/kundservice/'][contains(@class,'top-menu')]")
    public WebElement kundserviceButton;

    @FindBy(xpath = "//a[@href='/bli-kund/'][contains(@class,'top-menu')]")
    public WebElement bliBankkundButton;


    // ------------- BreadCrumb menu  --------------------------

    @FindBy(xpath = "//a[text()='Hem']")
    public WebElement hemButton;

    @FindBy(xpath = "//a[@href='/lana/']")
    public List<WebElement> lanaButtons;

    @FindBy(xpath = "//a[@href='/lana/privatlan/']")
    public List<WebElement> privatlanButtons;

    @FindBy(xpath = "//a[@href='/lana/privatlan/hur-mycket-far-jag-lana/']")
    public List<WebElement> hurMycketFarJagLanaButton;


}
