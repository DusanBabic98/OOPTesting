package randomtest;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class createAccountParaBank {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;

    String prefix = "giga_";
    String username = prefix + RandomStringUtils.randomAlphanumeric(5).toLowerCase();
    String email = prefix + RandomStringUtils.randomAlphanumeric(7).toLowerCase() + "@yopmail.com";


    @BeforeTest

    public void setUp () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://parabank.parasoft.com/parabank/index.htm";
        driver.get(baseURL);

    }
    @Test

    public void createAccountParaBank () throws InterruptedException {

        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[1]/p[2]/a[1]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/h1[1]")));
        driver.findElement(By.id("customer.firstName")).click();
        driver.findElement(By.id("customer.firstName")).sendKeys("Dusan123");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.lastName")).click();
        driver.findElement(By.id("customer.lastName")).sendKeys("Babic");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.street")).click();
        driver.findElement(By.id("customer.address.street")).sendKeys("ABCD");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.city")).click();
        driver.findElement(By.id("customer.address.city")).sendKeys("EFGH");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.state")).click();
        driver.findElement(By.id("customer.address.state")).sendKeys("JKLM");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.address.zipCode")).click();
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("11000");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.phoneNumber")).click();
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("0001112223");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.ssn")).click();
        driver.findElement(By.id("customer.ssn")).sendKeys("absdh");
        Thread.sleep(2000);
        driver.findElement(By.id("customer.username")).click();
        driver.findElement(By.id("customer.username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.id("customer.password")).click();
        driver.findElement(By.id("customer.password")).sendKeys("GigaKora101");
        Thread.sleep(2000);
        driver.findElement(By.id("repeatedPassword")).click();
        driver.findElement(By.id("repeatedPassword")).sendKeys("GigaKora101");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[3]/div[2]/form[1]/table[1]/tbody[1]/tr[13]/td[2]/input[1]")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]")));
    }



    @AfterTest

    public void endTest () {
        driver.quit();
    }
}
