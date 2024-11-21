package book.cart.utilityBookCart.POM;

import org.openqa.selenium.By;

public class CartPOM {

    public static By shoppingCartText = By.xpath("//mat-card-title[contains(text(),'Shopping cart')]");

    public static By cartTotal = By.xpath("//strong[contains(text(),'Cart Total:')]");

    public static By checkOutButton = By.xpath("//span[contains(text(),'CheckOut')]");

    public static By clearCartButton = By.xpath("//span[contains(text(),'Clear cart')]");

    public static By emptyCartMessage = By.xpath("//mat-card-title[contains(text(),'Your shopping cart is empty.')]");

    public static By quantityValue = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-shoppingcart[1]/mat-card[1]/mat-card-content[1]/table[1]/tbody[1]/tr[1]/td[4]/div[1]/div[2]");

    public static By increaseQuantityValue = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[3]/button[1]/span[3]");

    public static By decreaseQuantityValue = By.xpath("//tbody/tr[1]/td[4]/div[1]/div[1]/button[1]/span[3]");


}
