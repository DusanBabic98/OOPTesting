package swag.lab.test.utility.page_object_model;

import org.openqa.selenium.By;

public class CartPageObject {

    public static By HeaderShoppingCart = By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]");

    public static By CheckOutButton = By.id("checkout");

    public static By YourCartText = By.xpath("//span[contains(text(),'Your Cart')]");



}
