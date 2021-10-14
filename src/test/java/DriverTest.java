import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_object.MainPage;
import utils.PropertiesReader;

import java.lang.reflect.Array;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static utils.PropertiesReader.*;

public class DriverTest {

    WebDriver driver;

    MainPage mainPage;

    @BeforeEach
    public void setUp() {
      System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
      driver =  new ChromeDriver();
      mainPage = new MainPage(driver);
      driver.get(getProperties().getProperty("home.page"));
    }

    @Test
    public void checkIfTitleIsCorrect() {
        assertThat(driver.getTitle(), equalTo("Online shop – acodemy – Just another WordPress site"));
    }

//    @Test
//    public void driverTest() {
//        driver.get("https://shop.acodemy.lv");
//    }

    @Test
    public void productsTest() {

        mainPage.getAllProducts();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}


    //class
    //id

    //css
    //xpath
