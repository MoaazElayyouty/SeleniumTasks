package tasksSession2;

import Pages.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends DriverBase{


    @Test (priority = 1)
    public void testChekBox1(){

        CheckBoxPage checkBoxpage = new CheckBoxPage(driver);

        checkBoxpage.openCheckBoxPage();
        String headerText = checkBoxpage.getCheckBoxHeader();
        Assert.assertTrue(headerText.contains("Checkboxes"));
        checkBoxpage.selectCheckBox1();
        Assert.assertTrue(checkBoxpage.isCheckBox1Selected());


    }

    @Test (priority = 2)
    public void testChekBox2 (){

        CheckBoxPage checkBoxpage = new CheckBoxPage(driver);

        checkBoxpage.unselectCheckBox2();
        Assert.assertFalse(checkBoxpage.isCheckBox2NotSelected());
    }

}
