package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {


    private WebDriver driver;


    public HomePage(WebDriver driver){
    this.driver = driver;
    }

    // locators
    private final By formAuthenticationLink = By.partialLinkText("Form ");

    private final By checkBoxLink = By.linkText("Checkboxes");

    private final By forgetPasswordLink = By.linkText("Forgot Password");

    private final By uploadPage = By.linkText("File Upload");


    public LoginPage clickOnFormAuthenticationLink(){
        driver.findElement(formAuthenticationLink).click();
        return new LoginPage(driver);
    }



    public ForgotPasswordPage clickOnForgetPasswordLink(){
        driver.findElement(forgetPasswordLink).click();
        return new ForgotPasswordPage(driver);
    }


    public FileUploadPage openUploadPage(){
        driver.findElement(uploadPage).click();
        return new FileUploadPage(driver);
    }


    public CheckboxPage clickOnCheckBoxLink(){
        driver.findElement(checkBoxLink).click();
        return new CheckboxPage(driver);
    }




}
