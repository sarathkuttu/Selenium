package com.SeleniumTesting;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class AdblockerClass {

    @Test

    public void TestMethod() {

        EdgeOptions edgeOptions = new EdgeOptions();

        edgeOptions.addExtensions(new File("C:/Users/Sarath/Downloads/Adblock.1.crx"));
        //edgeOptions.addArguments("--start-maximized");
        //edgeOptions.addArguments("--windows-size=800,600");
        //edgeOptions.addArguments("--incoginito");
        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/");
        System.out.println(driver.getTitle());
        //driver.quit();

    }


}
