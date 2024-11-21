package swag.lab.test.utility.fun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import swag.lab.test.utility.page_object_model.LogInPageObject;
import swag.lab.test.utility.page_object_model.PLP_PageObject;

import static swag.lab.test.utility.page_object_model.LogInPageObject.myPassword;
import static swag.lab.test.utility.page_object_model.LogInPageObject.myUsername;

public class LogInFun {

    public static void logInValidAccount (WebDriver driver, WebDriverWait wait) {

        driver.findElement(LogInPageObject.userNameField).click();
        driver.findElement(LogInPageObject.userNameField).sendKeys(myUsername);
        driver.findElement(LogInPageObject.passwordField).click();
        driver.findElement(LogInPageObject.passwordField).sendKeys(myPassword);
        driver.findElement(LogInPageObject.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PLP_PageObject.ProductsText));
    }

}
