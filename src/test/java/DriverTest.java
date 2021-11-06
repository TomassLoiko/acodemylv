import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import page_object.MainPage;
import utils.LocalDriverManager;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static utils.PropertiesReader.*;

public class DriverTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private final MainPage mainPage = new MainPage();


    @BeforeEach
    public void setUp() {
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
        LocalDriverManager.closeDriver();
    }

}


    //class
    //id

    //css
    //xpath
