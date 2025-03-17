package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TypeInWebsite2 {
	public static void main(String [] args) throws InterruptedException {
		
		//WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://"
				+ "www.saucedemo.com");
		WebElement user1=driver.findElement(By.name("user-name"));
		user1.sendKeys("standard_user"+Keys.ENTER);
		WebElement pass2=driver.findElement(By.name("password"));
		pass2.sendKeys("secret_sauce"+Keys.ENTER);
//		WebElement login=driver.findElement(By.name("login-button"));
//		
//		login.click();
		user1.clear();
//		WebElement select1=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
//		Thread.sleep(3000);
//		select1.click();
		
//		String currentUrl=driver.getCurrentUrl();
//		String title=driver.getTitle();
//		System.out.println("title: "+title );
//		System.out.println("Url: "+currentUrl);
		//driver.close();
	}
}
