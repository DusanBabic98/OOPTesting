package book.cart.Account;

import book.cart.utilityBookCart.BeforeAllBookCart;
import book.cart.utilityBookCart.POM.HomePagePOM;
import book.cart.utilityBookCart.POM.LogInPOM;
import book.cart.utilityBookCart.POM.RegisterPOM;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import static book.cart.utilityBookCart.POM.RegisterPOM.*;

public class Register extends BeforeAllBookCart {

    @Test(priority = 1)

    public void registerTest() throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePagePOM.homePageText));
        driver.findElement(HomePagePOM.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogInPOM.logInText));
        driver.findElement(LogInPOM.regsisterButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(RegisterPOM.registrationText));
        driver.findElement(RegisterPOM.firstNameField).click();
        driver.findElement(RegisterPOM.firstNameField).sendKeys(firstName);
        driver.findElement(RegisterPOM.lastNameField).click();
        driver.findElement(RegisterPOM.lastNameField).sendKeys(lastName);
        driver.findElement(RegisterPOM.userNameField).click();
        driver.findElement(RegisterPOM.userNameField).sendKeys(userName);
        driver.findElement(registerPasswordField).click();
        driver.findElement(registerPasswordField).sendKeys(passWord);
        driver.findElement(confirmPasswordField).click();
        driver.findElement(confirmPasswordField).sendKeys(passWord);
        driver.findElement(maleGender).click();
        Thread.sleep(2000);
        driver.findElement(confirmRegisterButton).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogInPOM.logInText));

    }

    @Test(priority = 2)
    public void logInTest() throws InterruptedException {

        driver.findElement(LogInPOM.userNameField).click();
        driver.findElement(LogInPOM.userNameField).sendKeys(userName);
        driver.findElement(LogInPOM.passwordField).click();
        driver.findElement(LogInPOM.passwordField).sendKeys(passWord);
        driver.findElement(LogInPOM.logInButton).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(HomePagePOM.homePageText));
    }

    @Test(priority = 3)

    public void logOutTest() {

        driver.findElement(HomePagePOM.userDropDown).click();
        driver.findElement(HomePagePOM.logOutButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogInPOM.logInText));

    }
}