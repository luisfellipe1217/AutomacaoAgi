package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver driverSetup(){
       System.setProperty("webdriver.edge.driver", "src/test/resources/webdriver/msedgedriver");
       return driver = new EdgeDriver();
    }

    public static void webDriverClose(){
        driver.close();
    }
}
