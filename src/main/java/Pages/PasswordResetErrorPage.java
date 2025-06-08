package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordResetErrorPage {

    WebDriver driver;

    private final By errorMessage = By.xpath("//h1[text()='Internal Server Error']");


    public PasswordResetErrorPage(WebDriver driver) {
        this.driver = driver;

    }




    public  String getDisplayedErrorMessage(){

        return driver.findElement(errorMessage).getText();
    }




}
