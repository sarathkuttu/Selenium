package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class URL {



    @Test(groups = "RUN")

    public void RunLogin(){

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        WebElement anchor_text = driver.findElement(By.linkText("Start a free trial"));
        System.out.println(anchor_text.getAttribute("href"));
        anchor_text.click();
    }
}
