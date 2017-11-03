package com.mytest.mytestapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePage {

    public static WebElement nextButton = null;

    public static WebElement nextButton (WebDriver driver){

        nextButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[3]/div/div[1]/div/div/div/div/button"));

        return nextButton;


}}