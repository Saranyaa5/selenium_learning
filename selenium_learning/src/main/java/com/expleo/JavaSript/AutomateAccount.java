package com.expleo.JavaSript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateAccount {
public static void main(String [] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
	
	WebElement firstname=driver.findElement(By.id("input-firstname"));
	WebElement lastname=driver.findElement(By.id("input-lastname"));
	WebElement email=driver.findElement(By.id("input-email"));
	WebElement phone=driver.findElement(By.id("input-telephone"));
	WebElement password=driver.findElement(By.id("input-password"));
	WebElement confirm=driver.findElement(By.id("input-confirm"));
	
	SendKeysFunction(driver, firstname,"saranya");
	SendKeysFunction(driver, lastname,"A");
	SendKeysFunction(driver, email,"sargesh@gmail.com");
	SendKeysFunction(driver, phone,"9852626712");
	SendKeysFunction(driver, password,"Saran123");
	SendKeysFunction(driver, confirm,"Saran123");
	
	
	WebElement check=driver.findElement(By.xpath("//input[@name=\"agree\"]"));
	
}

private static void SendKeysFunction(WebDriver driver, WebElement input,String text) {
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].value='" + text + "';", input);
	
}
private static void PressEnter(WebElement button, WebDriver driver,int n) {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments['"+n+"'].click();", button);
}
}
