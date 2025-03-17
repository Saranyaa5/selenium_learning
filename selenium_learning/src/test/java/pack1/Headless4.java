package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Headless4 {
public static void main(String [] args) {
        
        ChromeOptions option=new ChromeOptions();
        option.addArguments("--headless");
        WebDriver driver1=new ChromeDriver(option);
        driver1.manage().window().maximize();
        
        driver1.get("https://www.google.co.in");
        
        WebElement search_box=driver1.findElement(By.name("q"));
		search_box.sendKeys("java programming"+Keys.ENTER);
		String currentUrl=driver1.getCurrentUrl();
		String title=driver1.getTitle();
		System.out.println("title: "+title );
		System.out.println("Url: "+currentUrl);
		driver1.close();
		     
}
}
