package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    private By searchButton = By.xpath("//*[@id=\"ast-desktop-header\"]/div/div/div/div/div[3]/div[2]");
    private By searchTextBox = By.id("search-field");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSearchButton(){
        waitElementClick(searchButton);
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

    public void waitElementClick(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitElementVisible(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
