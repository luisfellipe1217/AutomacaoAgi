package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class SearchResults {

    WebDriver driver;
    private final By researchResultsText = By.xpath("//*[@id=\"primary\"]/section/h1");
    private final By firstResultCard = By.id("post-3622");


    public SearchResults(WebDriver driver){
        this.driver = driver;
    }

    public String getResearchResultsText(){
       waitElementVisisble(researchResultsText);
        return driver.findElement(researchResultsText).getText();
    }

    public boolean getFirstResultCard(){
        waitElementVisisble(firstResultCard);
        return driver.findElement(firstResultCard).isDisplayed();
    }

    public String getFirstResultCardText(){
        return driver.findElement(firstResultCard).getText();
    }

    public void waitElementVisisble(By by){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }


}
