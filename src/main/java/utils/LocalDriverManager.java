package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Locale;

public class LocalDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if(driver == null) {
            driver = configureDriver();
        }
        return driver;
    }

    public static WebDriver configureDriver() {
        String browser = PropertiesReader.getProperties().getProperty("browser").toUpperCase();
        switch (browser) {
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--incognito"); // --headless
                DesiredCapabilities capabilities = new DesiredCapabilities();
                capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
                chromeOptions.merge(chromeOptions);
                return new ChromeDriver(chromeOptions);
            case "OPERA":
                WebDriverManager.operadriver().setup();
                OperaOptions operaOptions = new OperaOptions();
                operaOptions.addArguments("--incognito");
                return new OperaDriver();
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                EdgeOptions edgeOptions = new EdgeOptions();
                edgeOptions.addArguments("--incognito");
                return new EdgeDriver();
            default:
                throw new UnsupportedOperationException(browser + " browser is not supported!");
        }

    }
    public static DesiredCapabilities setUpCapabilities() {
        // example of how manage your code better
        return new DesiredCapabilities();
    }

    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

}
