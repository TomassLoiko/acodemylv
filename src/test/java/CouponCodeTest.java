import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import page_object.MainPage;
import utils.LocalDriverManager;

import static utils.PropertiesReader.getProperties;

@Slf4j
public class CouponCodeTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private final MainPage mainPage = new MainPage();

    @BeforeEach
    public void setUp() {
        driver.get(getProperties().getProperty("home.page"));
    }

    @ParameterizedTest(name = "Buy product with name {0} and apply coupon {1}")
    @CsvSource({"Belt,acodemy10off", "Album,acodemy20off"})
    public void applyCouponTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .applyCouponCode(couponCode);
    }

    @ParameterizedTest(name = "Can't buy product with name {0} and with incorrect coupon {1}")
    @CsvSource({"Cap,qwerty", "Single,abcdefgh"})
    public void incorrectCouponCodeMessageTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .incorrectCouponCodeMessage(couponCode);
    }


    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}