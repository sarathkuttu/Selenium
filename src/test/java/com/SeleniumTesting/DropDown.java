package com.SeleniumTesting;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropDown {
    WebDriver driver;

    @BeforeTest
    public void OpenBrowser() throws InterruptedException {

        EdgeOptions options = new EdgeOptions();
        options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        options.addArguments("--guest");
        driver = new EdgeDriver(options);

        driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/dropdown");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Dropdown List']")));

    }


    @Test(groups = "QA")


    public void Options() throws InterruptedException {

        WebElement drop = driver.findElement(By.cssSelector("#dropdown"));

        Select select = new Select(drop);
        select.selectByIndex(2);

        Thread.sleep(15000);
    }

    @AfterTest

    public void CloseBrowser() {

        driver.close();
    }
}

