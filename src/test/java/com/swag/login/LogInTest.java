package com.swag.login;

import com.swag.actions.Actions;
import com.swag.core.base.BaseTest;
import com.swag.pages.Pages;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.testng.Assert;
import org.testng.annotations.Test;

@Epic("Login")
@Feature("Log In")
@Owner("Ostap")
public class LogInTest extends BaseTest {

    @Test(description = "Log in Test")
    public void verifyLogin() {
        Actions.loginActions().typeLogin();
        Assert.assertTrue(Pages.itemsPage().getTitle(),
                "Error user is not logged in");
    }
    @Test(description = "Login Error")
    public void loginError(){
        Actions.loginActions().typeErrorLogin();
        Assert.assertEquals("Epic sadface: Username and password do not match any user in this service",Pages.loginPage().typeLoginError());

    }
}