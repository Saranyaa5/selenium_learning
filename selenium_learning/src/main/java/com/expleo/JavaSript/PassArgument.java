package com.expleo.JavaSript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PassArgument {
    public static void main(String[] args) {
        
        // Launch Edge browser
        WebDriver driver = new EdgeDriver();

        // Open the website
        driver.get("https://omayo.blogspot.com/");
        
        WebElement yes = driver.findElement(By.id("alert2"));
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        
        js.executeScript("arguments[0].click();", yes);
        
        //driver.quit();
    }
}
