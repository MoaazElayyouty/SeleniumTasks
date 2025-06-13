package Tests;

import Pages.DynamicLoadingPage;
import Pages.ExampleOnePage;
import Pages.ExampleTwoPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DynamicLoadingTests extends BaseTest{

    @Test
    public void testDynamicLoadingExampleOne (){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingPage();
        ExampleOnePage exampleOnePage  = dynamicLoadingPage.clickOnExampleOneLink();
        exampleOnePage.clickOnStartButton();
        String actualValidationText = exampleOnePage.getValidationText();
        String expectedValidationText = "Hello World!";
        Assert.assertEquals(actualValidationText,expectedValidationText);
    }
@Test
    public void testDynamicLoadingExampleTwo(){
        DynamicLoadingPage dynamicLoadingPage = homePage.clickOnDynamicLoadingPage();
        ExampleTwoPage exampleTwoPage = dynamicLoadingPage.clickOnExampleTwoLink();
        exampleTwoPage.clickOnStartButton();
        exampleTwoPage.waitForLoaderToDisappear();
        String actualValidationText = exampleTwoPage.checkValidationText();
        String expectedValidationText = "Hello World!";
        Assert.assertEquals(actualValidationText,expectedValidationText);



    }
}
