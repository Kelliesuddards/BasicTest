package com.mytest.mytestapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class selectMake {

    public static WebElement audi= null;

    public static WebElement audi (WebDriver driver) {

        audi = driver.findElement(By.cssSelector("#content > div > div > div.appContent___gsYlq.container > div > div > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div > h5"));

        return audi;
    }

    public static WebElement kia= null;

    public static WebElement kia (WebDriver driver){

        kia = driver.findElement(By.xpath("//h5[contains(text(), 'Kia')]"));

        return kia;



    }}