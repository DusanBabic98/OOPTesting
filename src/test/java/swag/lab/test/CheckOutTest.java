package swag.lab.test;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import swag.lab.test.utility.BeforeAll;
import swag.lab.test.utility.fun.CartFun;
import swag.lab.test.utility.fun.LogInFun;
import swag.lab.test.utility.fun.PLPFun;
import swag.lab.test.utility.page_object_model.*;

import static swag.lab.test.utility.page_object_model.CheckOutInfoPO.*;
import static swag.lab.test.utility.page_object_model.LogInPageObject.myPassword;
import static swag.lab.test.utility.page_object_model.LogInPageObject.myUsername;

public class CheckOutTest extends BeforeAll {

    @Test

    public void CheckOutTest () {

        //LogIn
        LogInFun.logInValidAccount(driver, wait);
        //AddToCart
        PLPFun.AddToCart(driver);
        //GoToCart
        CartFun.GoToCart(driver, wait);
        //GoToCheckOut
        CartFun.GoToChecktout(driver);
        //CheckOutInfo
        CartFun.CheckOutInfoFill(driver, wait);
        //CheckOutContinue
        CartFun.ContinueCheckOut(driver, wait);
        //CheckOutOverview
        CartFun.CheckOutOverview(driver, wait);
        //CheckOutComplete
        CartFun.CheckOutComplete(driver,wait);




    }


}
