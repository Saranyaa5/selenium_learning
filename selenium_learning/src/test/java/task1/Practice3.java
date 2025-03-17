package task1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Practice3 {
 public static void main(String [] args) {
	 WebDriver driver=new EdgeDriver();
	 driver.manage().window().maximize();
	driver.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
	
	WebElement red=driver.findElement(By.xpath("//div[@dir=\"ltr\"]//input"));

	WebElement red1=driver.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[1]"));
	boolean enabled=red.isEnabled();
	System.out.println("enabled: "+enabled);
	boolean dislayed=red.isDisplayed();
	System.out.println("displayed: "+dislayed);
	boolean selected=red.isSelected();
	System.out.println("selected: "+selected);
	boolean selected1=red1.isSelected();
	System.out.println("selected: "+selected1);
	
 }
}
