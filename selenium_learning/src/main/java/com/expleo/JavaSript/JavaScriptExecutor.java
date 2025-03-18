package com.expleo.JavaSript;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {

    public static void main(String[] args) {
        
    	
        WebDriver driver = new EdgeDriver();

        driver.get("https://www.google.co.in");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("alert('Hello! This is a simple alert') ");
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(200));

        //driver.quit();
        
    }
}
