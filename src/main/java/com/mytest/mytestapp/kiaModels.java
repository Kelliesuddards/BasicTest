package com.mytest.mytestapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class kiaModels {

    public static WebElement forte = null;

    public static WebElement forte(WebDriver driver) {

        forte = driver.findElement(By.xpath("//h5[contains(text(), 'Forte')]"));

        return forte;
    }
}