package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {


    private final WebDriver driver;

    public ForgotPasswordPage(WebDriver driver){
        this.driver = driver;
    }


    //Locators
    private final By headerText = By.xpath("//h2[text()= 'Forgot Password']");
    private final By mailField = By.xpath("//*[@name= 'email']");
    private final  By submitButton = By.id("form_submit");


    //Methods


    public  String getPasswordPageHeaderText (){
       return driver.findElement(headerText).getText();
    }

    public ForgotPasswordPage enterEmailAddress (String email ){

       driver.findElement(mailField).sendKeys(email);
       return this;
    }

    public PasswordResetErrorPage clickSubmitButton (){

       driver.findElement(submitButton).click();
       return new PasswordResetErrorPage (driver);
    }

}
