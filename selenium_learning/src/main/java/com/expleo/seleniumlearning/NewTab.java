package com.expleo.seleniumlearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTab {
	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.bing.com/");
		 System.out.println("New Page - Bing is opened");
		 // Opens a new window and switches to new window
		 driver.switchTo().newWindow(WindowType.TAB);
		 // Opens duckduckgo homepage in the new opened window
		 driver.navigate().to("https://www.duckduckgo.com/");
		 System.out.println("New Tab is opened with DuckDuckGo");
		 driver.quit();
		 }
}
