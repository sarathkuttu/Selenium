package com.SeleniumTesting;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Katalon {


    @Test(groups = "QA")
    @Description("Verify current URL and Title")
    public void Login() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement AppointmentButton = driver.findElement(By.id("btn-make-appointment"));

        AppointmentButton.click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/profile.php#login");

        WebElement username = driver.findElement(By.xpath("(//input[@placeholder='Username'])[2]"));
        username.sendKeys("John Doe");
        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login_button = driver.findElement(By.id("btn-login"));

        login_button.click();
    }
}

