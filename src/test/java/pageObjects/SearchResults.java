package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchResults {

    WebDriver driver;
    JavascriptExecutor js;
    private final By researchResultsText = By.xpath("//*[@id='primary']/section/h1");
    private final By firstResultCard = By.id("post-3622");
    private final By infiteWrapPage2 = By.id("infinite-view-2");


    public SearchResults(WebDriver driver){
        this.driver = driver;
    }

    public String getResearchResultsText(){
       waitElementVisible(researchResultsText);
       return driver.findElement(researchResultsText).getText();
    }

    public boolean getFirstResultCard(){
        waitElementVisible(firstResultCard);
        return driver.findElement(firstResultCard).isDisplayed();
    }

    public String getFirstResultCardText(){
        return driver.findElement(firstResultCard).getText();
    }

    public boolean validateInfiniteWrapperPage(){
        js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,5094)");
        waitElementVisible(infiteWrapPage2);
        return driver.findElement(infiteWrapPage2).isEnabled();
    }

    public void waitElementVisible(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
}
