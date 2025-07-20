package Tests;

import Pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUpDriver() {
        // إعداد خيارات Headless Mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // تشغيل بدون واجهة رسومية
        options.addArguments("--no-sandbox"); // لتفادي مشاكل CI
        options.addArguments("--disable-dev-shm-usage"); // منع مشاكل الذاكرة المشتركة

        // تشغيل Chrome بـ options
        driver = new ChromeDriver(options);

        // باقي الإعدادات
        driver.get("https://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);
    }

    @AfterClass
    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
