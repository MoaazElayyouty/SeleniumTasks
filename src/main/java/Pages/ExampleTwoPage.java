package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleTwoPage {

    WebDriverWait wait;
    WebDriver driver;

    public ExampleTwoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    //Locators
    private final By startButton = By.xpath("//div[@id='start']/button");
    private final By loadingIcon = By.xpath("//div[@id='loading']");
    private final By validationText = By.xpath("//div[@id='finish']/h4");


    //Methods

    public ExampleTwoPage clickOnStartButton (){

        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(startButton));
        element.click();
        return this;
    }


    public ExampleTwoPage waitForLoaderToDisappear() {
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loadingIcon));
        return this;
    }

    public String checkValidationText() {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(validationText)).getText();



    }


}