package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckboxPage {

    private final WebDriver driver;

    public CheckboxPage(WebDriver driver) {
        this.driver = driver;


    }

    // Locators
    private final By checkBoxHeader  = By.xpath("//h3[text()='Checkboxes']");
    private final By checkBox1 = By.xpath("//input[@type='checkbox'][1]");
    private final By checkBox2 = By.xpath("//input[@type='checkbox'][2]");






    public String getCheckBoxHeader (){
      return driver.findElement(checkBoxHeader).getText();

    }
    public void clickFirstCheckbox (){
      WebElement element = driver.findElement(checkBox1);

        if (!element.isSelected()) {
            element.click();
        }
    }
    public boolean isFirstCheckboxSelected (){
        return driver.findElement(checkBox1).isSelected();

    }
    public void clickSecondCheckbox (){
        driver.findElement(checkBox2).click();
    }

    public boolean isSecondCheckboxSelected (){
        return driver.findElement(checkBox2).isSelected();
    }
}