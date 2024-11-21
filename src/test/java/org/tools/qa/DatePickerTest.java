package org.tools.qa;

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

public class DatePickerTest {

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

    public void datePickerTest () {

        driver.findElement(By.id("datePickerMonthYearInput")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]")));
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/select[1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'November')]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[2]/select[1]")).click();
        driver.findElement(By.xpath("//option[contains(text(),'1998')]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]")).click();
        String date = driver.findElement(By.xpath("//input[@id='datePickerMonthYearInput']")).getAttribute("value");
        System.out.println(date);
        Assert.assertEquals(date, "11/08/1998");
    }

    @AfterTest

    public void endTest () {

        driver.quit();
    }
}
