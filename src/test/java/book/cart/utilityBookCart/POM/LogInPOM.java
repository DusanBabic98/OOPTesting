package book.cart.utilityBookCart.POM;

import org.openqa.selenium.By;

public class LogInPOM {
    public static By userNameField = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-login[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]");

    public static By passwordField = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-login[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-form-field[2]/div[1]/div[1]/div[2]/input[1]");

    public static By logInButton = By.xpath("//body/app-root[1]/div[1]/app-login[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-card-actions[1]/button[1]/span[2]");

    public static By regsisterButton = By.xpath("//span[contains(text(),'Register')]");

    public static By logInText = By.xpath("//mat-card-title[contains(text(),'Login')]");

    public static String validUserName = "Dusan";

    public static String validPassword = "Stolica.25";






}
