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
    private final By cartTotalsCouponObject = By.xpath("//tr[contains(@class, 'cart-discount coupon')]/th");
    private final By cartTotalsCouponObjectLast = By.xpath("(//tr[contains(@class, 'cart-discount coupon')]/th)[last()]");
    private final By cartTotalsDiscountValueObject = By.xpath("//tr[contains(@class, 'cart-discount coupon')]//span[@class='woocommerce-Price-amount amount']");
    private final By cartTotalsDiscountValueObjectLast = By.xpath("(//tr[contains(@class, 'cart-discount coupon')]//span[@class='woocommerce-Price-amount amount'])[last()]");
    private final By removeButton = By.xpath("//a[@data-coupon]");
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
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(removeButton));
        assertThat("The coupon code field is not empty", driver.findElement(couponCodeField).getAttribute("Value").isEmpty());
        assertThat("The coupon code field does not contain the placeholder", driver.findElement(couponCodeField).getAttribute("placeholder"),equalTo("Coupon code"));
        return  this;
    }

    public CartPage incorrectCouponCodeMessage (String couponCode) {
        SharedContext.setValue(CURRENT_COUPON, couponCode);
        driver.findElement(couponCodeField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(ERROR_MESSAGE_ELEMENT));
        assertThat("Message is not correct", driver.findElement(ERROR_MESSAGE_ELEMENT).getText(),containsString(String.format(COUPON_DOES_NOT_EXIST, SharedContext.getValue(StaticKeys.CURRENT_COUPON))));
        assertThat("The coupon code field is not empty", driver.findElement(couponCodeField).getAttribute("Value").isEmpty());
        assertThat("The coupon code field does not contain the placeholder", driver.findElement(couponCodeField).getAttribute("placeholder"),equalTo("Coupon code"));
        assertEquals("The name of the incorrect coupon is presented in Cart totals", 0, driver.findElements(cartTotalsCouponObject).size());
        assertEquals("The discount value of the incorrect coupon is presented in Cart totals", 0, driver.findElements(cartTotalsDiscountValueObject).size());
        assertEquals("The Remove button is displayed in Cart totals", 0, driver.findElements(removeButton).size());
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


    public CartPage applyMultipleCoupons(String couponCode, Float discountPercentage, String additionalCouponCode, Float additionalDiscountPercentage) {
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(cartTotalsCouponObject, 1));
        assertThat("The cart totals does not contain the current coupon code", driver.findElement(cartTotalsCouponObject).getText(), containsString(String.format("Coupon: %s", couponCode)));
        assertThat("The cart totals does not contain the additional coupon code", driver.findElement(cartTotalsCouponObjectLast).getText(), containsString(String.format("Coupon: %s", additionalCouponCode)));
        assertEquals("The number of remove buttons not equals of 2", 2, driver.findElements(removeButton).size());
        Float subtotalValue = Float.parseFloat(driver.findElement(cartTotalsSubtotalValueObject).getText().substring(1));
        Float couponDiscountValue = Float.parseFloat(driver.findElement(cartTotalsDiscountValueObject).getText().substring(1));
        assertEquals("The coupon discount amount does not match", discountPercentage, couponDiscountValue/subtotalValue*100, 0);
        couponDiscountValue = Float.parseFloat(driver.findElement(cartTotalsDiscountValueObjectLast).getText().substring(1));
        assertEquals("The coupon discount amount does not match", additionalDiscountPercentage, couponDiscountValue/subtotalValue*100, 0);
        return this;
    }

    public CartPage removeCoupon(String couponCode) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(removeButton));
        driver.findElement(removeButton).click();
        wait.until(ExpectedConditions.stalenessOf(driver.findElement(SUCCESS_MESSAGE_ELEMENT)));
        wait.until(ExpectedConditions.presenceOfElementLocated(SUCCESS_MESSAGE_ELEMENT));
        assertThat("The coupon has not removed", driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(), equalTo(COUPON_IS_DELETED));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cartTotalsCouponObject));
        assertEquals("The name of the coupon still is presented in Cart totals", 0, driver.findElements(cartTotalsCouponObject).size());
        assertEquals("The discount value still is presented in Cart totals", 0, driver.findElements(cartTotalsDiscountValueObject).size());
        assertEquals("The Remove button still is displayed in Cart totals", 0, driver.findElements(removeButton).size());
        return this;
    }

    public CartPage expiredCoupon(String couponCode) {
        driver.findElement(couponCodeField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(ERROR_MESSAGE_ELEMENT));
        assertThat("Message is not correct", driver.findElement(ERROR_MESSAGE_ELEMENT).getText(), equalTo(COUPON_IS_EXPIRED));
        assertThat("The coupon code field is not empty", driver.findElement(couponCodeField).getAttribute("Value").isEmpty());
        assertThat("The coupon code field does not contain the placeholder", driver.findElement(couponCodeField).getAttribute("placeholder"),equalTo("Coupon code"));
        assertEquals("The name of the expired coupon is presented in Cart totals", 0, driver.findElements(cartTotalsCouponObject).size());
        assertEquals("The discount value of the expired coupon is presented in Cart totals", 0, driver.findElements(cartTotalsDiscountValueObject).size());
        assertEquals("The Remove button is displayed in Cart totals", 0, driver.findElements(removeButton).size());
        return  this;
    }

    public CartPage couponsCannotBeUsedTogether(String couponCode, Float discountPercentage) {
        wait.until(ExpectedConditions.textToBePresentInElementLocated(cartTotalsCouponObject, couponCode));
        assertThat("The cart totals does not contain the current coupon code", driver.findElement(cartTotalsCouponObject).getText(), containsString(String.format("Coupon: %s", couponCode)));
        assertThat("The remove button is absent", driver.findElement(removeButton).getAttribute("data-coupon"),containsString(String.format(couponCode)));
        Float subtotalValue = Float.parseFloat(driver.findElement(cartTotalsSubtotalValueObject).getText().substring(1));
        Float couponDiscountValue = Float.parseFloat(driver.findElement(cartTotalsDiscountValueObject).getText().substring(1));
        assertEquals("The coupon discount amount does not match", discountPercentage, couponDiscountValue/subtotalValue*100, 0);
        assertEquals("In the Cart totals, two different coupon codes are presented", driver.findElement(cartTotalsCouponObject), driver.findElement(cartTotalsCouponObjectLast));
        assertEquals("The number of remove buttons not equals of 1", 1, driver.findElements(removeButton).size());
        return this;
    }
}

