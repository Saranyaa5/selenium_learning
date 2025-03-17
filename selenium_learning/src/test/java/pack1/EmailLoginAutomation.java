package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class EmailLoginAutomation {
	 public static void main(String [] args) throws InterruptedException {
	        
	        WebDriver driver = new EdgeDriver();
	        driver.manage().window().maximize();
	        Thread.sleep(2000);
	        driver.get("https://www.google.co.in");
	        WebElement gmail=driver.findElement(By.linkText("Gmail"));
	        gmail.click();
	        Thread.sleep(3000);
	        WebElement email=driver.findElement(By.id("identifierId"));
	        email.sendKeys("2k21cse128@kiot.ac.in"+Keys.ENTER);
	        WebElement next=driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span"));
	        next.click();
	        Thread.sleep(3000);
	        
	 }
}
