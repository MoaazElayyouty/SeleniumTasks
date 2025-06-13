package Tests;

import Pages.DropDownPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DropDownTest extends BaseTest {

@Test

public void testDropdownList(){
        DropDownPage dropDownPage = homePage.clickOnDropDownLink();
        dropDownPage.selectFromDropDownList("Option 2");


        String actualOption = dropDownPage.getSelectedOptionText();
        String expectedOption = "Option 2";

        Assert.assertEquals(actualOption, expectedOption, "Selected option should be 'Option 2'");
}



}
