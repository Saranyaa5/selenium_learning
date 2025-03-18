package com.expleo.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateCommands {
public static void main(String [] args) {
	WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.navigate().to("http://www.google.com");
	 driver.navigate().to("http://www.smartcliff.in");
	 driver.navigate().back();
	 driver.navigate().forward();
	 driver.navigate().refresh();
	 driver.quit();
}
}
