package com.expleo.JavaSript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FunctionForSendKeys {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.co.in");

        WebElement searchBox = driver.findElement(By.name("q"));

        SendKeysFunction(searchBox, driver, "Java Programming");
        WebElement button = driver.findElement(By.name("btnK"));
        PressEnter(button, driver,0);
        //explicit weight so it will wait untill the 
        //driver.quit();
    }

    private static void SendKeysFunction(WebElement searchBox, WebDriver driver, String text) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='" + text + "';", searchBox);
    }

    private static void PressEnter(WebElement button, WebDriver driver,int n) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments['"+n+"'].click();", button);
    }
}
