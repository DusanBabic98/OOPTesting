package org.tools.qa;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class Alerts {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;

    @BeforeTest

    public void setUp () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://demoqa.com/alerts";
        driver.get(baseURL);
    }

    @Test

    public void alerts () throws InterruptedException {

        //Alert
        driver.findElement(By.id("alertButton")).click();
        driver.switchTo().alert().accept();
        Thread.sleep(1000);



        //Timed Alert


        /*
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(1000);
        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

         */


        //Confirm Alert

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(1000);
        driver.switchTo().alert().accept();
        Thread.sleep(1000);
        driver.findElement(By.id("confirmResult")).isDisplayed();

        //Prompt Alert
        driver.findElement(By.id("promtButton")).click();

        //Print message from Alert
        String myText = driver.switchTo().alert().getText();
        System.out.println(myText);
        //EnterText
        Alert alert = driver.switchTo().alert();
        Thread.sleep(1000);
        alert.sendKeys("myText");
        alert.accept();
        Thread.sleep(1000);
        driver.findElement(By.id("promptResult")).isDisplayed();




    }

    @AfterTest

    public void endTest () {

        driver.quit();
    }


}
