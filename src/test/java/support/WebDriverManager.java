package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverManager {

    public WebDriver driver = new EdgeDriver();

    public WebDriverManager(){
    }

    public void webDriverInit(){
        System.setProperty("webdriver.edge.driver", "src/test/resources/webdriver/msedgedriver");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://blogdoagi.com.br/");

    }

    public void webDriverClose(){
        driver.close();
    }
}
