package com.bugaevamarg.tests;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MainPage {
    private final SelenideElement searchField = $(By.name("q"));
    private static final String pageURL = "https://google.com";

    public MainPage open() {
        Selenide.open(pageURL);
        return this;
    }

    public MainPage inputSearchQuery(String query) {
        searchField.setValue(query).pressEnter();
        return this;
    }
}
