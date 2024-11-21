package swag.lab.test.utility.page_object_model;

import org.openqa.selenium.By;

public class CheckOutCompletePO {


    public static By ConfirmationText = By.xpath("//h2[contains(text(),'Thank you for your order!')]");

    public static By BackToProductsButton = By.id("back-to-products");


}
