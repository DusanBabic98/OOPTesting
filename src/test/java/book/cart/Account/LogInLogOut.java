package book.cart.Account;

import book.cart.utilityBookCart.BeforeAllBookCart;
import book.cart.utilityBookCart.FUN.LogInFun;
import book.cart.utilityBookCart.POM.HomePagePOM;
import book.cart.utilityBookCart.POM.LogInPOM;
import org.openqa.selenium.bidi.log.Log;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static book.cart.utilityBookCart.POM.LogInPOM.validPassword;
import static book.cart.utilityBookCart.POM.LogInPOM.validUserName;
import static book.cart.utilityBookCart.POM.RegisterPOM.passWord;
import static book.cart.utilityBookCart.POM.RegisterPOM.userName;

public class LogInLogOut extends BeforeAllBookCart {

    @Test (priority = 1)

    public void logInTest () {

        LogInFun.logInFun(driver, wait);
    }

    @Test (priority = 2)

    public void logOutTest () {

        driver.findElement(HomePagePOM.userDropDown).click();
        driver.findElement(HomePagePOM.logOutButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogInPOM.logInText));


    }
}
