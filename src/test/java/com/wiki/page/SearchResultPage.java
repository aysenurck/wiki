package com.wiki.page;

import com.wiki.constants.Result_Constants;
import org.openqa.selenium.WebDriver;

public class SearchResultPage extends Result_Constants {

    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

        public SearchResultPage reviewResults(){
        captureScreen();
        return new SearchResultPage(driver);
        }
    }

