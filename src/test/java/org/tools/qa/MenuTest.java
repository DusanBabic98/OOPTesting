package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class MenuTest {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;

    @BeforeTest

    public void setUp () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://demoqa.com/menu#";
        driver.get(baseURL);
    }

    @Test

    public void menuTest () throws InterruptedException {

        Actions actions = new Actions(driver);
        WebElement menu2 = driver.findElement(By.xpath("//a[contains(text(),'Main Item 2')]"));
        actions.moveToElement(menu2);
        Thread.sleep(1000);
        WebElement sublist = driver.findElement(By.xpath("//a[contains(text(),'SUB SUB LIST »')]"));
        actions.moveToElement(sublist).moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Sub Sub Item 1')]"))).click().build().perform();
        Thread.sleep(1000);


    }

    @AfterTest

    public void endTest () {

        driver.quit();
    }
}
