package task1;


import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Getlinks {

    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-infobars");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        String plt = driver.findElement(By.partialLinkText("OrangeHRM")).getText();
        System.out.println("Text of the partial link: " + plt);

        
        driver.findElement(By.name("username")).sendKeys("Admin"+Keys.ENTER);
        driver.findElement(By.name("password")).sendKeys("admin123"+Keys.ENTER);

        List<WebElement> linkList = driver.findElements(By.tagName("a"));
        System.out.println("Total Links: " + linkList.size());

        for (WebElement link : linkList) {
            System.out.println(link.getText() + " -> " + link.getAttribute("href"));
        }

        WebElement logout = driver.findElement(By.linkText("Logout"));
	    String value = logout.getText();
	    System.out.println(value);
	    
	    System.out.print(value.equalsIgnoreCase("logout")?"login successfull":"not successful");
        driver.quit();
    }
}
        
     