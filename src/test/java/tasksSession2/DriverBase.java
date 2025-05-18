package tasksSession2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class DriverBase {

    protected WebDriver driver;


    @BeforeClass
    public void setUpDriver() {
        driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
    }

    @AfterClass
    public void quitDriver() {

        if (driver != null) {
            driver.quit();
        }

    }
}


