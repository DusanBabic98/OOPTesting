package book.cart.Cart;

import book.cart.utilityBookCart.BeforeAllBookCart;
import book.cart.utilityBookCart.FUN.AddToCartFun;
import book.cart.utilityBookCart.FUN.LogInFun;
import book.cart.utilityBookCart.POM.CartPOM;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ClearCart extends BeforeAllBookCart {

    @Test

    public void clearCart () {
        LogInFun.logInFun(driver, wait);
        AddToCartFun.AddToCartFun(driver, wait);
        driver.findElement(CartPOM.clearCartButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CartPOM.emptyCartMessage));
    }
}
