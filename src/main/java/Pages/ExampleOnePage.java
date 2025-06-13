package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExampleOnePage {

    WebDriver driver;

    WebDriverWait wait;

    public ExampleOnePage(WebDriver driver) {
        this.driver=driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
// Locators
    private final By startButton = By.xpath("//div[@id='start']/button");
    private final By validationText = By.xpath("//div[@id='finish']/h4");


    // Methods

    public ExampleOnePage clickOnStartButton (){
        driver.findElement(startButton).click();
        return this;
    };

    public String getValidationText(){
   return wait.until(ExpectedConditions.visibilityOfElementLocated(validationText)).getText();

    };



}
