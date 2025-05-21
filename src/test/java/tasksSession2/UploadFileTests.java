package tasksSession2;

import Pages.UploadFilePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTests extends DriverBase {

    @Test

    public void uploadImageTest (){
        UploadFilePage uploadFilePage = new UploadFilePage(driver);

        uploadFilePage.openUploadPage();
        String actualHeaderText = uploadFilePage.getHeaderText();
        String expectedHeaderText = "File Uploader";
        Assert.assertEquals(expectedHeaderText,actualHeaderText);
        uploadFilePage.uploadImage();
        String actualHeaderTextAfterUpload = uploadFilePage.getHeaderTextAfterUpload();
        String expectedHeaderTextAfterUpload = "File Uploaded!";
        Assert.assertTrue(expectedHeaderTextAfterUpload.contains(actualHeaderTextAfterUpload));
        String acutualUploadedFile = uploadFilePage.getUploadedFile();
        String expectedUploadedFile ="91231.jpg";
        Assert.assertTrue(expectedUploadedFile.contains(acutualUploadedFile));

    }
}
