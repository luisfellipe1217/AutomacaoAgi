package support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverManager {

    ChromeOptions options = new ChromeOptions();
    public WebDriver driver = new ChromeDriver();

    public WebDriverManager(){
    }

    public void webDriverInit(){

        options.addArguments("--headless"); // Se estiver rodando sem interface gráfica
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--user-data-dir=" + System.getProperty("java.io.tmpdir") + "/chrome-user-data");
        
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://blogdoagi.com.br/");

    }

    public void webDriverClose(){
        driver.close();
    }
}
