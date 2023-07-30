package org.example.StepDef;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Hooks {

   public static WebDriver driver;
    @Before
    public static void openBrowser(){
        driver=new ChromeDriver();

        driver.manage().window().maximize(); //full window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//IMPLICIT WAIT
        driver.get("https://www.saucedemo.com");

    }
    @After
    public static void closeBrowser() {
        driver.quit();
    }

}
