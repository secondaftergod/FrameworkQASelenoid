package com.swag.pages;

import com.swag.core.base.PageTools;
import org.openqa.selenium.By;

public class LoginPage extends PageTools {

    private final By name=By.id("user-name");
    private final By password=By.id("password");
    private final By login_button=By.id("login-button");
    private final By login_error=By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3");

    public void typeName(String loginname){
        type(loginname,name);
    }
    public void typePassword(String pass){
        type(pass,password);

    }
    public void typeLoginButton(){
        click(login_button);

    }
    public String typeLoginError(){
        return getElementText(login_error);

    }
}

