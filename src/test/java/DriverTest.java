import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.PropertiesReader;

import java.lang.reflect.Array;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static utils.PropertiesReader.*;

public class DriverTest {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
      driver =  new ChromeDriver();
      driver.get(getProperties().getProperty("home.page"));

    }



    @Test
    public void checkIfTitleIsCorrect() {

        assertThat(driver.getTitle(), equalTo("Online shop – acodemy – Just another WordPress site"));


    }

//    @Test
//    public void driverTest() {
//        driver.get("https://shop.acodemy.lv");
//
//    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
