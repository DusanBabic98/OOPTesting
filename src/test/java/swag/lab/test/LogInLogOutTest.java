package swag.lab.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import swag.lab.test.utility.BeforeAll;
import swag.lab.test.utility.page_object_model.LogInPageObject;
import swag.lab.test.utility.page_object_model.PLP_PageObject;

import java.time.Duration;

import static swag.lab.test.utility.page_object_model.LogInPageObject.myPassword;
import static swag.lab.test.utility.page_object_model.LogInPageObject.myUsername;

public class LogInLogOutTest  extends BeforeAll {


    @Test(priority = 1, description = "ValidLogInTest")

    public void logInTest () {




        driver.findElement(LogInPageObject.userNameField).click();
        driver.findElement(LogInPageObject.userNameField).sendKeys(myUsername);
        driver.findElement(LogInPageObject.passwordField).click();
        driver.findElement(LogInPageObject.passwordField).sendKeys(myPassword);
        driver.findElement(LogInPageObject.logInButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(PLP_PageObject.ProductsText));
    }

    @Test (priority = 2)

    public void logOutTest () {

        driver.findElement(PLP_PageObject.HamburgerMenu).click();
        driver.findElement(PLP_PageObject.LogOutButton).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(LogInPageObject.swagLabHeaderText));
    }


}
