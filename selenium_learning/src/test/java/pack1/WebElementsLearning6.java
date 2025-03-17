package pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebElementsLearning6 {

	public static void main(String [] args) {
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com");
		WebElement element=driver.findElement(By.xpath("//*[@id=\"root\"]/div[4]/div[2]/nav/ul/li[1]/a"));
		String text=element.getText();
		System.out.println(text);
		
		String color=element.getCssValue("color");
		System.out.println(color);
		//to get x coordinates
		int x=element.getLocation().getX();
		System.out.println(x);
		
		WebElement search=driver.findElement(By.xpath("//*[@id=\"root\"]/div[7]/div/div/div[1]/div/div/div/div[1]/div/input"));
		boolean searchBox=search.isEnabled();
		System.out.println(searchBox);
	}
}
