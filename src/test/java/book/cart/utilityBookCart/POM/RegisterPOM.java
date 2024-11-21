package book.cart.utilityBookCart.POM;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;

import java.util.Random;

public class RegisterPOM {

    public static By firstNameField = By.id("mat-input-2");

    public static By lastNameField = By.id("mat-input-3");

    public static By userNameField = By.id("mat-input-4");

    public static By registerPasswordField = By.id("mat-input-5");

    public static By confirmPasswordField = By.id("mat-input-6");

    public static By maleGender = By.id("mat-radio-2");

    public static By confirmRegisterButton = By.xpath("/html[1]/body[1]/app-root[1]/div[1]/app-user-registration[1]/div[1]/mat-card[1]/mat-card-content[1]/form[1]/mat-card-actions[1]/button[1]/span[2]");

    public static By registrationText = By.xpath("//mat-card-title[contains(text(),'User Registration')]");

    static String prefix = "Dusan_";


    public static String firstName = RandomStringUtils.randomAlphabetic(5);
    public static String lastName = RandomStringUtils.randomAlphabetic(5);
    public static String userName = prefix + RandomStringUtils.randomAlphanumeric(8);
    public static String passWord = "Stolica.25";




}
