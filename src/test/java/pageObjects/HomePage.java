package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class HomePage {

    WebDriver driver;
    JavascriptExecutor js;

    By searchButton = By.xpath("//span[text()='Pesquisar']/following-sibling::span[1]");
    By searchTextBox = By.id("search-field");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void loadHomePage() throws InterruptedException {
        driver.manage().deleteAllCookies();
        driver.get("https://blogdoagi.com.br/");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }

    public boolean inputSearchTextBoxVisible(){
        return driver.findElement(searchTextBox).isDisplayed();
    }

    public void inputTextSearchTextBox(String text){
        driver.findElement(searchTextBox).sendKeys(text);
    }

    public void sendEnterKeyOnSearchBox(){
        driver.findElement(searchTextBox).sendKeys(Keys.ENTER);
    }

}
