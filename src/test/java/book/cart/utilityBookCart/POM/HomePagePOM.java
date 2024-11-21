package book.cart.utilityBookCart.POM;

import org.openqa.selenium.By;

public class HomePagePOM {

    public static By logInButton = By.xpath("//span[contains(text(),'Login')]");

    public  static By homePageText = By.xpath("//a[contains(text(),'All Categories')]");

    public static By userDropDown = By.xpath("/html[1]/body[1]/app-root[1]/app-nav-bar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[3]/a[1]/span[2]/span[1]");

    public static By logOutButton = By.xpath("//span[contains(text(),'Logout')]");

    public static By favoritesButton = By.xpath("//body/app-root[1]/app-nav-bar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[3]/button[1]/span[3]");

    public static By addToCartButton = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-home[1]/div[1]/div[2]/div[1]/div[1]/app-book-card[1]/mat-card[1]/mat-card-content[1]/app-addtocart[1]/button[1]/span[2]");

    public static By CartButton = By.xpath("//body/app-root[1]/app-nav-bar[1]/mat-toolbar[1]/mat-toolbar-row[1]/div[3]/button[2]/span[3]");

}
