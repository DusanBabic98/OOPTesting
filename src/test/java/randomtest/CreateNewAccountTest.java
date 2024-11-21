package randomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CreateNewAccountTest {

    public WebDriver driver;
    public WebDriverWait wait;

    String baseURL;


    @BeforeTest

    public void setUp () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://magento.softwaretestingboard.com/";
        driver.get(baseURL);
    }

    @Test

    public void createNewAccountTest () throws InterruptedException {

        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("firstname")).click();
        driver.findElement(By.id("firstname")).sendKeys("Dusan");
        Thread.sleep(2000);
        driver.findElement(By.id("lastname")).click();
        driver.findElement(By.id("lastname")).sendKeys("Babic");
        Thread.sleep(2000);
        driver.findElement(By.id("email_address")).click();
        driver.findElement(By.id("email_address")).sendKeys("giga.dusan.kora1@yopmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).click();
        driver.findElement(By.id("password")).sendKeys("GigaKora101");
        Thread.sleep(2000);
        driver.findElement(By.id("password-confirmation")).click();
        driver.findElement(By.id("password-confirmation")).sendKeys("GigaKora101");
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/main[1]/div[3]/div[1]/form[1]/div[1]/div[1]/button[1]/span[1]")).click();
    }

    @AfterTest

    public void endTest () {
        driver.quit();
    }
}
