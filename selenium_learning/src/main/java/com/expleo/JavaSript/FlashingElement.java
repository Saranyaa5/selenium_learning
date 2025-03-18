package com.expleo.JavaSript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class FlashingElement {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

        WebElement ip = driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
        ip.click();

        String mnt = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
        String yr = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

        while (!(mnt.equals("May") && yr.equals("2025"))) {
            WebElement btn = driver.findElement(By.xpath("//span[@class=\"ui-icon ui-icon-circle-triangle-e\"]"));
            btn.click();
            mnt = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();
            yr = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
        }

        System.out.println(mnt + "\n" + yr);

        WebElement calendarHeader = driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
        flashElement(calendarHeader, driver, 5);

        driver.quit();
    }

    public static void flashElement(WebElement element, WebDriver driver, int times) throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i < times; i++) {
            js.executeScript("arguments[0].style.backgroundColor = 'red'", element);
            Thread.sleep(500); 
            js.executeScript("arguments[0].style.backgroundColor = ''", element);
            Thread.sleep(500); 
        }
    }
}
