import com.sun.tools.javac.Main;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.MainPage;

import static utils.PropertiesReader.getProperties;

@Slf4j


public class CouponCodeTest {

    private WebDriver driver;
    private MainPage mainPage;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver =  new ChromeDriver();
        mainPage = new MainPage(driver);
        driver.get(getProperties().getProperty("home.page"));
    }


    @Test
    public void applyCouponTest() {

        mainPage.selectProductFromListByName("Polo");
        System.out.println("");


    }

    @AfterEach
    public void tearDown() {
        driver.quit();

    }


}
