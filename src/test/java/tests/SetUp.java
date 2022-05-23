package tests;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static base.AllTestsMethods.getURLFromProperties;

public class SetUp {

    public static WebDriver driver;
    public static String url, systemView,view = "";


    @BeforeAll
    public static void setUpp() throws IOException {

        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver.exe");

//      mvn test -Dviewmode="webb"
//      mvn test -Dviewmode="mobile"

        //systemView = System.getProperty("viewmode");
       // System.out.println("SystemView is: " + systemView);
       // view = systemView;
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


    @AfterAll
    @Disabled
    public static void tearDown()  {

        driver.quit();
    }

}
