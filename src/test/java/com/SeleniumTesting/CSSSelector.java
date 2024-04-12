package com.SeleniumTesting;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class CSSSelector {
    WebDriver driver;

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

    }


    @Test(groups = "QA")
    @Description("Verify current URL and Title")

    public void Login() throws InterruptedException {


        WebElement AppointmentButton = driver.findElement(By.id("btn-make-appointment"));

        AppointmentButton.click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement username = driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
        username.sendKeys("John Doe");
        WebElement password = driver.findElement(By.cssSelector("#txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.id("btn-login"));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));

        wait.until(ExpectedConditions.elementToBeClickable(login_button));

        login_button.click();


    }

    @AfterTest

    public void CloseBrowser() {

        driver.close();
    }
}

