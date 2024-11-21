package book.cart.Cart;

import book.cart.utilityBookCart.BeforeAllBookCart;
import book.cart.utilityBookCart.FUN.AddToCartFun;
import book.cart.utilityBookCart.FUN.LogInFun;
import book.cart.utilityBookCart.POM.CartPOM;
import org.openqa.selenium.safari.AddHasDebugger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeQuantity extends BeforeAllBookCart {

    @Test (priority = 1)

    public void increaseQuantity () throws InterruptedException {

        LogInFun.logInFun(driver, wait);
        AddToCartFun.AddToCartFun(driver, wait);
        String firstValue = driver.findElement(CartPOM.quantityValue).getText();
        System.out.println(firstValue);
        driver.findElement(CartPOM.increaseQuantityValue).click();
        Thread.sleep(1000);
        String secondValue = driver.findElement(CartPOM.quantityValue).getText();
        System.out.println(secondValue);
        Assert.assertNotEquals(firstValue, secondValue);

    }

    @Test (priority = 2)

    public void decreaseQuantity () throws InterruptedException {

        String firstValue = driver.findElement(CartPOM.quantityValue).getText();
        System.out.println(firstValue);
        driver.findElement(CartPOM.decreaseQuantityValue).click();
        Thread.sleep(1000);
        String secondValue = driver.findElement(CartPOM.quantityValue).getText();
        System.out.println(secondValue);
        Assert.assertNotEquals(firstValue, secondValue);
    }
}
