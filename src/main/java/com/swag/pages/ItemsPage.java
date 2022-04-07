package com.swag.pages;


import com.codeborne.selenide.SelenideElement;
import com.swag.core.base.PageTools;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ItemsPage extends PageTools {


    private final By items_list = By.xpath("//div[@class=\"inventory_item_name\"]");
    private final By item_title = By.xpath("//*[@class=\"title\"]");
    private final By item_price = By.xpath("//*[@id=\"inventory_container\"]/div/div/div[2]/div[2]/div");
    private final By buy_button = By.xpath("//*[@id=\"shopping_cart_container\"]/a");
    private final By add_to_cart = By.xpath("//*[@class=\"pricebar\"]/button[text()='Add to cart']");
    private final By remove_from_card = By.xpath("//button[text()=\"Remove\"]");
    private final By items_in_basket = By.xpath("//*[@id=\"shopping_cart_container\"]/a/span");

    private final By sort_button = By.xpath("//*[@class='product_sort_container']");
    private final By active_option = By.xpath("//*[@class=\"active_option\"]");
    private final By sort_button_aZ = By.xpath("//*[@class=\"product_sort_container\"]/option[1]");
    private final By sort_button_Za = By.xpath("//*[@class=\"product_sort_container\"]/option[2]");
    private final By sort_button_loHi = By.xpath("//*[@class=\"product_sort_container\"]/option[3]");
    private final By sort_button_Hilo = By.xpath("//*[@class=\"product_sort_container\"]/option[4]");




    public void go_to_buy_items_page() {
        click(buy_button);
    }

    public boolean getTitle() {
        return isElementVisible(item_title);
    }

}


