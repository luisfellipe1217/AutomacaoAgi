package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;


public class WebDriverManager {

    private static WebDriver driver;

    public static WebDriver driverSetup(){
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--headless");
      options.addArguments("--no-sandbox");
      options.addArguments("--disable-dev-shm-usage");
      options.addArguments("--disable-gpu");
      options.addArguments("--window-size=1050, 708");

      return driver = new ChromeDriver(options);
    }

    public static void webDriverClose(){
        driver.close();
    }
}
