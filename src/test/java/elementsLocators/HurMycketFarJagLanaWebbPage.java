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

    @FindBy(xpath=("//button[contains(text(), 'cookies')]"))
    public  WebElement cookiesButton;

    // ------------- Logo and header --------------------------

    @FindBy(xpath = "//img[@alt='Logo']")
    public WebElement logoICABanken;

    @FindBy(id = "searchHeaderButton")
    public WebElement searchHeaderButton;

    @FindBy(xpath = "//button[text()='Logga in']")
    public WebElement logInButton;

    @FindBy(xpath = "//a[@class = 'header_action__2xCD3 header_actionHamburger__2PXSx header_borderLeft__22RVi']")
    public WebElement gamburgerMenuButton;



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

    @FindBy(xpath = "//span[text()= 'Boendekostnad']")
    public WebElement boendekostnadText;

    @FindBy(xpath = "//span[@class = 'loan-amount-indication_approximationAmountLabel__3wc9Q input-title_title__3fPFC']")
    public WebElement loanAmountText;


    @FindBy(xpath = "//span[text() = 'Hur ser ditt boende ut?']")
    public List<WebElement> hurSerDittBoendeUtText;

    @FindBy(xpath = "//input[@name = 'existingLoanCredit']")
    public WebElement totalSkuld;

//existingLoanCredit
    @FindBy(xpath = "//span[@class='counter_item__1Pd4V']")
    public WebElement antalBarnCounter;


    @FindBy(xpath = "//div[@class = 'error-pane_errorMessage__3BEc2 ']")
    public WebElement jaButtonErrorMessage;

    @FindBy(xpath = "//div[@class='error-pane_errorMessage__3BEc2 ']")
    public WebElement hurSerDittBoendeUtErrorMessage;


    @FindBy(xpath = "//span[@class = 'combo-button_buttonContent__pIl-t']")
    public List<WebElement> comboButtons;

    @FindBy(xpath = "//button[contains(text(), 'Ber')]")
    public WebElement beraknaButton;

    @FindBy(xpath = "//button[@class = 'counter_btnDec__1Q_Yr']")
    public List<WebElement> minusCounterButton;

    @FindBy(xpath = "//button[@class='counter_btnInc__2QJe0']")
    public List<WebElement> plusCounterButton;

    @FindBy(xpath = "//*[@class='Check form-text-field_icon__3olOJ form-text-field_ok__22Jsj icon_defaultColor__3kj2w']")
    public List<WebElement> checkFormButtons;



    @FindBy(xpath = "//div[@class = 'dropdown_dropDownOuter__ulHdZ   ']")
    //@FindBy(xpath = "div[contains(@class, 'dropdown_list')]")
    //input[@type='checkbox']
    //dropdown_dropDownOuter__ulHdZ
    //dropdown_list__9QvF- undefined
    //header_headerContent__3yBtsI
    public WebElement dropDownButtonWebb;

    @FindBy(xpath = "//select[@name = 'typeOfHousing']")
    //header_headerContent__3yBtsI
    public WebElement dropDownButtonMobile;
    //select[@name = 'typeOfHousing']



    @FindBy(xpath = "//a[contains(text(), 'vidare till')]")
    public WebElement gaVidareTillAnsokanButton;

    @FindBy(xpath = "//button[@class = 'counter_btnInc__2QJe0']")
    public WebElement plusButton;

    @FindBy(xpath = "//span[text() = 'Nej']")
    public WebElement nejButton;

    @FindBy(xpath = "//input[@name='monthlyIncome']")
    public WebElement manadsIncomstInput;

    @FindBy(xpath = "//input[@name='existingLoanCredit']")
    public WebElement totalSkuldInput;


//-------------------- Dropdown menu -----------------------
    @FindBy(xpath = "//li[contains(text(), 'Bostadsr')]")
    public WebElement bostadsrattDropDownWebb;

    @FindBy(xpath = "//li[contains(text(), 'Hyresr')]")
    public WebElement hyresrattDropDownWebb;

    @FindBy(xpath = "//li[text() = 'Villa']")
    public WebElement villaDropDownWebb;

    @FindBy(xpath = "//li[text() = 'Annan']")
    public WebElement annanDropDownWebb;


    @FindBy(xpath = "//option[contains(text(), 'Bostadsr')]")
    public WebElement bostadsrattDropDownMobile;

    @FindBy(xpath = "//option[contains(text(), 'Hyresr')]")
    public WebElement hyresrattDropDownMobile;

    @FindBy(xpath = "//option[text() = 'Villa']")
    public WebElement villaDropDownMobile;

    @FindBy(xpath = "//option[text() = 'Annan']")
    public WebElement annanDropDownMobile;

// --------------------- Bostadskostnaden radio buttons---------------

    @FindBy(xpath = "//div[@class = 'radio-buttons-option_text__2maXO']")
    public List<WebElement> bostadkostnadenRadioButtons;

// --------------------- Boton links ---------------

    @FindBy(xpath = "//a[@href='/lana/'][@target='_top']")
    public WebElement lanaPengar;

    //@FindBy(xpath = "//a[@href='/lana/']")
    //public WebElement lanaPengar;

    @FindBy(xpath = "//ul[@class= 'footer-section_links__Jqt-L links']/li/a")
    public List<WebElement> allBottomLinks;
}
