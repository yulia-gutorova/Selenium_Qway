package elementsLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LaneKalkylatorWebbPage {

    WebDriver driver;

    public LaneKalkylatorWebbPage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@type = 'range']")
    public List<WebElement> sliders;

    @FindBy(xpath = "//span[@class = 'slider_currentValue__2LGCk slider_labelText__1MX09']")
    public List<WebElement> sliderValues;

    @FindBy(xpath = "//a[contains(text(), 'Till ans')]")
    public WebElement tillAnsokanButton;



}
