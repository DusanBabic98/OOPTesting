package book.cart.utilityBookCart.FUN;

import book.cart.utilityBookCart.POM.CartPOM;
import book.cart.utilityBookCart.POM.HomePagePOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartFun {

    public static void AddToCartFun (WebDriver driver, WebDriverWait wait) {
        driver.findElement(HomePagePOM.addToCartButton).click();
        driver.findElement(HomePagePOM.CartButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CartPOM.shoppingCartText));
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CartPOM.cartTotal));
    }
}
