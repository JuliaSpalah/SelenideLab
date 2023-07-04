import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private final static String BASE_URL = "https://demo.opencart.com/";

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        WebDriverManager.chromiumdriver().setup();
        Configuration.browser="chrome";
        Configuration.driverManagerEnabled = true;
        Configuration.headless = false;
        Configuration.browserSize = "1980x1080";
        Selenide.open(BASE_URL);
    }

    @AfterMethod(alwaysRun = true)
public void quite(){
        Selenide.closeWebDriver();
    }

}
