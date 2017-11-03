package com.mytest.mytestapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class employmentInformation {



    public static WebElement employmentStatus = null;

    public static WebElement employmentStatus (WebDriver driver) {

        employmentStatus = driver.findElement(By.xpath("//*[@id=\"agselectemployment-status\"]"));

        return employmentStatus;

    }


    public static WebElement employerName = null;

    public static WebElement employerName (WebDriver driver) {

        employerName = driver.findElement(By.xpath("//*[@id=\"employer-name\"]"));

        return employerName;

    }

    public static WebElement jobTitle = null;

    public static WebElement jobTitle (WebDriver driver) {

        jobTitle = driver.findElement(By.xpath("//*[@id=\"employee-title\"]"));

        return jobTitle;

    }


    public static WebElement startDate = null;

    public static WebElement startDate (WebDriver driver) {

        startDate = driver.findElement(By.xpath("//*[@id=\"employee-start-date\"] "));

        return startDate;

    }


    public static WebElement employerPhone = null;

    public static WebElement employerPhone (WebDriver driver) {

        employerPhone = driver.findElement(By.xpath("//*[@id=\"employer-phone-number\"]"));

        return employerPhone;

    }

    public static WebElement monthlyIncome = null;

    public static WebElement monthlyIncome (WebDriver driver) {

        monthlyIncome = driver.findElement(By.xpath("//*[@id=\"gross-monthly-income\"]"));

        return monthlyIncome;

    }

    public static WebElement nextButton = null;

    public static WebElement nextButton (WebDriver driver) {

        nextButton = driver.findElement(By.xpath(" //*[@id=\"content\"]/div/div/div[4]/div/div[2]/form/div/div[1]/button"));

        return nextButton;

    }


    }