package com.swag.pages;

import com.swag.core.allure.AllureLogger;

public class Pages extends AllureLogger {

    private static LoginPage loginPage;
    private static ItemsPage itemsPage;

    public static LoginPage loginPage() {
        if (loginPage == null) {
            loginPage = new LoginPage();
        }
        return loginPage;
    }
    public static ItemsPage itemsPage() {
        if (itemsPage == null) {
            itemsPage = new ItemsPage();
        }
        return itemsPage;
    }

}