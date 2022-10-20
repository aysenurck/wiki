package com.wiki.test;

import com.wiki.base.BaseTest;
import com.wiki.page.MainPage;
import com.wiki.util.ReadProperties;
import io.qameta.allure.*;
import org.testng.annotations.Test;

@Epic("Search Tests Epic")
@Feature("Main Search Test")
public class MainPageTest extends BaseTest {

    @Test(priority = 0)
    @Severity(SeverityLevel.NORMAL)
    @Story("User tries to search.")
    @Description("Success Search")
    public void successSearchResult() {
        new MainPage(driver)
                .mainSearch(ReadProperties.getSearchWord())
                .checkResults();

    }

    @Test(priority = 1)
    @Severity(SeverityLevel.NORMAL)
    @Story("User tries to advanced search.")
    @Description("Success Advanced Search")
    public void successAdvancedSearchResult() {
        new MainPage(driver)
                .advancedSearch(ReadProperties.getSearchWord())
                .checkResults();

    }

    @Test(priority = 2)
    @Severity(SeverityLevel.BLOCKER)
    @Story("User tries to search and take snapshoot.")
    @Description("Success Result Snapshoot")
    public void takeSnapshootResults() {
        new MainPage(driver)
                .mainSearch(ReadProperties.getSearchWord())
                .checkResults()
                .reviewResults();

    }

}
