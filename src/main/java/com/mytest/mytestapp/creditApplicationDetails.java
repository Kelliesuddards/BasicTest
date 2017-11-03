package com.mytest.mytestapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class creditApplicationDetails {


    public static WebElement firstName = null;

    public static WebElement firstName(WebDriver driver) {

        firstName = driver.findElement(By.xpath("//*[@id=\"firstNameTextField\"]"));

        return firstName;
    }


    public static WebElement lastName = null;

    public static WebElement lastName(WebDriver driver) {

        lastName = driver.findElement(By.xpath("//*[@id=\"lastNameTextField\"]"));

        return lastName;
    }


    public static WebElement dateOfBirth = null;

    public static WebElement dateOfBirth(WebDriver driver) {

        dateOfBirth = driver.findElement(By.xpath("//*[@id=\"dobTextField\"]"));

        return dateOfBirth;
    }

    public static WebElement mobileNumber = null;

    public static WebElement mobileNumber(WebDriver driver) {

        mobileNumber = driver.findElement(By.xpath("//*[@id=\"mobilePhoneTextField\"]"));

        return mobileNumber;
    }

    public static WebElement email = null;

    public static WebElement email(WebDriver driver) {

        email = driver.findElement(By.xpath("//*[@id=\"emailTextField\"]"));

        return email;
    }


    public static WebElement password = null;

    public static WebElement password(WebDriver driver) {

        password = driver.findElement(By.xpath("//*[@id=\"passwordTextField\"]"));

        return password;
    }

    public static WebElement confirmPassword = null;

    public static WebElement confirmPassword(WebDriver driver) {

        confirmPassword = driver.findElement(By.xpath("//*[@id=\"confirmPasswordTextField\"]"));

        return confirmPassword;


    }

    public static WebElement createAndContinueButton = null;

    public static WebElement createAndContinueButton(WebDriver driver) {

        createAndContinueButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[4]/div/div[2]/form/div/div[2]/button"));

        return createAndContinueButton;
    }



    public static WebElement residenceStatus = null;

    public static WebElement residenceStatus(WebDriver driver) {

        residenceStatus = driver.findElement(By.xpath(" //*[@id=\"content\"]/div/div/div[4]/div/div[2]/form/div/section/div[2]/div[1]/div/div/div"));

        return residenceStatus;
    }

    public static WebElement rent = null;

    public static WebElement rent(WebDriver driver) {

        WebElement rent = driver.findElement(By.cssSelector("body > div:nth-child(22) > div > div > div > div:nth-child(1) > span > div > div"));

        return rent;
    }

    public static WebElement address = null;

    public static WebElement address(WebDriver driver) {

        address = driver.findElement(By.xpath("//*[@id=\"aginputaddress\"]"));

        return address;
    }


    public static WebElement city = null;

    public static WebElement city(WebDriver driver) {

        city = driver.findElement(By.xpath("//*[@id=\"aginputcity\"]"));

        return city;
    }

    public static WebElement addressZipCode = null;

    public static WebElement addressZipCode(WebDriver driver) {

        addressZipCode = driver.findElement(By.xpath("//*[@id=\"aginputzip\"]"));

        return addressZipCode;
    }

    public static WebElement state = null;

    public static WebElement state(WebDriver driver) {

        state = driver.findElement(By.xpath("//*[@id=\"agselectstate\"]/div[1]/div[2]"));

        return state;
    }

    public static WebElement moveInDate = null;

    public static WebElement moveInDate(WebDriver driver) {

        moveInDate = driver.findElement(By.xpath("//*[@id=\"aginputmoveindate\"]"));

        return moveInDate;
    }


    public static WebElement mortgageRent = null;

    public static WebElement mortgageRent(WebDriver driver) {

        mortgageRent = driver.findElement(By.xpath("//*[@id=\"aginputpayment\"]"));

        return mortgageRent;
    }

    public static WebElement residenceNextButton = null;

    public static WebElement residenceNextButton(WebDriver driver) {

        residenceNextButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div[4]/div/div[2]/form/div/div[1]/button"));

        return residenceNextButton;
    }



}
