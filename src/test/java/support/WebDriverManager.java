package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver driverSetup(){
        return driver = new ChromeDriver();
    }

    public static void webDriverClose(){
        driver.close();
    }
}
