package org.tools.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SliderTest {

    public WebDriver driver;
    public WebDriverWait wait;
    String baseURL;

    @BeforeTest

    public void setUp() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        baseURL = "https://demoqa.com/slider";
        driver.get(baseURL);
    }

    @Test

    public void sliderTest () {

        String firstvalue = driver.findElement(By.id("sliderValue")).getAttribute("Value");
        System.out.println(firstvalue);
        WebElement slider = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/span[1]/input[1]"));
        Actions move = new Actions(driver);
        Action action = (Action) move.dragAndDropBy(slider, 30, 0).build();
        action.perform();
        String secondvalue = driver.findElement(By.id("sliderValue")).getAttribute("Value");
        System.out.println(secondvalue);
        Assert.assertNotEquals(firstvalue, secondvalue);





    }


    @AfterTest

    public void endTest () {

        driver.quit();
    }

}
