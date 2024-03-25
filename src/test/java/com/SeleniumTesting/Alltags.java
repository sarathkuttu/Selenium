package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Alltags {

    @Test(groups = "RUN")
    public void Tags() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        try {
            List<WebElement> alltags = driver.findElements(By.tagName("a"));
            for (WebElement element : alltags) {
                System.out.println(element.getText());
            }

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement firstLink = wait.until(ExpectedConditions.elementToBeClickable(alltags.get(0)));

            firstLink.click();

        } finally {
            driver.quit();
        }
    }
}