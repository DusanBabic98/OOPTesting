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

public class xkcmTest {

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

    public void xkcmTest () throws InterruptedException {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='middleContainer']/div[@id='comic']/img[1]")));
        String firstComic = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/img[1]")).getAttribute("src");
        System.out.println(firstComic);
        driver.findElement(By.xpath("//body/div[@id='middleContainer']/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(1000);
        String secondComic = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/img[1]")).getAttribute("src");
        System.out.println(secondComic);
        Assert.assertNotEquals(firstComic, secondComic);
    }

    @AfterTest

    public void endTest () {

        driver.quit();
    }




}
