package com.SeleniumTesting;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
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
        driver.close();
    }
}
