package com.expleo.JavaSript;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleInput {
    public static void main(String[] args) {
        
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.co.in");
        WebElement searchBox = driver.findElement(By.name("q"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].value='Java Programming';", searchBox);
        
        String title = (String) js.executeScript("return document.title;");
        String domain = (String) js.executeScript("return document.domain;");
        System.out.println("title: "+title);
        System.out.println("domain: "+domain);
        WebElement button = driver.findElement(By.name("btnK"));
        js.executeScript("arguments[0].click();", button);
       
        
        
    }
}
