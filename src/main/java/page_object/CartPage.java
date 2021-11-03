package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.*;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.core.IsEqual.equalTo;
import static page_object.StaticWebElements.*;
import static utils.Messages.*;
import static utils.StaticKeys.CURRENT_COUPON;
import static utils.StaticKeys.CURRENT_ITEM;

public class CartPage {

    private  final WebDriver driver = LocalDriverManager.getInstance();
    private WebDriverWait wait;
    private  final  By couponCodeField = By.id("coupon_code");
    private  final  By applyCouponButton = By.name("apply_coupon");
    private final By cartDiscountCoupon = By.xpath("//tr[contains(@class, 'cart-discount coupon')]/th");

    public CartPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.readProperties().getProperty("explicit.wait"))));

    }


    public  CartPage applyCouponCode(String couponCode) {
        driver.findElement(couponCodeField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SUCCESS_MESSAGE_ELEMENT));
        assertThat("Message is not correct", driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(),equalTo(COUPON_APPLIED_MESSAGE));
        wait.until(ExpectedConditions.presenceOfElementLocated(cartDiscountCoupon));
        assertThat("Element does not contain the current coupon code", driver.findElement(cartDiscountCoupon).getText(), containsString(String.format("%s", couponCode)));
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






}
