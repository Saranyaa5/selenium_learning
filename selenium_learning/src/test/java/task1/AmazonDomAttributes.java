package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonDomAttributes {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.facebook.com/");
//		 int size = ((Object) driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"))).size();
//		// 
//		 System.out.println();
//		//System.out.println(text.getDomAttribute("text"));
//		 WebElement text1 = driver.findElement(By.xpath("//*[@id=\"email\"]"));
//			System.out.println(text1.getText());
//			System.out.println(text1.getDomAttribute("name"));
//			System.out.println(text1.getDomAttribute("tabindex"));
//			System.out.println(text1.getDomAttribute("type"));
//			System.out.println(text1.getDomAttribute("id"));
//			System.out.println(text1.getDomAttribute("class"));
		
	}
}
