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

public class Main {

    public static void main(String[] args) {
        String test = "Hello ChromeDriver";
        System.out.println(test);

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

//        WebElement searchBox = driver.findElement(By.name("q"));
//        searchBox.sendKeys("Selenium");
//        searchBox.sendKeys(Keys.RETURN);


        //driver.close();
        driver.quit();

        System.exit(0);
    }
}
