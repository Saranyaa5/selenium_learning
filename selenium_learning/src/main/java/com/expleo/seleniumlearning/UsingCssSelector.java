package com.expleo.seleniumlearning;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class UsingCssSelector {
	public static void main(String [] args) {
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com");
		try {
			WebElement searchBox=driver.findElement(By.cssSelector("input.suggestor-input"));
			System.out.println("search box");
			System.out.println("displayed: "+searchBox.isDisplayed());
			System.out.println("Enabled: "+searchBox.isEnabled());
		}
		catch(Exception e){
			System.out.println("Search box not found");
		}
		try {
			WebElement searchButton=driver.findElement(By.cssSelector("div.qsbSubmit"));
			System.out.println("search box");
			System.out.println("displayed: "+searchButton.isDisplayed());
			System.out.println("Enabled: "+searchButton.isEnabled());
		}
		catch(Exception e){
			System.out.println("Search box not found");
			
		}
		driver.quit();
	}
}

