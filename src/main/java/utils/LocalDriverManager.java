package utils;
import exceptions.UnsupportedDriverException;
import exceptions.UnsupportedEnvironmentException;
import io.github.bonigarcia.wdm.WebDriverManager;
import lombok.SneakyThrows;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.opera.OperaOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URI;

public class LocalDriverManager {

    private static WebDriver driver;

    public static WebDriver getInstance() {
        if(driver == null) {
            driver = configureDriver();
        }
        return driver;
    }

    public static WebDriver localDriver() {
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
                throw new UnsupportedDriverException(browser + " browser is not supported!");
        }

    }
    public static DesiredCapabilities setUpCapabilities() {
        // example of how manage your code better
        return new DesiredCapabilities();
    }

    @SneakyThrows
    public static RemoteWebDriver remoteWebDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);

        return new RemoteWebDriver(
                URI.create("http://46.101.236.198:4444/wd/hub").toURL(),
                capabilities
        );
    }


    public static WebDriver configureDriver () {
        String environment = PropertiesReader.readProperties().getProperty("environment");

        switch (environment) {
            case "local":
                return localDriver();
            case "remote":
                return remoteWebDriver();
            default: throw new UnsupportedEnvironmentException(String.format("'%s' environment is not supported", environment));
        }
    }



    public static void closeDriver() {
        driver.quit();
        driver = null;
    }

}
