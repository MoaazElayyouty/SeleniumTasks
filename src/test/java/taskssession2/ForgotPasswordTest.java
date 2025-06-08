package taskssession2;

import Pages.PasswordResetErrorPage;
import Pages.ForgotPasswordPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTest extends BaseTest {


    @Test
    public void resetPasswordTest(){

        ForgotPasswordPage forgotPasswordPage = homePage.clickOnForgetPasswordLink();
        String actualHeaderText = forgotPasswordPage.getPasswordPageHeaderText();
        String expectedHeaderText = "Forgot Password";
        Assert.assertEquals(actualHeaderText, expectedHeaderText);
        forgotPasswordPage.enterEmailAddress("abcd@gmail.com");
        PasswordResetErrorPage passwordResetErrorPage = forgotPasswordPage.clickSubmitButton();
        String errorMessage = passwordResetErrorPage.getDisplayedErrorMessage();
        Assert.assertTrue(errorMessage.contains("Internal Server Error"));
    }



}
