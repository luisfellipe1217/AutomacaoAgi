package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;

    private By searchButton = By.xpath("//*[@id=\"ast-desktop-header\"]/div/div/div/div/div[3]/div[2]/div/div/a");
    private By searchTextBox = By.id("search-field");
    private By homeMenu = By.id("ast-hf-menu-1");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public void clickSearchButton(){
        waitElementClick(searchButton);
        driver.findElement(searchButton).click();
    }

    public boolean inputSearchTextBoxVisible(){
        try {
            waitElementVisisble(searchTextBox);
            return driver.findElement(searchTextBox).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void inputTextSearchTextBox(String text){
        driver.findElement(searchTextBox).sendKeys(text);
    }

    public void sendEnterKeyOnSearchBox(){
        driver.findElement(searchTextBox).sendKeys(Keys.ENTER);
    }

    public void waitElementClick(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public void waitElementVisisble(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
