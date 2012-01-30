package selenium.initial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import selenium.SearchPage;

public class SimpleSearchPage implements SearchPage {
    private WebDriver driver;

    @Override
    public void search(final String query) {
        driver.findElement(By.id("text")).sendKeys(query);
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
    }

    @Override
    public void init(final WebDriver driver) {
        this.driver = driver;
    }
}
