package taskssession2;

import Pages.CheckboxPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxTest extends BaseTest {


    @Test (priority = 1)
    public void testChekBox1(){


        CheckboxPage checkboxPage = homePage.clickOnCheckBoxLink();

        String headerText = checkboxPage.getCheckBoxHeader();
        Assert.assertTrue(headerText.contains("Checkboxes"));
        checkboxPage.clickFirstCheckbox();
        Assert.assertTrue(checkboxPage.isFirstCheckboxSelected());


    }

    @Test (priority = 2)
    public void testChekBox2 (){

        CheckboxPage checkboxPage = homePage.clickOnCheckBoxLink();

        checkboxPage.clickSecondCheckbox();
        Assert.assertFalse(checkboxPage.isSecondCheckboxSelected());
    }

}
