package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgetPasswordPage {


    private WebDriver driver;

    public ForgetPasswordPage (WebDriver driver){
        this.driver = driver;
    }


    //Locators
    private By passwordPage = By.linkText("Forgot Password");
    private By headerText = By.xpath("//h2[text()= 'Forgot Password']");
    private By mailField = By.xpath("//*[@name= 'email']");
    private By submitButton = By.id("form_submit");
    private By errorMessage = By.xpath("//h1[text()='Internal Server Error']");



    //Methods

   public void openPasswordPage(){
        driver.findElement(passwordPage).click();
    }

    public String getHeaderText (){
       return driver.findElement(headerText).getText();
    }

    public void enterMailAdress (String email ){

       driver.findElement(mailField).sendKeys(email);
    }

    public void clickOnSubmitButton (){

       driver.findElement(submitButton).click();
    }

    public String getErrorMessage (){

       return driver.findElement(errorMessage).getText();
    }

}
