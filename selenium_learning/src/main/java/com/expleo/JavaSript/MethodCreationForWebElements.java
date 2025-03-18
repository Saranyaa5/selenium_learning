package com.expleo.JavaSript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class MethodCreationForWebElements {
	 public static void main(String[] args) {
	        
	        WebDriver driver = new EdgeDriver();
	        driver.get("https://omayo.blogspot.com/");
	        WebElement yes = driver.findElement(By.id("alert2")); 
	        clickElement(driver,yes,0);     
	                
	 }

	private static void clickElement(WebDriver driver, WebElement yes,int n) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments['"+n+"'].click();", yes);	
	}
}
