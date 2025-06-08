package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FileUploadSuccessPage {

WebDriver driver;
    public FileUploadSuccessPage(WebDriver driver) {
        this.driver = driver;

    }


    private final By headerTextAfterUpload = By.xpath("//h3[text() = 'File Uploaded!' ]");
    private final By uploadedFile = By.id("uploaded-files");







    public String getHeaderTextAfterUpload (){
        return driver.findElement(headerTextAfterUpload).getText();
    }

    public String getUploadedFile (){
        return driver.findElement(uploadedFile).getText();

    }




}
