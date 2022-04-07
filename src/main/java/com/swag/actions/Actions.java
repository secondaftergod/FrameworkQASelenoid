package com.swag.actions;

public class Actions {

    private static LoginActions loginActions;


    public static LoginActions loginActions() {
        if (loginActions == null) {
            loginActions = new LoginActions();
        }
        return loginActions;
    }
}