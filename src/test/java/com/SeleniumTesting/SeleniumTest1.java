package com.SeleniumTesting;

import io.qameta.allure.Description;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class SeleniumTest1 {


    @Test
    @Description("Verify Login")
    public void Login() {

        WebDriver  driver = new EdgeDriver();
        driver.get("https://thetestingacademy.com/");
        System.out.println(driver.getTitle());


    }
}
