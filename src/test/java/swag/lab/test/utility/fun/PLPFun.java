package swag.lab.test.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.utility.page_object_model.CartPageObject;
import swag.lab.test.utility.page_object_model.PLP_PageObject;

public class PLPFun {

    public static void AddToCart (WebDriver driver) {

        driver.findElement(PLP_PageObject.AddToCart).click();

    }
}
