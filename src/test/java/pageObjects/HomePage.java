package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class HomePage {

    WebDriver driver;
    JavascriptExecutor js;

    By searchButton = By.xpath("//*[@class='slide-search astra-search-icon']");
    By searchTextBox = By.id("search-field");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void loadHomePage(){
        driver.manage().deleteAllCookies();
        driver.get("https://blogdoagi.com.br/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void clickSearchButton(){

        driver.findElement(searchButton).click();
    }

    public boolean inputSearchTextBoxVisible(){
            waitElementVisible(searchTextBox);
            return driver.findElement(searchTextBox).isDisplayed();
    }

    public void inputTextSearchTextBox(String text){
        driver.findElement(searchTextBox).sendKeys(text);
    }

    public void sendEnterKeyOnSearchBox(){
        driver.findElement(searchTextBox).sendKeys(Keys.ENTER);
    }

    public void waitElementVisible(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
        
    public void waitElementClickabe(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }
}
