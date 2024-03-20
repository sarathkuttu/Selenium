package com.SeleniumTesting;

import org.openqa.selenium.edge.EdgeDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Navigate {

    public static void main(String[] args) throws MalformedURLException {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://sdet.live");

        driver.navigate().to("https://be10x.in/");
        driver.navigate().to(new URL("https://www.youtube.com/"));
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();


    }
}
