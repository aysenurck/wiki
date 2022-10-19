package com.wiki.base;

import com.wiki.util.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected static WebDriver driver;
    public static String baseUrl = ReadProperties.getURL();
    public static String ChromePath = "C:\\drivers\\chromedriver.exe";
    //protected static String ChromePath = "/usr/bin/chromedriver";

    public WebDriver getDriver() {
        return driver;
    }

    @BeforeClass
    public void setupTest() {
        System.setProperty("webdriver.chrome.driver",ChromePath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }

    @AfterClass
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }

}
