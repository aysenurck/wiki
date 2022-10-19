package com.wiki.constants;

import com.wiki.base.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Main_Constants extends BasePageUtil {
    public Main_Constants(WebDriver driver) {
        super(driver);
    }

    public By SEARCH_AREA = By.id("ooui-php-1");
    public By SEARCH_BUTTON = By.cssSelector(".oo-ui-fieldLayout-body button");
    public By SEARCH_RESULT_AREA = By.id("ooui-29");
    public By RESULT_TEXT = By.cssSelector("a[title='Adjust']");
    public By ADVENCED_SEARCH_TOGGLE = By.linkText("Advanced search:Sort by relevance");
    public By EXACTLY_TEXT_AREA = By.id("ooui-37");
    public By SORTING_ORDER = By.id("advancedSearchField-sort");
    public By EDIT_DATE_OPTION = By.cssSelector("div#advancedSearchField-sort  div[role='listbox'] > div:nth-of-type(2)");


}
