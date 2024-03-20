package com.SeleniumTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumTest3 {

    public static void main(String[] args) {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.close();


    }
}
