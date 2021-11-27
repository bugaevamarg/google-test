package com.bugaevamarg.tests;

import com.codeborne.selenide.ElementsCollection;
import org.openqa.selenium.By;

import static com.codeborne.selenide.CollectionCondition.sizeGreaterThan;
import static com.codeborne.selenide.Selenide.$$;

public class ResultsPage {
    private final ElementsCollection searchResults = $$(By.className("yuRUbf"));

    public void checkResultsExist() {
        searchResults.shouldHave(sizeGreaterThan(1));
    }
}
