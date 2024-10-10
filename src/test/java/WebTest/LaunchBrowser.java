package WebTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LaunchBrowser {
  WebDriver driver;

    @Test
    public void launchChromeTest(){

        driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        System.out.println(driver.getTitle());

    }
    @Test
    public void launchFirefoxTest(){

        driver=new FirefoxDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(4000));
        System.out.println(driver.getTitle());

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
