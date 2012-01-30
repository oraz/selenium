package selenium.step2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import selenium.SearchPage;
import selenium.step2.elements.Button;
import selenium.step2.elements.TextField;

public class ExtendedSearchPage implements SearchPage {
    @FindBy(id = "text")
    private TextField searchField;

    @FindBy(css = "input[type=\"submit\"]")
    private Button searchButton;

    @Override
    public void search(final String query) {
        searchField.clearAndType(query);
        searchButton.click();
    }

    @Override
    public void init(final WebDriver driver) {
        PageFactory.initElements(new ExtendedFieldDecorator(driver), this);
    }
}
