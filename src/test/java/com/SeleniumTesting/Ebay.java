package com.SeleniumTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class Ebay {

    private WebDriver driver;

    @BeforeTest

    public void OpenBrowser() {
        driver = new EdgeDriver();
    }


    @Test(groups = "Test")
    public void MACITEMS() throws InterruptedException {

        driver.get("https://www.ebay.com/sch/i.html?_from=R40&_trksid=p2499334.m570.l1313&_nkw=mac+mini&_sacat=58058");
        WebElement Searchbox = driver.findElement(By.xpath("//input[@id='gh-ac']\n"));
        Searchbox.sendKeys("MACBOOK");

        WebElement SearchButton = driver.findElement(By.xpath("//input[@value='Search']"));
        SearchButton.click();

        Thread.sleep(3000);


        List<WebElement> Items = driver.findElements(By.className("s-item__title"));

        for (WebElement Titles : Items) {

            System.out.println(Titles.getText());

        }


    }


    @AfterTest

    public void CloseBrowser() {

        driver.close();
    }
}
