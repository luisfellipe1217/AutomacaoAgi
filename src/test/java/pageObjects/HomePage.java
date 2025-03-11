package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;
    private By searchButton = By.xpath("//*[@id=\"ast-desktop-header\"]/div/div/div/div/div[3]/div[2]/div/div/a");
    private By searchTextBox = By.id("search-field");
    private By homeMenu = By.id("ast-hf-menu-1");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public boolean menu(){
        return driver.findElement(homeMenu).isDisplayed();
    }
    public void clickSearchButton(){
        driver.findElement(searchButton).click();
    }
    public void inputTextSearchTextBox(String text){
        driver.findElement(searchTextBox).sendKeys(text);
    }
    public void sendEnterKeyOnSearchBox(){
        driver.findElement(searchTextBox).sendKeys(Keys.ENTER);
    }
}
