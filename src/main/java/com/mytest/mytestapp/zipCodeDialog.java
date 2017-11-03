package com.mytest.mytestapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class zipCodeDialog {

    public static WebElement zipCode= null;

    public static WebElement ZipCode (WebDriver driver) {

        zipCode = driver.findElement(By.xpath("html/body/div[3]/div/div[2]/div/div/div/div[1]/div[1]/input"));

        return zipCode;
    }

    public static WebElement findButton= null;

    public static WebElement findButton (WebDriver driver){

        findButton = driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div/div/div/div[1]/div[2]/button"));

        return findButton;



    }}