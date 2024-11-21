package swag.lab.test.utility.page_object_model;

import org.openqa.selenium.By;

public class PLP_PageObject {

    public static By ProductsText = By.xpath("//div[contains(text(),'Swag Labs')]");

    public static By HamburgerMenu = By.xpath("//button[@id='react-burger-menu-btn']");

    public static By LogOutButton = By.xpath("//a[@id='logout_sidebar_link']");

    public static By AddToCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");




}
