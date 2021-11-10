package page_object;

import org.openqa.selenium.*;
import org.openqa.selenium.devtools.Message;
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
import static utils.StaticKeys.CURRENT_ITEM;

public class CartPage {

    private  final WebDriver driver = LocalDriverManager.getInstance();
    private Wait<WebDriver> wait;
    private  final  By couponCodeField = By.id("coupon_code");
    private  final  By applyCouponButton = By.name("apply_coupon");
    private final By cartDiscountCoupon = By.xpath("//tr[contains(@class, 'cart-discount coupon')]/th");
    private final By subtotalValueObject = By.xpath("//tr[@class='cart-subtotal']//bdi");
    private final By couponDiscountValueObject = By.xpath("//tr[contains(@class, 'cart-discount coupon')]//span[@class='woocommerce-Price-amount amount']");

//    public CartPage() {
//        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.readProperties().getProperty("explicit.wait"))));
//
//    }

    public CartPage() {
        wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(Long.parseLong(PropertiesReader.readProperties().getProperty("explicit.wait"))))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
    }


    public  CartPage applyCouponCode(String couponCode) {
        driver.findElement(couponCodeField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SUCCESS_MESSAGE_ELEMENT));
        assertThat("Message is not correct", driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(),equalTo(COUPON_APPLIED_MESSAGE));
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

//    public List<WebElement> getAllCartDiscountCoupons() {
//        return driver.findElements(cartDiscountCoupon);
//    }


    public CartPage cartTotalsContent() {
//        wait.until(ExpectedConditions.presenceOfElementLocated(cartDiscountCoupon));
//        assertThat("The cart totals does not contain the current coupon code", driver.findElement(cartDiscountCoupon).getText(), containsString(String.format("Coupon: %s", couponCode)));
//        Float subtotalValue = Float.parseFloat(driver.findElement(subtotalValueObject).getText().substring(1));
//        Float couponDiscountValue = Float.parseFloat(driver.findElement(couponDiscountValueObject).getText().substring(1));
//        assertEquals("The coupon discount amount does not match", discountAmount, couponDiscountValue/subtotalValue*100, 0);
        List<WebElement> allCartDiscountCoupons = driver.findElements(By.xpath("//*[contains(@class, 'woo')]"));
        for(WebElement coupon: allCartDiscountCoupons) {
            System.out.println(coupon.getText());
        }


        return this;
    }






}

