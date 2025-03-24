package pageObjects;

import org.openqa.selenium.*;


public class HomePage {

    WebDriver driver;
    JavascriptExecutor js;

    By searchButton = By.className("astra-search-icon");
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
