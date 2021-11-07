import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import page_object.MainPage;
import utils.LocalDriverManager;

import static utils.PropertiesReader.getProperties;

@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CouponCodeTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private final MainPage mainPage = new MainPage();

    @BeforeEach
    public void setUp() {
        driver.get(getProperties().getProperty("home.page"));
    }

    @ParameterizedTest(name = "Buy product with name {0} and apply coupon {1}")
    @CsvSource({"Belt,acodemy10off", "Album,acodemy20off"})
    @Order(1)
    public void applyCouponTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .applyCouponCode(couponCode);
    }

    @ParameterizedTest(name = "Can not buy product with name {0} and incorrect coupon {1}")
    @CsvSource({"Cap,qwerty", "Single,abcdefgh"})
    @Order(2)
    public void incorrectCouponCodeMessageTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .incorrectCouponCodeMessage(couponCode);
    }

    @ParameterizedTest(name =  "{0} {1} {2}")
    @CsvSource({"Belt, easy_discount, 5"})
    @Order(3)
    public void removeCurrentCoupon(String productName, String couponCode, int discount) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .removeCoupon();

    }


    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}