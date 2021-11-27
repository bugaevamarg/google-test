package com.bugaevamarg.tests;

import org.testng.annotations.Test;

public class GoogleTest {
    @Test
    public void checkUserCanSearch() {
        new MainPage()
                .open()
                .inputSearchQuery("open.ru");
        new ResultsPage()
                .checkResultsExist();
    }
}
