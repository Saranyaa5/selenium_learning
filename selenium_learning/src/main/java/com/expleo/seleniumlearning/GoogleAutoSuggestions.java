package com.expleo.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleAutoSuggestions {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        // Step 3: Find the search box and type "Java"
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Java");

        // Step 4: Wait for auto-suggestions to load
        Thread.sleep(2000);

        // Step 5: Get all auto-suggestions
        List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@role='listbox']//li"));

        // Step 6: Print all suggestions
        System.out.println("Google Auto-Suggestions for 'Java':");
        for (WebElement suggestion : suggestions) {
            System.out.println(suggestion.getText());
            if (suggestion.getText().equals("javatpoint")) {
                suggestion.click();  
                break;  
            }
        }

     
        driver.quit();
    }
}
