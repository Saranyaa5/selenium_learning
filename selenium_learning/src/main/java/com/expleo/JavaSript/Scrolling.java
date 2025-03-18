package com.expleo.JavaSript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Scrolling {
	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://tutorialsninja.com/demo/");

        WebElement searchBox = driver.findElement(By.name("search"));

        SendKeysFunction(searchBox, driver,"hp");
        WebElement button = driver.findElement(By.cssSelector("#search > span > button"));
        PressEnter(button, driver,0);
        js.executeScript("history.go(0);");
        js.executeScript("window.scrollBy(500,500)");
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
