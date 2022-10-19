package com.wiki.page;

import com.wiki.constants.Main_Constants;
import com.wiki.util.ReadProperties;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class MainPage extends Main_Constants {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public MainPage mainSearch(String word) {
        clickObjectBy(SEARCH_AREA);
        setObjectBy(SEARCH_AREA,word);
        isElementPresent(SEARCH_RESULT_AREA);
        clickObjectBy(SEARCH_BUTTON);
        return new MainPage(driver);
    }

    public SearchResultPage checkResults(){
        String word = ReadProperties.getSearchWord();
        String resultWord = driver.findElement(RESULT_TEXT).getText();
        Assert.assertEquals(word,resultWord);
        return new SearchResultPage(driver);
    }

    public MainPage advancedSearch(String word){
        clickObjectBy(SEARCH_AREA);
        clickObjectBy(ADVENCED_SEARCH_TOGGLE);
        clickObjectBy(EXACTLY_TEXT_AREA);
        setObjectBy(EXACTLY_TEXT_AREA,word);
        clickObjectBy(SORTING_ORDER);
        clickObjectBy(EDIT_DATE_OPTION);
        scrollElementBy(SEARCH_BUTTON);
        clickObjectBy(SEARCH_BUTTON);
        return new MainPage(driver);
    }
}
