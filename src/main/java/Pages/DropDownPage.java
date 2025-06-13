package Pages;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class DropDownPage {

    WebDriver driver;
    Select select;

    public DropDownPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By dropDownList = By.id("dropdown");


    public void selectFromDropDownList(String visibleText){
        select = new Select(driver.findElement(dropDownList));
        select.selectByVisibleText(visibleText);

    }

    public String getSelectedOptionText() {
        Select select = new Select(driver.findElement(dropDownList));
        return select.getFirstSelectedOption().getText();
    }



}
