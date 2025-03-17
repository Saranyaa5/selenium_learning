package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Navigation3 {
    public static void main(String [] args) throws InterruptedException {
        
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        // Open SauceDemo login page
        
        driver.get("https://github.com/Saranyaa5");
        Thread.sleep(2000);
        
        // Navigate to another URL (if needed)
        driver.navigate().to("https://www.saucedemo.com");
        Thread.sleep(2000);

        // Enter username
        WebElement user1 = driver.findElement(By.name("user-name"));
        user1.sendKeys("standard_user");
        
        // Enter password
        WebElement pass2 = driver.findElement(By.name("password"));
        pass2.sendKeys("secret_sauce");
        
        // Click login button
        WebElement login = driver.findElement(By.name("login-button"));
        login.click();
        Thread.sleep(3000);

        // Select item to add to cart
        WebElement select1 = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        select1.click();
        driver.navigate().back();
        
        
        // Close the browser
        //driver.quit();
    }
}
