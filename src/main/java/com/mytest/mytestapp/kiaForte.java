package com.mytest.mytestapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class kiaForte {

    public static WebElement sForteAuto = null;

    public static WebElement sForteAuto (WebDriver driver) {

        sForteAuto = driver.findElement(By.xpath("//*[@id=\"3KPFL4A79HE046529\"]/div[3]/div[3]"));

        return sForteAuto;
    }

    public static WebElement sForteAutoNext = null;

    public static WebElement sForteAutoNext (WebDriver driver) {

        sForteAutoNext = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[4]/section/div/div/div/div[2]/div[3]/div[2]/button"));

        return sForteAutoNext;
    }

    public static WebElement sForteAutoLeaseNext = null;

    public static WebElement sForteAutoLeaseNext (WebDriver driver) {

        sForteAutoLeaseNext = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[4]/section/div[2]/div[2]/form/div[4]/div/div[3]/button"));

        return sForteAutoLeaseNext;
    }

    }