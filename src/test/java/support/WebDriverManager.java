package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    public WebDriver driver = new ChromeDriver();

    public WebDriverManager(){
    }

    public void webDriverInit(){
        System.setProperty("webdriver.chrome.driver", "/caminho/para/o/chromedriver");
        driver.get("https://blogdoagi.com.br/");
    }

    public void webDriverClose(){
        driver.close();
    }
}
