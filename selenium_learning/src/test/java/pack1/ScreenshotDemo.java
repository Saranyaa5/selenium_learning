package pack1;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDemo {
    public static void main(String[] args) throws AWTException, IOException, InterruptedException {
       
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");

        //driver.get("https://www.google.com/");
//        Robot robot = new Robot();
//        Dimension src_size = Toolkit.getDefaultToolkit().getScreenSize();
//        Rectangle rect = new Rectangle(src_size);
//        
//        BufferedImage img = robot.createScreenCapture(rect);
//
//        File dest = new File("screenshot.png");
//        ImageIO.write(img, "png", dest);
        
        TakesScreenshot sch = (TakesScreenshot) driver;
        File src = sch.getScreenshotAs(OutputType.FILE);
        File dest = new File("screenshot2.png");
        
        FileHandler.copy(src, dest);
        System.out.println("Screenshot saved as screenshot.png");

        driver.quit();
    }
}
