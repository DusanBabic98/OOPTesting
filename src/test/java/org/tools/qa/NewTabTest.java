package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class NewTabTest {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;

    @BeforeTest

    public void setUp () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://demoqa.com/browser-windows";
        driver.get(baseURL);

    }

    @Test

    public void newTabTest () throws InterruptedException {

        driver.findElement(By.id("tabButton")).click();
        List<String> browserTabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(browserTabs.get(1));
        String myURL = driver.getCurrentUrl();
        System.out.println(myURL);
        Assert.assertNotEquals(myURL, baseURL);
        driver.findElement(By.id("sampleHeading")).isDisplayed();
        driver.close();
        driver.switchTo().window(browserTabs.getFirst());
        Thread.sleep(1000);
        driver.findElement(By.xpath("//h1[contains(text(),'Browser Windows')]")).isDisplayed();



    }


    @AfterTest

    public void endTest () {

        driver.quit();
    }
}
