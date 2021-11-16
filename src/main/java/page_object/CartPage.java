package page_object;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import utils.*;
import java.time.Duration;
import java.util.List;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static page_object.StaticWebElements.*;
import static utils.Messages.*;
import static utils.StaticKeys.CURRENT_COUPON;

public class CartPage {

    private  final WebDriver driver = LocalDriverManager.getInstance();
    private Wait<WebDriver> wait;
    private  final  By couponCodeField = By.id("coupon_code");
    private  final  By applyCouponButton = By.name("apply_coupon");
    private final By cartTotalsSubtotalValueObject = By.xpath("//tr[@class='cart-subtotal']//bdi");
    private final By cartTotalsCouponObject = By.xpath("(//tr[contains(@class, 'cart-discount coupon')]/th)[last()]"); //Using List<WebElement> remove ()[last()] from locator
    private final By cartTotalsDiscountValueObject = By.xpath("(//tr[contains(@class, 'cart-discount coupon')]//span[@class='woocommerce-Price-amount amount'])[last()]"); //Using List<WebElement> remove ()[last()] from locator
    private final By removeButton = By.xpath("(//a[@data-coupon])[last()]");
//    private List<WebElement> allCartTotalsCoupons;
//    private List<WebElement> allCartTotalsDiscountValues;
//    private int size;

    public CartPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.readProperties().getProperty("explicit.wait"))));

    }

//    public CartPage() {
//        wait = new FluentWait<>(driver)
//                .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesReader.readProperties().getProperty("explicit.wait"))))
//                .pollingEvery(Duration.ofSeconds(1))
//                .ignoring(NoSuchElementException.class);
//    }

    public  CartPage applyCouponCode(String couponCode) {
        driver.findElement(couponCodeField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SUCCESS_MESSAGE_ELEMENT));
        assertThat("Message is not correct", driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(),equalTo(COUPON_APPLIED_MESSAGE));
        assertThat("The coupon code field is not empty", driver.findElement(couponCodeField).getAttribute("Value").isEmpty());
        assertThat("The coupon code field does not contain the placeholder", driver.findElement(couponCodeField).getAttribute("placeholder"),equalTo("Coupon code"));
        wait.until(ExpectedConditions.attributeContains(removeButton,"data-coupon", couponCode));
        assertThat("The remove button is absent", driver.findElement(removeButton).getAttribute("data-coupon"),containsString(String.format(couponCode)));
        return  this;
    }

    public CartPage incorrectCouponCodeMessage (String couponCode) {
        SharedContext.setValue(CURRENT_COUPON, couponCode);
        driver.findElement(couponCodeField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(ERROR_MESSAGE_ELEMENT));
        assertThat("Message is not correct", driver.findElement(ERROR_MESSAGE_ELEMENT).getText(),containsString(String.format(COUPON_DOES_NOT_EXIST, SharedContext.getValue(StaticKeys.CURRENT_COUPON))));
        return  this;
    }

//    public CartPage cartTotalsCoupons(String couponCode, Float discountPercentage) {
//        wait.until(ExpectedConditions.attributeContains(removeButton,"data-coupon", couponCode));
//
//        allCartTotalsCoupons = driver.findElements(cartTotalsCouponObject);
//        size = allCartTotalsCoupons.size()-1;
//        assertThat("The cart totals does not contain the current coupon code", allCartTotalsCoupons.get(size).getText(), containsString(String.format("Coupon: %s", couponCode)));
//
//        allCartTotalsDiscountValues = driver.findElements(cartTotalsDiscountValueObject);
//        Float subtotalValue = Float.parseFloat(driver.findElement(cartTotalsSubtotalValueObject).getText().substring(1));
//        Float couponDiscountValue = Float.parseFloat(allCartTotalsDiscountValues.get(size).getText().substring(1));
//        assertEquals("The coupon discount amount does not match", discountPercentage, couponDiscountValue/subtotalValue*100, 0);
//        return this;
//    }

    public CartPage cartTotalsCoupons(String couponCode, Float discountPercentage) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(cartTotalsCouponObject, couponCode));
        assertThat("The cart totals does not contain the current coupon code", driver.findElement(cartTotalsCouponObject).getText(), containsString(String.format("Coupon: %s", couponCode)));
        Float subtotalValue = Float.parseFloat(driver.findElement(cartTotalsSubtotalValueObject).getText().substring(1));
        Float couponDiscountValue = Float.parseFloat(driver.findElement(cartTotalsDiscountValueObject).getText().substring(1));
        assertEquals("The coupon discount amount does not match", discountPercentage, couponDiscountValue/subtotalValue*100, 0);
        return this;
    }

    public CartPage removeCoupon(String couponCode) {
        wait.until(ExpectedConditions.attributeContains(removeButton,"data-coupon", couponCode));
        driver.findElement(removeButton).click();
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(SUCCESS_MESSAGE_ELEMENT)));
        wait.until(ExpectedConditions.presenceOfElementLocated(SUCCESS_MESSAGE_ELEMENT));
        assertThat("The coupon has not deleted", driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(), equalTo(COUPON_IS_DELETED));
        return this;

    }







}

