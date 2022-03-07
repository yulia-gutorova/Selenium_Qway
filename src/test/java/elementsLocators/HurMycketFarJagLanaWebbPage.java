package elementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
    public WebElement lanaTopMenu;

    @FindBy(xpath = "//a[@href='/kort-och-betala/'][contains(@class,'top-menu')]")
    public WebElement kortOchBetalaTopMenu;

    @FindBy(xpath = "//a[@href='/spara/'][contains(@class,'top-menu')]")
    public WebElement sparaTopMenu;

    @FindBy(xpath = "//a[@href='/forsakra/'][contains(@class,'top-menu')]")
    public WebElement forsakraTopMenu;

    @FindBy(xpath = "//a[@href='/vara-tips/'][contains(@class,'top-menu')]")
    public WebElement varaTipsTopMenu;

    @FindBy(xpath = "//a[@href='/kundservice/'][contains(@class,'top-menu')]")
    public WebElement kundserviceTopMenu;

    @FindBy(xpath = "//a[@href='/bli-kund/'][contains(@class,'top-menu')]")
    public WebElement bliBankkundTopMenu;


    // ------------- BreadCrumb menu  --------------------------

    @FindBy(xpath = "//li[contains(@class, 'breadcrumbs_breadcrumbsItem__2YqJ9')]")
    public List<WebElement> breadCrumbMenu;


    // ------------- Loan amount indication  --------------------------

    @FindBy(xpath = "//span[text() = 'Har du betalningsanmärkning?']")
    public List<WebElement> betalningsMarkningText;

    @FindBy(xpath = "//span[text() = 'Hur många är ni som söker?']")
    public List<WebElement> hurMangaNiText;

    @FindBy(xpath = "//span[text() = 'Månadsinkomst']")
    public List<WebElement> manadsInkomnstText;

    @FindBy(xpath = "//span[text() = 'Antal barn i hushållet.']")
    public List<WebElement> antalBarnText;

    @FindBy(xpath = "//span[text() = 'Andra privatlån och krediter (total skuld)']")
    public List<WebElement> totalSkuldText;

    @FindBy(xpath = "//span[@class='counter_item__1Pd4V']")
    public WebElement antalBarnCounter;

    @FindBy(xpath = "//span[text() = 'Hur ser ditt boende ut?']")
    public List<WebElement> hurSerDittBoendeUtText;

    @FindBy(xpath = "//div[@class = 'error-pane_errorMessage__3BEc2 ']")
    public WebElement jaButtonErrorMessage;


    @FindBy(xpath = "//div[@class = 'combo-button_buttonContent__pIl-t']")
    public List<WebElement> comboButtons;

    @FindBy(xpath = "//button[text() = 'Beräkna']")
    public WebElement beraknaButton;

    @FindBy(xpath = "//button[@class = 'counter_btnDec__1Q_Yr']")
    public List<WebElement> minusCounterButton;

    @FindBy(xpath = "//button[@class='counter_btnInc__2QJe0']")
    public List<WebElement> plusCounterButton;

    @FindBy(xpath = "//*[@class='Check form-text-field_icon__3olOJ form-text-field_ok__22Jsj icon_defaultColor__3kj2w']")
    public List<WebElement> checkFormButtons;

    @FindBy(xpath = "//*[@class='//*[@class='SortingDown dropdown_control__3rMYT svg_icon_color_e3000b']']")
    public WebElement dropDownButton;


    @FindBy(xpath = "//input[@name='monthlyIncome']")
    public WebElement manadsIncomstInput;

    @FindBy(xpath = "//input[@name='existingLoanCredit']")
    public WebElement totalSkuldInput;


}
