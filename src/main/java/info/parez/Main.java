package info.parez;

//import java.lang.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Main {

    public static void main(String[] args) {
        String test = "Hello ChromeDriver";
        System.out.println(test);
    }

    @Before
    public void setup() {
        //
    }

    @Test
    public void searchTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        EntryPoint entryPoint = new EntryPoint(driver);
        entryPoint.searchFor("Selenium");
        driver.quit();
    }

    @After
    public void tearDown(){
        System.exit(0);
    }
}
