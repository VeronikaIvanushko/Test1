package com.test.webdriver;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Test1 {

    @Test
    public void startWebdriver(){

        System.setProperty("webdriver.gecko.driver",
                "D:\\geckodriver-v0.20.1-win64\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("https://vm-mpf-10.dev.sigmaukraine.com/");

        Assert.assertTrue("title should start from",driver.getTitle().startsWith("Overview"));

        driver.close();


    }
}
