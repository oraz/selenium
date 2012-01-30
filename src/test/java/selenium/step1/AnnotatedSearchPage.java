package selenium.step1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.SearchPage;

public class AnnotatedSearchPage implements SearchPage {
    @FindBy(id = "text")
    private WebElement searchField;

    @FindBy(css = "input[type=\"submit\"]")
    @CacheLookup
    private WebElement searchButton;

    @Override
    public void search(final String query) {
        searchField.sendKeys(query);
        searchButton.click();
    }

    @Override
    public void init(final WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
}
