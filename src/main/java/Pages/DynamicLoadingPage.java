package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicLoadingPage {

    WebDriver driver;
    WebDriverWait wait;

    public DynamicLoadingPage(WebDriver driver) {
        this.driver= driver;
        this.wait = new WebDriverWait(driver,Duration.ofSeconds(5));

    }

//locator
    private final By exampleOne = By.partialLinkText("Example 1:");
    private final By exampleTwo = By.partialLinkText("Example 2:");


// methods

    public ExampleOnePage clickOnExampleOneLink (){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(exampleOne));
        element.click();
        return new ExampleOnePage(driver);
    }

    public ExampleTwoPage clickOnExampleTwoLink (){
        driver.findElement(exampleTwo).click();
        return new ExampleTwoPage(driver);
    }

}
