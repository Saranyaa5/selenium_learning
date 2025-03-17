package task1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class leafgroundWebsite {
	public static void main(String [] args) throws InterruptedException {
		WebDriver driver=new EdgeDriver();
		 driver.manage().window().maximize();
		//*[@id="j_idt88:name"]
		 driver.get("https://www.leafground.com/input.xhtml");
		 WebElement name = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		 name.sendKeys("saranya");
		 
		 WebElement location = driver.findElement(By.id("j_idt88:j_idt91"));
		 location.sendKeys(",India");
		
		 WebElement textbox1 = driver.findElement(By.name("j_idt88:j_idt93"));
		 boolean Enabled = textbox1.isEnabled();
		 System.out.println("text enabled?: "+Enabled);
		 System.out.println( "text is disabled? " + (Enabled==true ? "False" : "True") );
		 
		
		 WebElement textbox2 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		 textbox2.clear();
		 
		 WebElement textbox = driver.findElement(By.id("j_idt88:j_idt97"));
		 String value = textbox.getAttribute("value");
		 System.out.println("Text box value: " + value);
		 
		 WebElement email = driver.findElement(By.id("j_idt88:j_idt99"));
		 
		 email.sendKeys("saranya@gmail.com"+ Keys.TAB);
		 
		 
         WebElement text4 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt101\"]"));
		 
		 email.sendKeys("hi i am saranya"+ Keys.TAB);
		 
		 WebElement error = driver.findElement(By.id("j_idt106:thisform:age"));
		 error.sendKeys(Keys.ENTER);
		 
		WebElement textbox5 = driver.findElement(By.id("j_idt106:float-input"));
        WebElement changelocation = driver.findElement(By.id("j_idt106:j_idt113"));
        Point loc=changelocation.getLocation();
        textbox5.click();
		Point newloc=changelocation.getLocation();
		System.out.println((loc.equals(newloc)?"same location for username":"location changes for username"));
		
		WebElement dropdowninput = driver.findElement(By.id("j_idt106:auto-complete_input"));
		dropdowninput.sendKeys("saranya");
		Thread.sleep(1000); 
        WebElement dropdownOption = driver.findElement(By.xpath("//*[@id='j_idt106:auto-complete_panel']/ul/li[3]"));
        dropdownOption.click();
		 
      
        WebElement calendar = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt116_input']"));
        calendar.sendKeys("25/03/2025");

      
        WebElement numberinput = driver.findElement(By.id("j_idt106:j_idt118_input"));
        numberinput.sendKeys("3");
        WebElement spin = driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt118\"]/a[1]"));
        spin.click();
        
        
        WebElement slidtext = driver.findElement(By.id("j_idt106:slider"));
        WebElement sliderContainer = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt120']"));
        WebElement slider = driver.findElement(By.xpath("//*[@id='j_idt106:j_idt120']/div"));

        System.out.println(slider.getCssValue("width"));

        slidtext.sendKeys("40");
        int sliderWidth = slider.getSize().getWidth();
        int totalWidth = sliderContainer.getSize().getWidth();
        double widthPercentage = ((double) sliderWidth / totalWidth) * 100;

        System.out.println(widthPercentage);
        
        

        
        
        
		 
		 
		 

		 
		 
	}
}
