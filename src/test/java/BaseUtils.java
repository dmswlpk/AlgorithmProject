import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public final class BaseUtils {

    private static final String CHROME_OPTIONS = "CHROME_OPTIONS";
    private static final String


        static WebDriver createDriver(){
            WebDriver driver = new ChromeDrive(chromeOptions);
            driver.manage().timeouts().implicitlyWait()
        }
    }

}
