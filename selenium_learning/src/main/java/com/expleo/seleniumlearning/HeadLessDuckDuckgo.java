package com.expleo.seleniumlearning;

import org.openqa.selenium.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessDuckDuckgo {
	public static void main(String [] args) {
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--headless");
	WebDriver driver = new ChromeDriver(options);
	driver.get("https://duckduckgo.com/");
	 
	 String title=driver.getTitle();
	 System.out.println("title: "+title);
	 WebElement search=driver.findElement(By.xpath("//div[@class=\"searchbox_searchbox__bfbmv\"]//input"));
	 System.out.println("search box displayed: "+ search.isDisplayed());
	 System.out.println("search box enabled: "+ search.isEnabled());
	 
	 String input="java";
	 search.sendKeys(input+ Keys.ENTER);
	 
	 String newtitle=driver.getTitle();
	 System.out.println("title: "+newtitle);
	 
	 if(newtitle.contains(input)) {
		 System.out.println("seacrh is successful");
	 }
	 else {
		 System.out.println("seacrh is successful.");
	 }
	 
	 driver.quit();
	}
}
