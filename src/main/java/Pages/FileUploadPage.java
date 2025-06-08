package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class FileUploadPage {

    public FileUploadPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    private final WebDriver driver;
    private final WebDriverWait wait;

    // Locators
    private final By headerText = By.xpath("//h3[text() = 'File Uploader']");
    private final By upload = By.cssSelector("input[type='file']");
    private final By chooseFileButton = By.id("file-submit");











    // Methods


    public String getHeaderText(){
        return driver.findElement(headerText).getText();
    }

    public FileUploadSuccessPage  uploadImage (){
        WebElement uploadElement = wait.until(ExpectedConditions.visibilityOfElementLocated(upload));
        uploadElement.sendKeys("C:\\Users\\moaaz.elayyouty\\Downloads\\Image\\91231.jpg");

        WebElement submitButton = wait.until(ExpectedConditions.visibilityOfElementLocated(chooseFileButton));
        submitButton.click();
        return new FileUploadSuccessPage(driver);

    }









}
