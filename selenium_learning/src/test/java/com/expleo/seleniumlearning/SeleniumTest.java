package com.expleo.seleniumlearning;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) {
    	//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");
    	WebDriver driver = new ChromeDriver();

    	//WebDriverManager.chromedriver().setup(); // Automatically downloads & sets ChromeDriver
       // WebDriver driver = new ChromeDriver(); // Launch Chrome
        driver.get("https://www.google.com");
        System.out.println("Title: " + driver.getTitle());
        driver.quit();
    }
}

