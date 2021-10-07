import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
      driver =  new ChromeDriver();

    }


    @Test
    public void driverTest() {
        driver.get("https://shop.acodemy.lv");

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
