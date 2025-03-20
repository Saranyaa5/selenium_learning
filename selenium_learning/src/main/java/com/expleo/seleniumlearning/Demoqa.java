package com.expleo.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoqa {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().clearDriverCache().setup();
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--disable-gpu"); // Recommended for headless mode in some cases
        options.addArguments("--window-size=1920,1080"); // Set window size for headless execution

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/radio-button");

        WebElement yes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
        WebElement impressive = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
        WebElement no = driver.findElement(By.cssSelector("label[for='noRadio']"));

        System.out.println("Radio Button Options:");
        System.out.println(yes.getText());
        System.out.println(impressive.getText());
        System.out.println(no.getText());

        WebElement yes1 = driver.findElement(By.id("yesRadio"));
        boolean firstradio = yes1.isSelected();

        if (firstradio) {
            System.out.println("First button is selected!");
        } else {
            System.out.println("First button is not selected");
        }

        String selected;
        if (firstradio) {
            impressive.click();
            selected = impressive.getText();
        } else {
            yes.click();
            selected = yes.getText();
        }

        System.out.println("Selected Button Value: " + selected);

        driver.quit();
    }
}
