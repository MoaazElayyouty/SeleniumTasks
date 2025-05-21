package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CheckBoxPage {

    private final WebDriver driver;

    public CheckBoxPage(WebDriver driver) {
        this.driver = driver;


    }

    // Locators
    private final By checkBoxPage = By.linkText("Checkboxes");
    private final By checkBoxHeader  = By.xpath("//h3[text()='Checkboxes']");
    private final By checkBox1 = By.xpath("//input[@type='checkbox'][1]");
    private final By checkBox2 = By.xpath("//input[@type='checkbox'][2]");




    public void openCheckBoxPage (){

        driver.findElement(checkBoxPage).click();
    }

    public String getCheckBoxHeader (){
      return driver.findElement(checkBoxHeader).getText();

    }
    public void selectCheckBox1 (){
      WebElement element = driver.findElement(checkBox1);

        if (!element.isSelected()) {
            element.click();
        }
    }
    public boolean isCheckBox1Selected (){
        return driver.findElement(checkBox1).isSelected();

    }
    public void unselectCheckBox2 (){
        driver.findElement(checkBox2).click();
    }

    public boolean isCheckBox2NotSelected (){
        return driver.findElement(checkBox2).isSelected();
    }
}