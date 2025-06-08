package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;




public class SecureAreaPage {


    WebDriver driver;

    public SecureAreaPage(WebDriver driver) {

        this.driver = driver;
    }



// Locators

    private final By validationMessage = By.id("flash");



    // Methods
    public String getValidationMessage(){
        return driver.findElement(validationMessage).getText();
    }






}
