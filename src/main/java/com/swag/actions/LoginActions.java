package com.swag.actions;

import com.codeborne.selenide.Selenide;
import com.swag.core.utils.Constants;
import com.swag.pages.Pages;


public class LoginActions {


    public void typeLogin(){
        Pages.loginPage().typeName(Constants.USERNAME);
        Pages.loginPage().typePassword(Constants.PASSWORD);
        Pages.loginPage().typeLoginButton();

    }
    public void typeErrorLogin(){
        Pages.loginPage().typeName("1");
        Pages.loginPage().typePassword(Constants.PASSWORD);
        Pages.loginPage().typeLoginButton();

    }

}
