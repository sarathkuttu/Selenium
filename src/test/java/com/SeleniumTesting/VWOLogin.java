package com.SeleniumTesting;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VWOLogin {

    @Test(groups = "QA")
    @Description("Verify current URL and Title")
    public void Login() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");
        System.out.println(driver.getTitle());
        Assert.assertEquals(driver.getTitle(),"Login - VWO");
        Assert.assertEquals(driver.getCurrentUrl(),"https://app.vwo.com/#/login");
        WebElement username = driver.findElement(By.id("login-username"));
        username.sendKeys("srthtv@gmail.com");
//        WebElement password = driver.findElement(By.id("login-password"));
//        password.sendKeys("sadqeasfas");

        driver.findElement(By.id("login-password")).sendKeys("sadasdas");
        driver.findElement(By.id("js-login-btn")).click();

        //driver.close();
    }
}
