package taskssession2;

import Pages.FileUploadPage;
import Pages.FileUploadSuccessPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTest extends BaseTest {

    @Test

    public void uploadImageTest (){

        FileUploadPage fileUploadPage = homePage.openUploadPage();
        String actualHeaderText = fileUploadPage.getHeaderText();
        String expectedHeaderText = "File Uploader";
        Assert.assertEquals(expectedHeaderText,actualHeaderText);
        FileUploadSuccessPage fileUploadSuccessPage =  fileUploadPage.uploadImage();
        String actualHeaderTextAfterUpload = fileUploadSuccessPage.getHeaderTextAfterUpload();
        String expectedHeaderTextAfterUpload = "File Uploaded!";
        Assert.assertTrue(expectedHeaderTextAfterUpload.contains(actualHeaderTextAfterUpload));
        String acutualUploadedFile = fileUploadSuccessPage.getUploadedFile();
        String expectedUploadedFile ="91231.jpg";
        Assert.assertTrue(expectedUploadedFile.contains(acutualUploadedFile));

    }
}
