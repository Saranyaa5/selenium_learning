package com.expleo.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarHandling {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");

        // Click on the departure date field to open the calendar
        driver.findElement(By.id("departure")).click();

        // Select a specific date (e.g., 20th of the current month)
        driver.findElement(By.xpath("//div[@aria-label='Mon May 20 2024']")).click();

        System.out.println("Date selected successfully!");
        driver.quit();
    }
}
