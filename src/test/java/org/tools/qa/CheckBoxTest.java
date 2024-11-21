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

public class CheckBoxTest {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;


    @BeforeTest

    public void setUp () {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://demoqa.com/checkbox";
        driver.get(baseURL);
    }

    @Test

    public void checkBoxTest () {

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//h1[contains(text(),'Check Box')]")));
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")));
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/button[1]/*[1]")).click();
        driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/ol[1]/li[1]/ol[1]/li[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/span[1]")));
        String text1 = driver.findElement(By.xpath("//span[contains(text(),'notes')]")).getText();
        String text2 = driver.findElement(By.xpath("//span[contains(text(),'Notes')]")).getText().toLowerCase();
        System.out.println(text2);
        Assert.assertEquals(text1, text2);





    }

    @AfterTest

    public void endTest () {

        driver.quit();
    }
}
