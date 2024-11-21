package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DateAndTimePicker {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;

    @BeforeTest

    public void setUp () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://demoqa.com/date-picker";
        driver.get(baseURL);
    }
    @Test

    public void dateAndTimePicker () throws InterruptedException {

        driver.findElement(By.id("dateAndTimePickerInput")).click();
       //Month
        /*driver.findElement(By.xpath("//span[contains(text(),'November')]")).click();
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[11]")).click();
        Thread.sleep(3000);
        */

        //Year
        Actions action = new Actions(driver);
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/span[1]")).click();
        WebElement yearPicker = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[13]/a[1]"));
        for (int i=0; i<21; i++) { action.click(yearPicker).perform(); }
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[12]")).click();
        Thread.sleep(3000);
        //Day
        driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")).click();
        //Time
        driver.findElement(By.xpath("//li[contains(text(),'19:00')]")).click();
        String myBirthday = "November 8, 1998 7:00 PM";
        String datePicker = driver.findElement(By.id("dateAndTimePickerInput")).getText();
        System.out.println(myBirthday);
        System.out.println(datePicker);
        Assert.assertEquals(myBirthday, datePicker);





    }
    @AfterTest

    public void endTest () {

        driver.quit();
    }
}
