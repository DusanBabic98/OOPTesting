package book.cart.Cart;

import book.cart.utilityBookCart.BeforeAllBookCart;
import book.cart.utilityBookCart.FUN.AddToCartFun;
import book.cart.utilityBookCart.FUN.LogInFun;
import book.cart.utilityBookCart.POM.CartPOM;
import book.cart.utilityBookCart.POM.CheckOutPOM;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class QuantityLimit extends BeforeAllBookCart {

    @Test

    public void QuantityLimit() throws InterruptedException {

        LogInFun.logInFun(driver, wait);
        AddToCartFun.AddToCartFun(driver, wait);

        for (int i = 0; i < 100; i++) {
            driver.findElement(CartPOM.increaseQuantityValue).click();
            Thread.sleep(1000);

        }
        Thread.sleep(2000);
        driver.findElement(CartPOM.checkOutButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CheckOutPOM.checkOutText));
    }
}
