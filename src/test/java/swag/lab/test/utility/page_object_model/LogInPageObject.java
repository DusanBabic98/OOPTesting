package swag.lab.test.utility.page_object_model;

import org.openqa.selenium.By;

public class LogInPageObject {


   public static By swagLabHeaderText = By.xpath("//div[contains(text(),'Swag Labs')]");

   public static By userNameField = By.id("user-name");

   public static By passwordField = By.id("password");

   public static By logInButton = By.id("login-button");


   public static String myUsername = "standard_user";
   public static String myPassword = "secret_sauce";


}
