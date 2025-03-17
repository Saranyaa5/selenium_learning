package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class FlipkartGetAttributes7 {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
//		WebElement element=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div/div/div[1]/div[1]/header/div[2]/div[3]/div/a[1]"));
//		String text=element.getText();
//		System.out.println(text);
//		String name=element.getAttribute("href");
//		System.out.println(name);
		WebElement search = driver.findElement(By.name("q"));
       
		search.sendKeys("black laptop");
		//driver.navigate().back();
		//search.clear();
	    Thread.sleep(3000);
		 search.sendKeys(Keys.CONTROL + "a"+Keys.BACK_SPACE); 
	    
		//driver.quit();		
	}
}
