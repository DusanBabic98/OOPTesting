package randomtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeAdminTest {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;




    @BeforeTest

    public void setUp () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        driver.get(baseURL);

    }

    @Test

    public void orangeAdminTest () throws InterruptedException {

        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")).sendKeys("Admin");
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")).sendKeys("admin123");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[3]/button[1]")).click();
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")));
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/button[1]/i[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/div[1]/div[1]/input[1]")).sendKeys("Admin");
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")));
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/aside[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")));
        String myText = driver.findElement(By.xpath("//header/div[1]/div[1]/span[1]/h6[1]")).getText();
        System.out.println(myText);
        Assert.assertEquals(myText, "Admin");



    }

    @AfterTest

    public void endTest () {

        driver.quit();
    }
}
