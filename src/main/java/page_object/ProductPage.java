package page_object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.LocalDriverManager;
import utils.SharedContext;
import utils.StaticKeys;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static page_object.StaticWebElements.*;

public class ProductPage {

    private final WebDriver driver = LocalDriverManager.getInstance();
    private By addToCartElement = By.name("add-to-cart");
    private  By viewCartLink = By.xpath("//div[@class='woocommerce']//a");

    public ProductPage addProductToCart() {
        driver.findElement(addToCartElement).click();
        assertThat(driver.findElement(SUCCESS_MESSAGE_ELEMENT).isDisplayed(), is(Boolean.TRUE));
        assertThat(driver.findElement(SUCCESS_MESSAGE_ELEMENT).getText(), equalTo(String.format("“%s” has been added to your cart.", SharedContext.getValue(StaticKeys.CURRENT_ITEM))));
        return this;
    }

    public CartPage openCartPage() {
        driver.findElement(viewCartLink).click();
        assertThat("Title is incorrect", driver.getTitle(), containsString("Cart"));

        return new CartPage();


    }

}
