package com.expleo.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSuggestion {

    public static void main(String[] args) {
        // Set path to ChromeDriver (if required)
       

        // Step 1: Initialize WebDriver
        WebDriver driver = new ChromeDriver();
        
        // Step 2: Navigate to Amazon
        driver.get("http://www.amazon.in");

        // Step 3: Find all links (anchor tags)
        List<WebElement> no_of_links = driver.findElements(By.tagName("a"));

        // Step 4: Print total number of links
        System.out.println("No. of links: " + no_of_links.size());

        // Step 5: Close browser
        driver.quit();
    }
}
