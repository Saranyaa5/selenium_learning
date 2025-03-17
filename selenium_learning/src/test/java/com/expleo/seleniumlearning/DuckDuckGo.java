package com.expleo.seleniumlearning;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class DuckDuckGo {
public static void main(String [] agrs) {
	//System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver"); // Update the path
	//WebDriver driver = new ChromeDriver();

	
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://duckduckgo.com/");
	 
	 String title=driver.
			 getTitle();
	 System.out.println("title: "+title);
	 WebElement search=driver.findElement(By.xpath("//div[@class=\"searchbox_searchbox__bfbmv\"]//input"));
	 System.out.println("search box enabled: "+ search.isEnabled());
	 
	 String input="java";
	 search.sendKeys(input+ Keys.ENTER);
	 
	 String newtitle=driver.getTitle();
	 System.out.println("title: "+newtitle);
	 
	 if(newtitle.contains(input)) {
		 System.out.println("seacrh is successful");
	 }
	 else {
		 System.out.println("seacrh is successful");
	 }	
 driver.quit();	
	 
}
}
