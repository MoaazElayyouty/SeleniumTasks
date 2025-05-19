package tasksSession2;

import Pages.ForgetPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgetPasswordTests extends DriverBase {


    @Test
    public void resetPasswordTest(){
        ForgetPasswordPage forgetPassword = new ForgetPasswordPage(driver);

        forgetPassword.openPasswordPage();
        String actualHeaderText = forgetPassword.getHeaderText();
        String expectedHeaderText = "Forgot Password";
        Assert.assertEquals(actualHeaderText, expectedHeaderText);
        forgetPassword.enterMailAdress("abcd@gmail.com");
        forgetPassword.clickOnSubmitButton();
        String errorMessage = forgetPassword.getErrorMessage();
        Assert.assertTrue(errorMessage.contains("Internal Server Error"));
    }



}
