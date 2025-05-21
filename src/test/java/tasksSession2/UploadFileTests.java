package tasksSession2;

import Pages.UploadFilePage;
import org.testng.annotations.Test;

public class UploadFileTests extends DriverBase {

    @Test

    public void uploadImage (){
        UploadFilePage uploadFilePage = new UploadFilePage(driver);

        uploadFilePage.openUploadPage();
        String expectedHeaderText = uploadFilePage.getHeaderText();
        uploadFilePage.uploadImage();


    }
}
