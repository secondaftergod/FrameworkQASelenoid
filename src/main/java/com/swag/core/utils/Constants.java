package com.swag.core.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Constants {
    public static String URL = PropertyLoader.get("base_url");
    public static String REMOTE_URL = PropertyLoader.get("remote_url");

    public static String USERNAME = "standard_user";
    public static String PASSWORD = "secret_sauce";

    public static String CHROME = "chrome";
    public static String FIREFOX = "firefox";

    public static String CURRENT_TIME;

    static {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDateTime now = LocalDateTime.now();

        CURRENT_TIME = dtf.format(now);
    }

    public static String BROWSER = System.getProperty("browserName", "chrome");

}