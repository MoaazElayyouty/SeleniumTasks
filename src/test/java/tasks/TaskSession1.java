package tasks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskSession1 {

    @Test
    public void validLogin() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        String actualMessage= driver.findElement(By.xpath("//h2[contains(text(),'Login Page')]")).getText();
        String expectedMessage = "Login Page";
        Assert.assertEquals(actualMessage,expectedMessage);
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");
        String password = System.getenv("PASSWORD");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//*[contains(@class, 'radius')]")).click();
        String successLoginMessage = driver.findElement(By.cssSelector(".flash.success")).getText();
        String expectedSuccessMessage= "You logged into a secure area!";
        Assert.assertTrue(successLoginMessage.contains(expectedSuccessMessage));
        driver.quit();

    }

    @Test
    public void inValidLogin() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Form Authentication")).click();
        String actualMessage= driver.findElement(By.xpath("//h2[contains(text(),'Login Page')]")).getText();
        String expectedMessage = "Login Page";
        Assert.assertEquals(actualMessage,expectedMessage);
        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("[name='password']")).sendKeys("password");
        driver.findElement(By.xpath("//*[contains(@class, 'radius')]")).click();
        String getActualErrorMessage = driver.findElement(By.id("flash")).getText();
        Assert.assertTrue(getActualErrorMessage.contains("Your password is invalid!"));
        driver.quit();
    }
}
