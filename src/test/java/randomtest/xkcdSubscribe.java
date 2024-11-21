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

public class xkcdSubscribe {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;

    @BeforeTest

    public void setUp () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://xkcd.com/";
        driver.get(baseURL);

    }

    @Test

    public void subscribe () {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='topContainer']/div[@id='topLeft']/ul[1]/li[4]/a[2]")));
        driver.findElement(By.xpath("//body/div[@id='topContainer']/div[@id='topLeft']/ul[1]/li[4]/a[2]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body//p")));
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/input[1]")).click();
        String myEmail = "dusan@yopmail.com";
        driver.findElement(By.xpath("/html[1]/body[1]/form[1]/input[1]")).sendKeys(myEmail);
        driver.findElement(By.xpath("//body/form[1]/input[5]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html[1]/body[1]")));
        String message = driver.findElement(By.xpath("/html[1]/body[1]")).getText();
        System.out.println(message);
        Assert.assertEquals(("You should receive an email at <"+myEmail+"> shortly which will enable you to complete the signup process."), message);


    }

    @AfterTest

    public void endTest () {

        driver.quit();
    }
}
