package com.expleo.seleniumlearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoqa {
		public static void main(String [] agrs) {
		 WebDriverManager.chromedriver().clearDriverCache().setup();
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoqa.com/radio-button");
		 
		// WebElement options=driver.findElement(By.xpath("//div[@class=\"col-12 mt-4 col-md-6\"]//div[2]"));
		 WebElement yes = driver.findElement(By.cssSelector("label[for='yesRadio']"));
         WebElement impressive = driver.findElement(By.cssSelector("label[for='impressiveRadio']"));
         WebElement no = driver.findElement(By.cssSelector("label[for='noRadio']"));
        
         System.out.println("Radio Button Options:");
         System.out.println(yes.getText());
         System.out.println(impressive.getText());
         System.out.println(no.getText());
       
         WebElement yes1 = driver.findElement(By.id("yesRadio"));
         boolean firstradio = yes1.isSelected();
         //Thread.sleep(3000);
         if(firstradio) {
        	 System.out.println("First button is selected!");
         }else {
        	 System.out.println("First button is  not selected");
         }
         String selected;
         if (firstradio) {
             impressive.click();
             selected = impressive.getText();
         } else {
             yes.click();
             selected = yes.getText();
         }
         System.out.println("Selected Button Value: " + selected);

         driver.quit();
	}

}
