package com.expleo.seleniumlearning;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamictable {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://thinking-tester-contact-list.herokuapp.com");

        WebElement searchBox = driver.findElement(By.id("email"));
        searchBox.sendKeys("2k21cse128@kiot.ac.in");

        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("1234567");
        driver.findElement(By.id("submit")).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       // List<WebElement> list = driver.findElements(By.xpath("//table[@id='myTable']/tr[2]"));
        
        List<WebElement> firstColumnElements = driver.findElements(By.xpath("//table[@id='myTable']//tr//td[2]"));

        
        for (WebElement element : firstColumnElements) {
           System.out.println(element.getText());
        }
        int rowIndex = 1; 
        for (WebElement element : firstColumnElements) {
            if (element.getText().equals("tharani k")) {
               
                List<WebElement> rowElements = driver.findElements(By.xpath("//table[@id='myTable']//tr[" + rowIndex + "]//td"));
                
                System.out.println("Full row data for 'tharani k':");
                for (WebElement val : rowElements) {
                    System.out.print(val.getText()+" ");
                }
                System.out.println();
                break;
            }
            rowIndex++;
        }

        driver.quit();
        
        
        
//        for (WebElement val : list) {
//            System.out.println(val.getText());
//        }

    }
}
