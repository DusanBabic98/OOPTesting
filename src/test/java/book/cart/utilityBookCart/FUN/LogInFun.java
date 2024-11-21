package book.cart.utilityBookCart.FUN;

import book.cart.utilityBookCart.POM.HomePagePOM;
import book.cart.utilityBookCart.POM.LogInPOM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static book.cart.utilityBookCart.POM.LogInPOM.validPassword;
import static book.cart.utilityBookCart.POM.LogInPOM.validUserName;

public class LogInFun {

    public static void logInFun (WebDriver driver, WebDriverWait wait) {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePagePOM.homePageText));
        driver.findElement(HomePagePOM.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogInPOM.logInText));
        driver.findElement(LogInPOM.userNameField).click();
        driver.findElement(LogInPOM.userNameField).sendKeys(validUserName);
        driver.findElement(LogInPOM.passwordField).click();
        driver.findElement(LogInPOM.passwordField).sendKeys(validPassword);
        driver.findElement(LogInPOM.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePagePOM.homePageText));

    }
}
