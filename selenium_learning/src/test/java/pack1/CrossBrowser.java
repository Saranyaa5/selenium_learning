package pack1;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser {
    public static void main(String args[]) throws Exception {
      
        Properties prop = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        prop.load(fis);
        
      
        String browser1 = prop.getProperty("browser");
        WebDriver driver = null; 

        if (browser1.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser1.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser name in config.properties");
            return;
        }

        driver.get("https://www.google.com");

     
        Thread.sleep(3000); 
        driver.quit();
    }
}