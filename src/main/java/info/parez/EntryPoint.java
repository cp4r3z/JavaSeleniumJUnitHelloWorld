package info.parez;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EntryPoint {
    WebDriver driver;

    // Selectors
    By searchBar = By.name("q");


    public EntryPoint(WebDriver driver) {
        this.driver = driver;
    }

    // Search for text
    public void searchFor(String text) {
        WebElement searchBox = driver.findElement(searchBar);
        searchBox.sendKeys("Selenium");
        searchBox.sendKeys(Keys.RETURN);
    }
}
