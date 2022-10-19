package com.wiki.constants;

import com.wiki.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Result_Constants extends BasePageUtil {
    public Result_Constants(WebDriver driver) {
        super(driver);
    }

    public By RESULT_TEXT = By.cssSelector("a[title='Adjust']");

}
