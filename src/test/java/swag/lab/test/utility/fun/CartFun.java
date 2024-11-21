package swag.lab.test.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.utility.page_object_model.*;

import static swag.lab.test.utility.page_object_model.CheckOutInfoPO.*;

public class CartFun {

    public static void GoToCart (WebDriver driver, WebDriverWait wait) {


        driver.findElement(CartPageObject.HeaderShoppingCart).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CartPageObject.YourCartText));

    }

    public static void GoToChecktout (WebDriver driver) {

        driver.findElement(CartPageObject.CheckOutButton).click();
    }

    public static void CheckOutInfoFill (WebDriver driver, WebDriverWait wait) {

        driver.findElement(CheckOutInfoPO.firstName).click();
        driver.findElement(CheckOutInfoPO.firstName).sendKeys(myFirstName);
        driver.findElement(CheckOutInfoPO.lastName).click();
        driver.findElement(CheckOutInfoPO.lastName).sendKeys(myLastName);
        driver.findElement(CheckOutInfoPO.ZipPostalCode).click();
        driver.findElement(CheckOutInfoPO.ZipPostalCode).sendKeys(myPostalCode);

    }

    public static void ContinueCheckOut (WebDriver driver, WebDriverWait wait) {

        driver.findElement(ContinueButton).click();

    }

    public static void CheckOutOverview (WebDriver driver, WebDriverWait wait) {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CheckOutOverviewPO.PriceTotal));
        driver.findElement(CheckOutOverviewPO.FinishButton).click();
    }

    public static void CheckOutComplete (WebDriver driver, WebDriverWait wait) {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(CheckOutCompletePO.ConfirmationText));
        driver.findElement(CheckOutCompletePO.BackToProductsButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PLP_PageObject.ProductsText));
    }

}
