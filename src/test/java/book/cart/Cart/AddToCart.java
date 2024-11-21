package book.cart.Cart;

import book.cart.utilityBookCart.BeforeAllBookCart;
import book.cart.utilityBookCart.FUN.AddToCartFun;
import book.cart.utilityBookCart.FUN.LogInFun;
import book.cart.utilityBookCart.POM.CartPOM;
import book.cart.utilityBookCart.POM.HomePagePOM;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class AddToCart extends BeforeAllBookCart {

    @Test

    public void addToCartTest () {

        LogInFun.logInFun(driver, wait);
        AddToCartFun.AddToCartFun(driver, wait);


    }
}
