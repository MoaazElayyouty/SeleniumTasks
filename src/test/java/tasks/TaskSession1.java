package tasks;

//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskSession1 {

    @Test
    public void validLogin() {
//        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();

        String actualMessage = driver.findElement(By.xpath("//h2[contains(text(),'Login Page')]")).getText();
        Assert.assertEquals(actualMessage, "Login Page");

        driver.findElement(By.id("username")).sendKeys("tomsmith");

        String password = System.getenv("PASSWORD");
        Assert.assertNotNull(password, "Environment variable 'PASSWORD' is not set");

        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.cssSelector(".radius")).click();

        String successLoginMessage = driver.findElement(By.cssSelector(".flash.success")).getText();
        Assert.assertTrue(successLoginMessage.contains("You logged into a secure area!"));

        driver.quit();
    }

    @Test
    public void inValidLogin() {
//        WebDriverManager.chromedriver().setup();  // ✅ Setup WebDriver

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();

        String actualMessage = driver.findElement(By.xpath("//h2[contains(text(),'Login Page')]")).getText();
        Assert.assertEquals(actualMessage, "Login Page");

        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.name("password")).sendKeys("wrongpassword");
        driver.findElement(By.cssSelector(".radius")).click();

        String errorMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(errorMessage.contains("Your password is invalid!"));

        driver.quit();
    }
}
