package page_object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.Message;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.LocalDriverManager;
import utils.Messages;
import utils.PropertiesReader;

import java.time.Duration;

import static org.hamcrest.MatcherAssert.assertThat;

import static org.hamcrest.core.IsEqual.equalTo;
import static page_object.StaticWebElements.*;
import static utils.Messages.COUPON_APPLIED_MESSAGE;

public class CartPage {

    private  final WebDriver driver = LocalDriverManager.getInstance();
    private WebDriverWait wait;
    private  final  By couponCodeField = By.id("coupon_code");
    private  final  By applyCouponButton = By.name("apply_coupon");

    public CartPage() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(Long.parseLong(PropertiesReader.readProperties().getProperty("explicit.wait"))));

    }


    public  CartPage applyCouponCode(String couponCode) {
        driver.findElement(couponCodeField).sendKeys(couponCode);
        driver.findElement(applyCouponButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(SUCCESS_MESSAGE_ELEMENT));
        assertThat("Message is not correct", driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(),equalTo(COUPON_APPLIED_MESSAGE));
        return  this;


    }




}
