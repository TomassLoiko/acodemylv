import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import page_object.CartPage;
import page_object.MainPage;
import utils.LocalDriverManager;

import static utils.PropertiesReader.getProperties;

@Slf4j
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CouponCodeTest {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private final MainPage mainPage = new MainPage();
    private final CartPage cartPage = new CartPage();

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

    @ParameterizedTest(name =  "Buy product with name {0} and apply coupon {1} {2}% together with coupon {3} {4}%")
    @CsvSource({"Belt,easy_discount,5.0,additional_discount,10.0"})
    @Order(3)
    public void applyMultipleCouponsTest(String productName, String couponCode, Float discountPercentage, String additionalCouponCode, Float additionalDiscountPercentage) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .applyCouponCode(couponCode)
                .applyCouponCode(additionalCouponCode)
                .applyMultipleCoupons(couponCode, discountPercentage, additionalCouponCode, additionalDiscountPercentage);
    }

    @ParameterizedTest(name = "Add product {0} to cart, apply coupon {1} and remove one")
    @CsvSource({"Cap,easy_discount"})
    @Order(4)
    public void removeCouponTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .applyCouponCode(couponCode)
                .removeCoupon(couponCode);
    }

    @ParameterizedTest(name = "That is impossible to use expired coupon with name {1}")
    @CsvSource({"Hoodie with Zipper,expired"})
    @Order(5)
    public void expiredCouponTest(String productName, String couponCode) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart()
                .openCartPage()
                .expiredCoupon(couponCode);
    }

    @ParameterizedTest(name =  "Buy product with name {0} and apply coupon {1} {2}% together with coupon {3} {4}%")
    @CsvSource({"Belt,acodemy10off,10.0,acodemy20off,20.0"})
    @Order(6)
    public void couponsCannotBeUsedTogetherTest(String productName, String firstCouponCode, Float firstDiscountPercentage, String secondCouponCode, Float secondDiscountPercentage) {
        mainPage.selectProductFromListByName(productName)
                .addProductToCart().openCartPage()
                .applyCouponCode(firstCouponCode)
                .couponsCannotBeUsedTogether(firstCouponCode, firstDiscountPercentage)
                .applyCouponCode(secondCouponCode)
                .couponsCannotBeUsedTogether(secondCouponCode, secondDiscountPercentage);
    }

    @AfterEach
    public void tearDown() {
        LocalDriverManager.closeDriver();
    }
}