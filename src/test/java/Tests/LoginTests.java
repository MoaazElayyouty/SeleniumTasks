package Tests;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import org.testng.annotations.Test;

public class LoginTests extends BaseTest {


    @Test
    public void testSuccessfulLogin () {
        LoginPage loginPage = homePage.clickOnFormAuthenticationLink();
        loginPage.insertUsername("Test");
        loginPage.insertPassword("123456");
        SecureAreaPage secureAreaPage = loginPage.clickOnLoginButton();
        secureAreaPage.getValidationMessage(); 

    }

}
