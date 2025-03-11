package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResults {

    WebDriver driver;
    private By researchResultsText = By.xpath("//*[@id=\"primary\"]/section/h1");
    private By firstResultCard = By.id("post-3622");

    public SearchResults(WebDriver driver){
        this.driver = driver;
    }

    public String getResearchResultsText(){
        return driver.findElement(researchResultsText).getText();
    }

    public boolean getFirstResultCard(){
        return driver.findElement(firstResultCard).isDisplayed();
    }


}
