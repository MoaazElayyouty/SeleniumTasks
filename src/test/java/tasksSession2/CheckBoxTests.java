package tasksSession2;

import Pages.CheckBoxPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTests extends DriverBase{


    @Test
    public void TestChekBox1(){

        CheckBoxPage checkBoxpage = new CheckBoxPage(driver);

        checkBoxpage.openCheckBoxPage();
        String headerText = checkBoxpage.getCheckBoxHeader();
        Assert.assertTrue(headerText.contains("Checkboxes"));
        checkBoxpage.selectCheckBox1();
        Assert.assertTrue(checkBoxpage.isCheckBox1Selected());
        checkBoxpage.unselectCheckBox2();
        Assert.assertFalse(checkBoxpage.isCheckBox2NotSelected());

    }
}
